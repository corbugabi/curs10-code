package ro.fasttrackit.curs10.curs10Homework.bascket;

import ro.fasttrackit.curs10.curs10Homework.bascket.Bascket;

import java.util.ArrayList;
import java.util.List;

public class MainBascket {
    public static void main(String[] args) {
        Bascket bascket =  new Bascket(new ArrayList<String>(List.of("mere","pere","cirese")));

        System.out.println(bascket.find("mere"));
        System.out.println(bascket.removeF("porto"));
        System.out.println(bascket.find("mere"));
        System.out.println(bascket.position("alune"));
        bascket.add("cirese");
        System.out.println(bascket.countFruits());
        System.out.println(bascket.customCount());
        System.out.println(bascket.distinct());

    }
}
