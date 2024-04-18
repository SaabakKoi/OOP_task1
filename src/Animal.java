import java.time.LocalDate;
import java.util.List;

public class Animal {
    
    protected String name;
    protected LocalDate birthday;
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;

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

    private void wakeUp(){
        System.out.println("Animal wake up");
    }

    private void wakeUp(int time){
        System.out.println("The animal wake up at "+time);
    }

    private void eat(){
        System.out.println("The animal ate");
    }

    private void play(){
        System.out.println("The animal play");
    }

    private void sleep(){
        System.out.println("The animal sleep");
    }

    public void lifeCircle(){
        wakeUp();
        eat();
        play();
        sleep();

    }

    public void toGo(){
        System.out.println("The animal Walking");
    }

    public void fly(){
        System.out.println("The Animal is Flying");
    }

    public void swim(){
        System.out.println("The Animal is Swimming");
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
