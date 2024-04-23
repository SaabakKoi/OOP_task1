import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Goable, Flyable{
    public Eagle(String name, LocalDate birthday, List<String> vaccinations, String illness, String owner) {
        super(name, birthday, vaccinations, illness, owner);
    }


    @Override
    public double run() {
        System.out.printf("%s walking, perhaps jumping", type);
        return 3;
    }

    @Override
    public double fly() {
        System.out.printf("%s is Flying", type);
        return 59;
    }
}
