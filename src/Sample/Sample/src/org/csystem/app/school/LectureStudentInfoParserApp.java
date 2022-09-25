/*-----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Klavyden aşağıdaki formatta alınan bilgiyi ayrıştırarak ekrana sonuçları yazdıran programı
	aşağıdaki açıklamalar göre yazınız:
	<ad soyad>:<ders adı>:<gg-aa-yyyy>:>:<gg-aa-yyyy><arasınav notu>:<final notu>
	Oğuz Karan:Matematik:04-05-2022:04-06-2022:40:35
	Adile Çaça:Matematik:12-05-2022:06-06-2022:90:95
	Aykut Abuhan:Diferansiyel Denklemler:14-05-2022:10-06-2022:79:85
	Burak Maral:Mikroişlemciler:29-10-2022:31-12-2022:65:80

	Açıklamalar:
		- Format geçerlilik kontrolü yapılmayacaktır

		- Formatta arasınav ve final notlarına arasınav * 0.4 + final * 0.6 formülü ile geçme notu hesaplanacak ve sınav
		tarihleri hangi güne geldiği bilgisine göre Türkçe olarak yazdırılacaktır

		- Ekran çıktısında "Geçti" ya da "Kaldı" bilgisi de olacaktır. Geçme notu 50 ve üstünde ise öğrenci geçmiş sayılacaktır

		- Geçnme notu round ile ile tam sayı olarak elde edilecektir

		- İleride daha iyisi yazılacaktır

		Örnek Çıktı:
		-------------------------------------------------------
		Ad Soyad: Oğuz Karan
		Ders Adı: Matematik
		Arasınav Tarihi: 4 Mayıs 2022 Çarşamba
		Final Tarihi: 4 Haziran 2022 Cumartesi
		Arasınav Notu:56
		Final Notu: 78
		Geçme Notu: 69
		Sonuç: Geçti
		-------------------------------------------------------
 -----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app.school;

import java.util.Scanner;

public class LectureStudentInfoParserApp {
    public static void printReport(LectureStudentInfo info)
    {
        int grade = info.getGrade();

        System.out.println("--------------------------------------------------");
        System.out.printf("Adı Soyadı: %s%n", info.studentName);
        System.out.printf("Ders Adı: %s%n", info.lectureName);
        System.out.printf("Arasınav Tarihi: %s%n", info.midtermDate);
        System.out.printf("Final Tarihi: %s%n", info.finalDate);
        System.out.printf("Arasınav Notu: %d%n", info.midTermGrade);
        System.out.printf("Final Notu: %d%n", info.finalGrade);
        System.out.printf("Geçme Notu: %d%n", grade);
        System.out.printf("Sonuç: %s%n", grade >= 50 ? "Geçti" : "Kaldı");
        System.out.println("--------------------------------------------------");
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        for (;;) {
            System.out.print("Formatlı yazıyı giriniz:");
            String str = kb.nextLine().strip();

            if ("elma".equals(str))
                break;

            LectureStudentInfoParser parser = new LectureStudentInfoParser(str);

            printReport(parser.lectureStudentInfo);
        }
    }
}
