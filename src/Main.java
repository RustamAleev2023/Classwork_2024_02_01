import java.util.*;

public class Main {
    public static void main(String[] args) {
//        HashSet<Fish> fishes = new HashSet<>();
//        fishes.add(new Fish("eel", 1.5, 120));
//        fishes.add(new Fish("salmon", 2.5, 180));
//        fishes.add(new Fish("carp", 3.5, 80));
//        fishes.add(new Fish("trout", 2.2, 150));
//        fishes.add(new Fish("trout", 2.2, 150));
//        System.out.println("Collection: " + fishes);
//        System.out.println("Collection's size: " + fishes.size());

//        HashSet<String> countryHashSet = new HashSet<>();
//        countryHashSet.add("Russia");
//        countryHashSet.add("France");
//        countryHashSet.add("Honduras");
//        countryHashSet.add("Kode");
//        countryHashSet.add("Kode");
//
//        Iterator<String> iterator = countryHashSet.iterator();
//        while (iterator.hasNext()){
//            System.out.print("Country: " + iterator.next() + ", ");
//        }
//        System.out.println();
//        System.out.println("Collection's size: " + countryHashSet.size());
//
//        SortedSet<String> countries = new TreeSet<>(countryHashSet);
//        Iterator<String> iterator1 = countries.iterator();
//        while (iterator1.hasNext()){
//            System.out.print("Country: " + iterator1.next() + ", ");
//        }
//        System.out.println();
//        System.out.println("Collection's size: " + countryHashSet.size());

//        Random random = new Random(30);
//        Set<Integer> numbers = new HashSet<>();
//        for (int i = 0; i < 10; i++) {
//            numbers.add(random.nextInt(100));
//            System.out.println(numbers);
//        }
//
//        Random random1 = new Random(30);
//        Set<Integer> numbers1 = new TreeSet<>();
//        for (int i = 0; i < 10; i++) {
//            numbers1.add(random1.nextInt(100));
//            System.out.println(numbers1);
//        }

        SortedSet<String> animalSet = new TreeSet<>();
        animalSet.add("Antilope");
        animalSet.add("Fox");
        animalSet.add("Goat");
        animalSet.add("Dog");
        animalSet.add("Elephant");
        animalSet.add("Hippo");
        animalSet.add("Bear");
        animalSet.add("Cat");

        Iterator iterator = animalSet.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println(animalSet.subSet("Dog","Hippo"));
        System.out.println(animalSet.tailSet("Dog"));
        System.out.println(animalSet.headSet("Dog"));
        System.out.println(animalSet.first());
        System.out.println(animalSet.last());

    }

}
class Fish {
    private String name;
    private double weight;
    private double price;

    public Fish(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return  true;
        }
        if (!(obj instanceof Fish)){
            return false;
        }
        Fish tmp = (Fish) obj;
        return (tmp.name.equals(this.name)
                && tmp.weight == this.weight
                && tmp.price == this.price);
    }

    @Override
    public int hashCode() {
        int code = 17 ;
        code = 31 * code + this.name.hashCode();
        code = 31 * code + (int) this.weight;
        code = 31 * code + (int) this.price;
        return code;
    }

    @Override
    public String toString() {
        return this.name + " weight: " + this.weight + " price: " + this.price;
    }
}