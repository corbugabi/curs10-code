package ro.fasttrackit.curs10.curs10Homework.company;

public class Person {
    private final String name;
    private final int age;
    private final String position;

    public Person(String name, int age, String position){
       this.name = name;
       this.age = age;
       this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public void PersonDetails(){
        System.out.println("Nume: " + name + ", " + "Varsta: " + age + " ani, " + "Pozitia: " + position + "." );
    }

    public void getManager(String position){
        if(this.position.equals(position)){
            PersonDetails();
        }
    }

    public void getPersonOlder(int age){
        if(this.age > age){
            PersonDetails();
        }
    }

    public void getPerson(String filterName){
        if(this.name.contains(filterName)){
            PersonDetails();
        }
    }


}
