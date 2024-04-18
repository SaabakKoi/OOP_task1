import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat kitty = new Cat("Kitty", LocalDate.of(2022,4,22), new ArrayList<>(), "Лешай", "Mr.Johnson", 4);

        System.out.println(kitty);
        System.out.println(kitty.getCountLegs());

        Animal eagle = new Eagle("Carrl", LocalDate.of(2005,7,4),new ArrayList<>(), "Лешай", "Mr.Johnson");
        Animal tiger = new Tiger("Black Arrow", LocalDate.of(1998,12,31),new ArrayList<>(),"---", "Zoo");
        Animal duck = new Duck("Donald Junior", LocalDate.of(1957,4,18),new ArrayList<>(), "Richness", "Donald Senior");

        List<Animal> animals = new ArrayList<>();

        animals.add(kitty);
        animals.add(eagle);
        animals.add(tiger);
        animals.add(duck);

        animals.get(0).lifeCircle();

        animals.get(2).fly();
        animals.get(2).swim();
    }
}