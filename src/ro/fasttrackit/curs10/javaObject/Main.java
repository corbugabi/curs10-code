package ro.fasttrackit.curs10.javaObject;

import ro.fasttrackit.curs10.homework.Programmer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("tastatura");
        Product keys = new Product("keys");

        boolean equals = product.equals(keys);
        System.out.println(equals);

        Product tastatura = new Product("tastatura");
        System.out.println(tastatura.equals(product));

        String stringRepresentation = product.toString();
        System.out.println(stringRepresentation);
        System.out.println(product);

        int hash = product.hashCode();
        System.out.println(hash);

        //a==b ->a.hash == b.hash
        //a!=b ->a.hash poate fi == b.hash

        Object obj = new Programmer("Ana", "Mere", LocalDate.now(), "Orastie", 4000, "JAVA");
        obj = stringRepresentation;
        obj = product;

        printObject(obj);
        printObject(new Product("test"));
        printObject("test");
        printObject(1);
        printObject(LocalDate.now());

    }

    private static void printObject(Object obj) {
        System.out.println("------------------");
        System.out.println("This is my object " + obj);
        System.out.println("Class: " + obj.getClass());
        boolean isString = obj instanceof String;
        System.out.println("instance of String? " + isString);
    }
}
