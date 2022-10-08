package org.csystem.app.school;

import org.csystem.app.datetime.DateUtil;

public class LectureStudentInfoParser {
    private LectureStudentInfo m_lectureStudentInfo;

    private static String getDateStr(String str)
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

        m_lectureStudentInfo = new LectureStudentInfo();
        m_lectureStudentInfo.setStudentName(lectureStudentInfoStr[0]);
        m_lectureStudentInfo.setLectureName(lectureStudentInfoStr[1]);
        m_lectureStudentInfo.setMidtermDate(getDateStr(lectureStudentInfoStr[2]));
        m_lectureStudentInfo.setFinalDate(getDateStr(lectureStudentInfoStr[3]));
        m_lectureStudentInfo.setMidTermGrade(Integer.parseInt(lectureStudentInfoStr[4]));
        m_lectureStudentInfo.setFinalGrade(Integer.parseInt(lectureStudentInfoStr[5]));
    }

    public LectureStudentInfo getLectureStudentInfo()
    {
        return m_lectureStudentInfo;
    }
}
