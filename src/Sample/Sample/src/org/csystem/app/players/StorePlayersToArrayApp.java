package org.csystem.app.players;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StorePlayersToArrayApp {

    public static void run()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Başlangıç \"capacity\" değerini giriniz:");
        Player [] players = new Player[Integer.parseInt(kb.nextLine())];

        int idx = 0;

        for (;;) {
            System.out.print("Oyuncunun tam adını giriniz:");
            String fullName = kb.nextLine();

            if ("elma".equals(fullName))
                break;

            System.out.print("Oyuncunun adını giriniz:");
            String name = kb.nextLine();

            System.out.print("Oyuncunun puanını giriniz:");
            int score = Integer.parseInt(kb.nextLine());

            if (idx == players.length)
                players = Arrays.copyOf(players, players.length * 2);

            players[idx++] = new Player().setFullName(fullName).setName(name).setScore(score);

            System.out.printf("Capacity:%d%n", players.length);
            System.out.printf("Size:%d%n", idx);
        }
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < idx; ++i)
            System.out.println(players[i].toString());

        System.out.printf("Capacity:%d%n", players.length);
        System.out.printf("Size:%d%n", idx);

        System.out.print("Tekrar yapıyor musunuz?");
    }
}
