import java.time.LocalDate;
import java.util.List;

public class Tiger extends Animal{
    public Tiger(String name, LocalDate birthday, List<String> vaccinations, String illness, String owner) {
        super(name, birthday, vaccinations, illness, owner);
    }

    @Override
    public void toGo() {
        System.out.println("Tiger running");
    }

    @Override
    public void swim() {
        System.out.println("Tiger swimming");
    }

    @Override
    public void fly() {
    }
}
