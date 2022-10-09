package org.csystem.app.simulation.exam;

public class ExamStdInSimulationApp {
    public static void run()
    {
        ExamStdInSimulation physicsSimulation = new ExamStdInSimulation("Fizik", "Şube sayısını giriniz", ". şube öğrenci sayısını giriniz");

        physicsSimulation.run();
        physicsSimulation.printReport(" dersi notları", ". şube ortalaması", "Okul ortalaması");
    }
}
