/*------------------------------------------------------------------
	FILE		: StringUtil.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 02.10.2022
	
	StringUtil class for string operations
	
	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free	
------------------------------------------------------------------ */
package org.csystem.util.string;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;

public class StringUtil {
    public static String capitalize(String str)
    {
        return str.isEmpty() ? "" : Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
    }

    public static String capitalizeFirst(String s)
    {
        int idx = findFirstLetterIndex(s);

        return idx == -1 ? s : s.substring(0, idx) + Character.toUpperCase(s.charAt(idx)) + s.substring(idx + 1).toLowerCase();
    }

    public static int countString(String s1, String s2)
    {
        int count = 0;

        for (int i = 0; (i = s1.indexOf(s2, i)) != -1; ++count, ++i)
            ;

        return count;
    }

    public static int countStringIgnoreCase(String s1, String s2)
    {
        return countString(s1.toLowerCase(), s2.toLowerCase());
    }

    public static int findFirstLetterIndex(String str)
    {
        int i;
        int len = str.length();

        for (i = 0; i < len && !Character.isLetter(str.charAt(i)); ++i)
            ;

        return i == len ? -1 : i;
    }

    public static String getFirstLongestPalindrome(String s)
    {
        String longest = "";
        int begin = 0;
        int len = s.length();

        while (begin != len) {
            int end = len;

            while (begin != end) {
                String str = s.substring(begin, end--);
                if (str.length() > 1 && isPalindrome(str) && longest.length() < str.length())
                    longest = str;
            }

            ++begin;
        }


        return longest;
    }

    public static String getFirstShortestPalindrome(String s)
    {
        String shortest = s;
        int begin = 0;
        int len = s.length();

        while (begin != len) {
            int end = len;

            while (begin != end) {
                String str = s.substring(begin, end--);
                if (str.length() > 1 && isPalindrome(str) && str.length() < shortest.length())
                    shortest = str;
            }

            ++begin;
        }


        return shortest;
    }

    public static String getLastLongestPalindrome(String s)
    {
        String longest = "";

        int end = s.length();

        while (end != 0) {
            int begin = 0;

            while (begin != end) {
                String str = s.substring(begin++, end);
                if (str.length() > 1 && isPalindrome(str) && longest.length() < str.length())
                    longest = str;
            }

            --end;
        }

        return longest;
    }

    public static String getLastShortestPalindrome(String s)
    {
        String shortest = s;

        int end = s.length();

        while (end != 0) {
            int begin = 0;

            while (begin != end) {
                String str = s.substring(begin++, end);
                if (str.length() > 1 && isPalindrome(str) && str.length() < shortest.length())
                    shortest = str;
            }

            --end;
        }

        return shortest;
    }

    public static String getRandomTextTR(Random random, int count)
    {
        return getRandomText(random, count, "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ");
    }

    public static String getRandomTextTR(int count)
    {
        return getRandomTextTR(new Random(), count);
    }

    public static String getRandomTextEN(Random random, int count)
    {
        return getRandomText(random, count, "abcdefghijklmnopqrstuwxvyzABCDEFGHIJKLMNOPQRSTUWXVYZ");
    }

    public static String getRandomTextEN(int count)
    {
        return getRandomTextEN(new Random(), count);
    }

    public static String getRandomText(Random random, int count, String sourceText)
    {
        char [] c = new char[count];
        int len = sourceText.length();

        for (int i = 0; i < count; ++i)
            c[i] = sourceText.charAt(random.nextInt(len));

        return String.valueOf(c);
    }

    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() - 1;
        boolean cLeftFound = false;
        char cLeft = '\0', cRight = '\0';

        while (left < right) {
            if (!cLeftFound) {
                cLeft = Character.toLowerCase(s.charAt(left));

                if (!Character.isLetter(cLeft)) {
                    ++left;
                    continue;
                }

                cLeftFound = true;
            }

            cRight= Character.toLowerCase(s.charAt(right));

            if (!Character.isLetter(cRight)) {
                --right;
                continue;
            }

            if (cLeft != cRight)
                return false;

            ++left;
            --right;
            cLeftFound = false;
        }

        return true;
    }

    public static boolean isPangram(String s, String alphabet)
    {
        int len = alphabet.length();

        for (int i = 0; i < len; ++i)
            if (s.indexOf(alphabet.charAt(i)) == -1)
                return false;

        return true;
    }

    public static boolean isPangramEN(String s)
    {
        return isPangram(s.toLowerCase(), "abcdefghijklmnopqrstuwxvyz");
    }

    public static boolean isPangramTR(String s)
    {
        return isPangram(s.toLowerCase(), "abcçdefgğhıijklmnoöprsştuüvyz");
    }


    public static String join(String [] str, char ch)
    {
        return join(str, ch + "");
    }

    public static String join(String [] str, String delimiter)
    {
        String result = "";

        for (String s : str)
            result += s + delimiter;

        return result.substring(0, result.length() - delimiter.length());
    }

    public static String join(String [] str, char ch , boolean removeBlanks)
    {
        return join(str, ch + "", removeBlanks);
    }

    public static String join(String [] str, String delimiter, boolean removeBlanks)
    {
        String result = "";

        for (String s : str) {
            if (removeBlanks && s.isBlank())
                continue;

            result += s + delimiter;
        }

        return result.substring(0, result.length() - delimiter.length());
    }

    public static String padLeading(String s, int len, char ch)
    {
        int length = s.length();

        return len <= length ? s : (ch + "").repeat(len - length) + s;
    }

    public static String padLeading(String s, int len)
    {
        return padLeading(s, len, ' ');
    }

    public static String padTrailing(String s, int len, char ch)
    {
        int length = s.length();

        return len <= length ? s : s + (ch + "").repeat(len - length);
    }

    public static String padTrailing(String s, int len)
    {
        return padTrailing(s, len, ' ');
    }

    public static String reverse(String str)
    {
        char [] c = str.toCharArray();

        ArrayUtil.reverse(c);

        return String.valueOf(c);
    }
}


