package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Ana","Mere", LocalDate.of(1982,5,2),"Orsova",4000,"Java");
        Employee anaEmployee = programmer;
        Programmer anaPerson = programmer;

        System.out.println(programmer.getLanguage());
        System.out.println(anaEmployee.getDateOfEmployment());
        System.out.println(anaPerson.getFirstname());
    }
}
