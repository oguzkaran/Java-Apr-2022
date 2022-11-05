package org.csystem.app.school;

import org.csystem.util.datetime.Date;

import static java.lang.Math.round;

public class LectureStudentInfo {
    private String m_studentName;
    private String m_lectureName;
    private Date m_midtermDate;
    private Date m_finalDate;
    private int m_midTermGrade;
    private int m_finalGrade;

    //...


    public String getStudentName()
    {
        return m_studentName;
    }

    public void setStudentName(String studentName)
    {
        m_studentName = studentName;
    }

    public String getLectureName()
    {
        return m_lectureName;
    }

    public void setLectureName(String lectureName)
    {
        m_lectureName = lectureName;
    }

    public Date getMidtermDate()
    {
        return m_midtermDate;
    }

    public void setMidtermDate(Date midtermDate)
    {
        m_midtermDate = midtermDate;
    }

    public Date getFinalDate()
    {
        return m_finalDate;
    }

    public void setFinalDate(Date finalDate)
    {
        m_finalDate = finalDate;
    }

    public int getMidTermGrade()
    {
        return m_midTermGrade;
    }

    public void setMidTermGrade(int midTermGrade)
    {
        m_midTermGrade = midTermGrade;
    }

    public int getFinalGrade()
    {
        return m_finalGrade;
    }

    public void setFinalGrade(int finalGrade)
    {
        m_finalGrade = finalGrade;
    }

    public int getGrade()
    {
        return (int)round(m_midTermGrade * 0.4 + m_finalGrade * 0.6);
    }

    //...
}
