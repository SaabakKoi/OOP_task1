import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    
    protected String name;
    protected LocalDate birthday;
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;
    protected String type = getClass().getSimpleName();

    public Animal(String name, LocalDate birthday, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthday = birthday;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
