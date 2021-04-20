package ro.fasttrackit.curs10.curs10Homework.Bascket;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Bascket {
    private final List<String> fruits = new ArrayList<String>(List.of("mere","pere","alune","mere"));
    int count = 0;
    int COUNT = 1;
    public boolean find(String fruit) {
        for (String myFruit : fruits) {
            if (fruit.equals(myFruit)) {
                System.out.println(fruits);
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean removeF(String fruit){
        for (String myFruit : fruits){
            if(fruit.equals(myFruit)){
                fruits.remove(fruit);
                return true;
            }else{
                return false;
            }
        }
    return true;}

    public int position(String fruit){
        for (String myFruit : fruits) {
            if (fruit.equals(myFruit)) {
                return count;
            }
            count++;
        }
        return 0;
    }

    public String distinct(){
       for(String myFruit : fruits);
        return null;
    }

    Set<String> set = new HashSet<String>();

    public void add(String fruit){
        System.out.println(fruits.add(fruit));
        System.out.println(fruits);
    }

    public int countFruits(){
       return fruits.size();
    }

    public int customCount(){
        for (int i=1; i<fruits.toArray().length;i++){
            COUNT++;
        }
        return COUNT;
    }
}
