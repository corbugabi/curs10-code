package ro.fasttrackit.curs10.curs10Homework.Buquet;

public class MainBuquet {
    public static void main(String[] args) {
        BuquetOfFlowers buquetOfFlowers = new BuquetOfFlowers();
        System.out.println(buquetOfFlowers.getFlowers());
        buquetOfFlowers.adaugare("brandusa");
        buquetOfFlowers.remove("lalea");
    }
}
