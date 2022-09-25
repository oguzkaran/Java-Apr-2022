package org.csystem.app.lottery;

import org.csystem.util.array.ArrayUtil;

import java.util.Scanner;

public class NumericLotteryApp {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        NumericLottery numericLottery = new NumericLottery();

        for (;;) {
            System.out.print("Kaç tane kupon oynamak istersiniz?");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;

            ArrayUtil.print(2, numericLottery.getNumbers(count));
        }

        System.out.println("Tekrar yapıyor musunuz?");
    }
}
