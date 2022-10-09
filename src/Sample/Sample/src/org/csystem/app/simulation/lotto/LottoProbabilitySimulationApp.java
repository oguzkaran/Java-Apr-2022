package org.csystem.app.simulation.lotto;

public class LottoProbabilitySimulationApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for (; ; ) {
            System.out.print("Kaç kez oynatmak istersiniz?");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;

            LottoProbabilitySimulation simulation = new LottoProbabilitySimulation();

            simulation.run(count);

            System.out.printf("1.oyun için kazanma olasılığı:%f%n", simulation.getGame1Prob());
            System.out.printf("2.oyun için kazanma olasılığı:%f%n", simulation.getGame2Prob());
            System.out.printf("3.oyun için kazanma olasılığı:%f%n", simulation.getGame3Prob());
        }

    }
}