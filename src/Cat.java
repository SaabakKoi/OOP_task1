import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal{

    private int countLegs;

    public Cat(String name, LocalDate birthday, List<String> vaccinations, String illness, String owner, int countLegs) {
        super(name, birthday, vaccinations, illness, owner);
        this.countLegs = countLegs;
    }

    public int getCountLegs() {
        return countLegs;
    }

    @Override
    public void toGo() {
        System.out.println("Cat running");
    }

    @Override
    public void swim() {
        System.out.println("Cat don't like but swimming");
    }

    @Override
    public void fly() {
    }
}
