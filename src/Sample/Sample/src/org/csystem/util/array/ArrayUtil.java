/*------------------------------------------------------------------
	FILE		: ArrayUtil.java
	AUTHOR		: Java-Apr-2022 Group
	LAST UPDATE	: 08.10.2022

	Utility ArrayUtil class for array operations

	Copyleft (c) 1993 by C and System Programmers Association
	All Rights Free
------------------------------------------------------------------ */
package org.csystem.util.array;

import java.util.Random;

import static java.lang.Math.floor;

public class ArrayUtil {

    private ArrayUtil()
    {}

    private static void bubbleSortAscending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length - 1 - i; ++k)
                if (a[k + 1] < a[k])
                    swap(a, k, k + 1);
    }

    private static void bubbleSortDescending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length - 1 - i; ++k)
                if (a[k] < a[k + 1])
                    swap(a, k, k + 1);
    }

    private static void selectionSortAscending(int [] a)
    {
        int min, minIndex;

        for (int i = 0; i < a.length - 1; ++i) {
            min = a[i];
            minIndex = i;

            for (int k = i + 1; k < a.length; ++k)
                if (a[k] < min) {
                    min = a[k];
                    minIndex = k;
                }

            a[minIndex] = a[i];
            a[i] = min;
        }
    }

    private static void selectionSortDescending(int [] a)
    {
        int max, maxIndex;

        for (int i = 0; i < a.length - 1; ++i) {
            max = a[i];
            maxIndex = i;

            for (int k = i + 1; k < a.length; ++k)
                if (max < a[k]) {
                    max = a[k];
                    maxIndex = k;
                }

            a[maxIndex] = a[i];
            a[i] = max;
        }
    }

    public static void addBy(int [] a, int val)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] += val;
    }

    public static int [][] addMatrices(int [][] m1, int [][] m2)
    {
        int [][] total = new int[m1.length][m1[0].length];
        int row = m1.length;
        int col = m1[0].length;

        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                total[i][j] = m1[i][j] + m2[i][j];

        return total;
    }

    public static void addMatrixBy(int [][] m, int val)
    {
        for (int i = 0; i < m.length; ++i)
            for (int j = 0; j < m[i].length; ++j)
                m[i][j] += val;
    }

    public static double average(int [] a)
    {
        return sum(a) / (double)a.length;
    }

    public static void bubbleSort(int [] a)
    {
        bubbleSort(a, false);
    }

    public static void bubbleSort(int [] a, boolean descending)
    {
        if (descending)
            bubbleSortDescending(a);
        else
            bubbleSortAscending(a);
    }

    public static void drawHistogram(int [] data, int countMaxVal, char ch)
    {
        int maxVal = max(data);

        for (int val : data) {
            int charCount = (int)floor(val * countMaxVal / (double)maxVal);

            while (charCount-- > 0)
                System.out.print(ch);
            System.out.println();
        }
    }

    public static void fillRandomArray(Random random, int [] a, int min, int bound)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] = random.nextInt(min, bound);
    }

    public static int [] getHistogramData(int [] a, int n)
    {
        int [] counts = new int[n + 1];

        for (int val : a)
            ++counts[val];

        return counts;
    }

    public static int [] getRandomArray(int count, int min, int bound)
    {
        return getRandomArray(new Random(), count, min, bound);
    }

    public static int [] getRandomArray(Random random, int count, int min, int bound)
    {
        int [] a = new int[count];

        fillRandomArray(random, a, min, bound);

        return a;
    }

    public static int [][] getRandomMatrix(int m, int n, int min, int bound)
    {
        return getRandomMatrix(new Random(), m, n, min, bound);
    }

    public static int [][] getRandomMatrix(Random r, int m, int n, int min, int bound)
    {
        int [][] result = new int[m][];

        for (int i = 0; i < m; ++i)
            result[i] = getRandomArray(r, n, min, bound);

        return result;
    }

    public static int [][] getRandomSquareMatrix(int n, int min, int bound)
    {
        return getRandomSquareMatrix(new Random(), n, min, bound);
    }

    public static int [][] getRandomSquareMatrix(Random r, int n, int min, int bound)
    {
        return getRandomMatrix(r, n, n, min, bound);
    }

    public static boolean isMatrix(int [][] a)
    {
        for (int i = 1; i < a.length; ++i)
            if (a[i].length != a[0].length)
                return false;

        return true;
    }

    public static boolean isSquareMatrix(int [][] a)
    {
        return isMatrix(a) && a.length == a[0].length;
    }

    public static int max(int [] a)
    {
        int result = a[0];

        for (int i = 1; i < a.length; ++i)
            result = Math.max(a[i], result);

        return result;
    }

    public static int min(int [] a)
    {
        int result = a[0];

        for (int i = 1; i < a.length; ++i)
            result = Math.min(a[i], result);

        return result;
    }

    public static void multiplyBy(int [] a, int val)
    {
        for (int i = 0; i < a.length; ++i)
            a[i] *= val;
    }

    public static int [][] multiplyMatrices(int [][] m1, int [][] m2)
    {
        int [][] result = new int[m1.length][m2[0].length];

        int row1 = result.length;
        int col1 = result[0].length;
        int row2 = m2.length;

        for (int i = 0; i < row1; ++i)
            for (int j = 0; j < col1; ++j)
                for (int k = 0; k < row2; ++k)
                    result[i][j] += m1[i][k] * m2[k][j];

        return result;
    }

    public static int partition(int [] a, int threshold)
    {
        int partitionIndex = 0;

        while (partitionIndex != a.length && a[partitionIndex] < threshold)
            ++partitionIndex;

        if (partitionIndex == a.length)
            return partitionIndex;

        for (int i = partitionIndex + 1; i < a.length; ++i)
            if (a[i] < threshold)
                swap(a, i, partitionIndex++);

        return partitionIndex;
    }

    public static void print(int [] a)
    {
        print(1, a);
    }

    public static void print(int n, int [] a)
    {
        String fmt = String.format("%%0%dd ", n);

        for (int val : a)
            System.out.printf(fmt, val);

        System.out.println();
    }

    public static void print(int [][] a)
    {
        print(1, a);
    }

    public static void print(int n, int [][] a)
    {
        for (int[] ints : a)
            print(n, ints);
    }

    public static void reverse(int [] a)
    {
        int left = 0;
        int right = a.length - 1;

        while (left < right)
            swap(a, left++, right--);
    }

    public static void reverse(char [] a)
    {
        int left = 0;
        int right = a.length - 1;

        while (left < right)
            swap(a, left++, right--);
    }

    public static void selectionSort(int [] a)
    {
        selectionSort(a, false);
    }

    public static void selectionSort(int [] a, boolean descending)
    {
        if (descending)
            selectionSortDescending(a);
        else
            selectionSortAscending(a);
    }

    public static int [][] subtractMatrices(int [][] m1, int [][] m2)
    {
        int [][] total = new int[m1.length][m1[0].length];
        int row = m1.length;
        int col = m1[0].length;

        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                total[i][j] = m1[i][j] - m2[i][j];

        return total;
    }

    public static int sum(int [] a)
    {
        int total = 0;

        for (int val : a)
            total += val;

        return total;
    }
    public static int sumDiagonal(int [][] a)
    {
        int total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i][i];

        return total;
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }

    public static void swap(double [] a, int i, int k)
    {
        double temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }

    public static void swap(char [] a, int i, int k)
    {
        char temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }

    public static int [][] transpose(int [][] a)
    {
        int [][] result = new int[a[0].length][a.length];

        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[i].length; ++j)
                result[j][i] = a[i][j];

        return result;
    }
}
