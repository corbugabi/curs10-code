package ro.fasttrackit.curs10.curs10Homework.buquet;

import java.util.ArrayList;
import java.util.List;

public class MainBuquet {

    public static void main(String[] args) {
        BuquetOfFlowers buquetOfFlowers = new BuquetOfFlowers(new ArrayList<String>(List.of("trandafir","lalea","ghiocel")));
        System.out.println(buquetOfFlowers.getFlowers());
        System.out.println(buquetOfFlowers.adaugare("brandusa"));
        System.out.println(buquetOfFlowers.remove("lalea"));
    }
}
