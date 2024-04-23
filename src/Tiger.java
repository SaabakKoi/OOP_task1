import java.time.LocalDate;
import java.util.List;

public class Tiger extends Animal implements Goable, Swimable{
    public Tiger(String name, LocalDate birthday, List<String> vaccinations, String illness, String owner) {
        super(name, birthday, vaccinations, illness, owner);
    }


    @Override
    public double swim() {
        System.out.printf("%s swimming", type);
        return 4;
    }


    @Override
    public double run() {
        System.out.printf("%s running", type);;
        return 26;
    }
}
