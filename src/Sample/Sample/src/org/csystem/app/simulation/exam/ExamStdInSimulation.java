package org.csystem.app.simulation.exam;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamStdInSimulation {
    private final String m_lectureName;
    private final String m_countPrompt;
    private final String m_stepPrompt;
    private int [][] m_grades;
    private double [] m_averages;
    private double m_average;

    private void configureGrades(Scanner kb)
    {
        System.out.print(m_countPrompt + ":");
        m_grades = new int[Integer.parseInt(kb.nextLine())][];
        m_averages = new double[m_grades.length];
    }

    private void fillGrades()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);

        configureGrades(kb);
        for (int i = 0; i < m_grades.length; ++i) {
            System.out.printf("%d%s:", i + 1, m_stepPrompt);
            int count = Integer.parseInt(kb.nextLine());
            m_grades[i] = ArrayUtil.getRandomArray(r, count, 0, 101);
        }
    }

    private void findAverages()
    {
        int totalNumberStudents = 0;
        int totalGrades = 0;

        for (int i = 0; i < m_grades.length; ++i) {
             int total = ArrayUtil.sum(m_grades[i]);

             m_averages[i] = (double)total / m_grades[i].length;
             totalNumberStudents += m_grades[i].length;
             totalGrades += total;
        }

        m_average = (double)totalGrades / totalNumberStudents;
    }

    public ExamStdInSimulation(String lectureName, String countPrompt, String stepPrompt)
    {
        m_lectureName = lectureName;
        m_countPrompt = countPrompt;
        m_stepPrompt = stepPrompt;
    }

    public String getLectureName()
    {
        return m_lectureName;
    }

    public int getGrade(int i, int k)
    {
        return m_grades[i][k];
    }

    public double getAverage()
    {
        return m_average;
    }

    public double getAverage(int i)
    {
        return m_averages[i];
    }

    public void run()
    {
        fillGrades();
        findAverages();
    }

    public void printGrades(String prompt)
    {
        System.out.printf("%s%s:%n", m_lectureName, prompt);
        ArrayUtil.print(2, m_grades);
    }

    public void printReport(String gradePrompt, String averagesPrompt, String averagePrompt)
    {
        printGrades(gradePrompt);
        for (int i = 0; i < m_grades.length; ++i)
            System.out.printf("%d%s:%f%n", i + 1, averagesPrompt, m_averages[i]);

        System.out.printf("%s:%f%n", averagePrompt, m_average);
    }
}
