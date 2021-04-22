package ro.fasttrackit.curs10.curs10Homework.company;

public class MainCompany {
    public static void main(String[] args) {
        Person persons[] =new Person[5];

        persons[0] = new Person("Aurel",35,"Manager");
        persons[1] = new Person("Mirel",20,"Welder");
        persons[2] = new Person("Alina",30,"Carpenter");
        persons[3] = new Person("Ana",24,"Plumber");
        persons[4] = new Person("Gabi",31,"Manager");

        for(Person person : persons){
            person.PersonDetails();
        }

        System.out.println("---------------------------------");

        for(Person person : persons){
            person.getManager("Manager");
        }

        System.out.println("---------------------------------");

        for (Person person : persons){
            person.getPersonOlder(25);
        }

        System.out.println("---------------------------------");

        for (Person person : persons){
            person.getPerson("a");
        }
    }

}
