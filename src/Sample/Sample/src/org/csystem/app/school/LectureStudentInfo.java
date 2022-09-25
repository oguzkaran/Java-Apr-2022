package org.csystem.app.school;

import static java.lang.Math.round;

public class LectureStudentInfo {
    public String studentName;
    public String lectureName;
    public String midtermDate;
    public String finalDate;
    public int midTermGrade;
    public int finalGrade;

    //...

    public int getGrade()
    {
        return (int)round(midTermGrade * 0.4 + finalGrade * 0.6);
    }

    //...
}
