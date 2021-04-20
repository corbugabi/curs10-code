package ro.fasttrackit.curs10.curs10Homework.Buquet;

import java.util.ArrayList;
import java.util.List;

public class BuquetOfFlowers {
    private final List<String> flowers = new ArrayList<String>(List.of("trandafir", "lalea", "narcisa", "ghiocel"));

    public List<String> getFlowers() {
        return flowers;
    }

    public void adaugare(String flower){
        System.out.println(flowers.add(flower));
    }

    public void remove(String flower){
        System.out.println(flowers.remove(flower));
    }
}
