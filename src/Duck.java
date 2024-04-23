import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Goable, Flyable, Swimable{
    public Duck(String name, LocalDate birthday, List<String> vaccinations, String illness, String owner) {
        super(name, birthday, vaccinations, illness, owner);
    }


    @Override
    public double fly() {
        System.out.printf("%s flying", type);
        return 36;
    }

    @Override
    public double swim() {
        System.out.printf("%s is swimming", type);
        return 7;
    }

    @Override
    public double run() {
        System.out.printf("%s slowly walking", type);
        return 0;
    }
}
