package org.csystem.app.school;

import org.csystem.util.datetime.Date;

public class LectureStudentInfoParser {
    private final LectureStudentInfo m_lectureStudentInfo;

    private static Date getDateByString(String str)
    {
        String [] dateInfo = str.split("[-]");

        return new Date(Integer.parseInt(dateInfo[0]),  Integer.parseInt(dateInfo[1]),  Integer.parseInt(dateInfo[2]));
    }

    public LectureStudentInfoParser(String dataStr)
    {
        //...

        String [] lectureStudentInfoStr = dataStr.split("[:]+");

        //...

        m_lectureStudentInfo = new LectureStudentInfo();
        m_lectureStudentInfo.setStudentName(lectureStudentInfoStr[0]);
        m_lectureStudentInfo.setLectureName(lectureStudentInfoStr[1]);
        m_lectureStudentInfo.setMidtermDate(getDateByString(lectureStudentInfoStr[2]));
        m_lectureStudentInfo.setFinalDate(getDateByString(lectureStudentInfoStr[3]));
        m_lectureStudentInfo.setMidTermGrade(Integer.parseInt(lectureStudentInfoStr[4]));
        m_lectureStudentInfo.setFinalGrade(Integer.parseInt(lectureStudentInfoStr[5]));
    }

    public LectureStudentInfo getLectureStudentInfo()
    {
        return m_lectureStudentInfo;
    }
}
