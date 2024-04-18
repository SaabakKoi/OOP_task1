import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal{
    public Duck(String name, LocalDate birthday, List<String> vaccinations, String illness, String owner) {
        super(name, birthday, vaccinations, illness, owner);
    }

    @Override
    public void toGo() {
        System.out.println("Duck slowly walking");
    }

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Try to catch Duck, while she's swimming");
    }
}
