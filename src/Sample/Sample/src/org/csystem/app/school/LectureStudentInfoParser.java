package org.csystem.app.school;

import org.csystem.app.datetime.DateUtil;

public class LectureStudentInfoParser {
    public LectureStudentInfo lectureStudentInfo;

    public static String getDateStr(String str)
    {
        String [] dateInfo = str.split("[-]");

        int day = Integer.parseInt(dateInfo[0]);
        int month = Integer.parseInt(dateInfo[1]);
        int year = Integer.parseInt(dateInfo[2]);

        return DateUtil.getDateStrTR(day, month, year);
    }

    public LectureStudentInfoParser(String dataStr)
    {
        //...

        String [] lectureStudentInfoStr = dataStr.split("[:]+");

        //...

        lectureStudentInfo = new LectureStudentInfo();
        lectureStudentInfo.studentName = lectureStudentInfoStr[0];
        lectureStudentInfo.lectureName = lectureStudentInfoStr[1];
        lectureStudentInfo.midtermDate= getDateStr(lectureStudentInfoStr[2]);
        lectureStudentInfo.finalDate = getDateStr(lectureStudentInfoStr[3]);
        lectureStudentInfo.midTermGrade = Integer.parseInt(lectureStudentInfoStr[4]);
        lectureStudentInfo.finalGrade = Integer.parseInt(lectureStudentInfoStr[5]);
    }
}
