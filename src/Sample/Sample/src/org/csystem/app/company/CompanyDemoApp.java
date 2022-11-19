package org.csystem.app.company;

public class CompanyDemoApp {
    private static Manager getManager()
    {
        Manager m = new Manager();

        m.setCitizenId("12345678912");
        m.setName("Ali");
        m.setAddress("Mecidiyeköy");
        m.setDepartment("Pazarlama");
        m.setSalary(40000);

        return m;
    }

    private static Worker getWorker()
    {
        Worker w = new Worker();

        w.setCitizenId("12345678914");
        w.setName("Veli");
        w.setAddress("Şişli");
        w.setFeePerHour(300);
        w.setHourPerDay(8);

        return w;
    }

    private static ProjectWorker getProjectWorker()
    {
        ProjectWorker w = new ProjectWorker();

        w.setCitizenId("12345678916");
        w.setName("Selami");
        w.setAddress("Fatih");
        w.setFeePerHour(300);
        w.setHourPerDay(8);
        w.setProjectName("Whatsapp extesion");
        w.setExtraFee(10000);

        return w;
    }


    private static SalesManager getSalesManager()
    {
        SalesManager sm = new SalesManager();

        sm.setCitizenId("12345678912");
        sm.setName("Atakan");
        sm.setAddress("Ankara");
        sm.setDepartment("Yazılım");
        sm.setSalary(40000);
        sm.setExtra(15000);

        return sm;
    }

    public static void run()
    {
        HumanResources hr = new HumanResources();
        Manager m = getManager();
        Worker w = getWorker();
        ProjectWorker pw = getProjectWorker();
        SalesManager sm = getSalesManager();

        //...

        hr.payInsurance(m);
        hr.payInsurance(w);
        hr.payInsurance(pw);
        hr.payInsurance(sm);
    }
}
