import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Milo");
        Cat cat2 = new Cat("Tabby");
        Cat cat3 = new Cat("Pusheen");
        Cat[] catters = {cat1, cat2, cat3};
        cats.addAll(List.of(catters));
        System.out.println(cats);
        Cat cat4 = new Cat("Dumbo");
        cats.set(2, cat4);
        System.out.println(cats);
        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);
        System.out.println(cats);
        for (int i = 0; i < cats.size(); i++) {
            cats.get(i).setName(cats.get(i).getName().toUpperCase());
        }
        System.out.println(cats);
    }
}
