package ro.fasttrackit.curs10.curs10Homework.buquet;

import java.util.ArrayList;
import java.util.List;

public class BuquetOfFlowers {
    private final List<String> flowers;

    public BuquetOfFlowers(List<String> flowers){
        this.flowers = flowers;
    }

    public List<String> getFlowers() {
        return flowers;
    }

    public boolean adaugare(String flower){
        return flowers.add(flower);
    }

    public boolean remove(String flower){
        return flowers.remove(flower);
    }
}
