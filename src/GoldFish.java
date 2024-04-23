import java.time.LocalDate;
import java.util.List;

public class GoldFish extends Animal implements Swimable{
    public GoldFish(String name, LocalDate birthday, List<String> vaccinations, String illness, String owner) {
        super(name, birthday, vaccinations, illness, owner);
    }

    @Override
    public double swim() {
        System.out.printf("%s swimming", type);
        return 12;
    }
}
