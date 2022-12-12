package org.csystem.app.players;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StorePlayersApp {

    public static void run()
    {
        Random r = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.print("Başlangıç \"capacity\" değerini giriniz:");
        ArrayList players = new ArrayList(Integer.parseInt(kb.nextLine()));

        for (;;) {
            System.out.print("Oyuncunun tam adını giriniz:");
            String fullName = kb.nextLine();

            if ("elma".equals(fullName))
                break;

            System.out.print("Oyuncunun adını giriniz:");
            String name = kb.nextLine();

            System.out.print("Oyuncunun puanını giriniz:");
            int score = Integer.parseInt(kb.nextLine());

            players.add(new Player().setFullName(fullName).setName(name).setScore(score));
            System.out.printf("Size:%d%n", players.size());
        }
        System.out.println("------------------------------------------------------");

        for (Object o : players)
            System.out.println(((Player)o).toString());

        System.out.printf("Size:%d%n", players.size());
        System.out.print("Tekrar yapıyor musunuz?");
    }
}
