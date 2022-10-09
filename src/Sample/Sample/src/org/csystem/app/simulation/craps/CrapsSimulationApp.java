package org.csystem.app.simulation.craps;

public class CrapsSimulationApp {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);

        for (;;) {
            System.out.print("Kaç kez oynatmak istersiniz?");
            int count = Integer.parseInt(kb.nextLine());

            if (count <= 0)
                break;

            System.out.println("-------------------------------------------------");
            CrapsSimulation simulation = new CrapsSimulation();

            simulation.run(count);
            System.out.printf("Kazanma olasılığı: %f%n", simulation.getProbability());
            System.out.println("-------------------------------------------------");

        }
    }
}
