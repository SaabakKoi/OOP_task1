import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Goable, Swimable {

    private int countLegs;

    public Cat(String name, LocalDate birthday, List<String> vaccinations, String illness, String owner, int countLegs) {
        super(name, birthday, vaccinations, illness, owner);
        this.countLegs = countLegs;
    }

    public int getCountLegs() {
        return countLegs;
    }


    @Override
    public double swim() {
        System.out.printf("%s don't like but swimming", type);
        return 3;
    }


    @Override
    public double run() {
        System.out.printf("%s running", type);
        return 9;
    }
}
