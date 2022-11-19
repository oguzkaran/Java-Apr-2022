package org.csystem.app.company;

public class HumanResources {
    //...

    public void payInsurance(Employee employee)
    {
        System.out.printf("Citizen Id:%s%n", employee.getCitizenId());
        System.out.printf("Name:%s%n", employee.getName());
        System.out.printf("Address:%s%n", employee.getAddress());
        System.out.println("------------------------------------------------------");
    }
}
