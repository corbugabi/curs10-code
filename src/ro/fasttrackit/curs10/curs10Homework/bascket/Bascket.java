package ro.fasttrackit.curs10.curs10Homework.bascket;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bascket {
    private final List<String> fruits;

    public Bascket(List<String> fruits){
        this.fruits = fruits;
    }

    public boolean find(String fruit) {
        for (String myFruit : fruits) {
            if (fruit.equals(myFruit)) {
                return true;
            }
        }
        return false;
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
        int count = 0;
        for (String myFruit : fruits) {
            if (fruit.equals(myFruit)) {
                return count;
            }
            count++;
        }
        return -1;
    }

    public String distinct(){
       for(int i=0;i<fruits.toArray().length;i++);
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
        int COUNT = 1;
        for (int i=1; i<fruits.toArray().length;i++){
            COUNT++;
        }
        return COUNT;
    }
}
