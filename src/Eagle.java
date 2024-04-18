import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal{
    public Eagle(String name, LocalDate birthday, List<String> vaccinations, String illness, String owner) {
        super(name, birthday, vaccinations, illness, owner);
    }

    @Override
    public void toGo() {
        System.out.println("Eagle walking, perhaps jumping");
    }

    @Override
    public void fly() {
        System.out.println("Eagle Flying");
    }

    @Override
    public void swim() {
    }
}
