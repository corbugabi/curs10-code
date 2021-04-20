package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;

public class DataBaseAdmin extends Employee{
    private final String dbTechnology;
    private long salary;

    public DataBaseAdmin(String firstName, String lastName, LocalDate birthday,String adress, long salary, String dbTech){
        super(firstName, lastName, birthday, adress,"DB-Admin", LocalDate.now());
        this.salary =salary;
        this.dbTechnology = dbTech;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public long getSalary() {
        return Math.round(this.salary * 1.1) ;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }
}
