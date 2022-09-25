package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

public class IsMatrixTest {
    public static void run()
    {
        int [][] a = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int [][] b = {{1, 2}, {3, 4}, {5, 6, 7}, {8, 9}};

        System.out.println(ArrayUtil.isMatrix(a) ? "Matris" : "Matris değil");
        System.out.println(ArrayUtil.isMatrix(b) ? "Matris" : "Matris değil");
        System.out.println("Tekrar yapıyor musunuz=?");
    }
}
