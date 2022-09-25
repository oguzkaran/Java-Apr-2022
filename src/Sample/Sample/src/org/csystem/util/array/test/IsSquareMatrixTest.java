package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

public class IsSquareMatrixTest {
    public static void run()
    {
        int [][] a = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int [][] b = {{1, 2}, {3, 4}};

        System.out.println(ArrayUtil.isSquareMatrix(a) ? "Kare matris" : "Kare matris değil");
        System.out.println(ArrayUtil.isSquareMatrix(b) ? "Kare matris" : "Kare matris değil");
        System.out.println("Tekrar yapıyor musunuz=?");
    }
}
