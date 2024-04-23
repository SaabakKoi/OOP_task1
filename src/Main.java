import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        Nurse e_ivanova = new Nurse("Evgeniy Ivanova", 5);
        Doctor a_s_petrov = new Doctor("Alexander Sergeevich Petrov", "Swimable animals", 12, e_ivanova);
        vetClinic.addDoctor(a_s_petrov);

        Animal kitty = new Cat("Kitty", LocalDate.of(2022,4,22), new ArrayList<>(), "Лешай", "Mr.Johnson", 4);
        Animal eagle = new Eagle("Carrl", LocalDate.of(2005,7,4),new ArrayList<>(), "Лешай", "Mr.Johnson");
        Animal tiger = new Tiger("Black Arrow", LocalDate.of(1998,12,31),new ArrayList<>(),"---", "Zoo");
        Animal duck = new Duck("Donald Junior", LocalDate.of(1957,4,18),new ArrayList<>(), "Richness", "Donald Senior");
        Animal goldenFish = new GoldFish("Lincoln", LocalDate.of(2023,10,27),new ArrayList<>(), "Нет нижнего плавника", "Mr.Anderson");

        List<Animal> animals = new ArrayList<>();

        animals.add(kitty);
        animals.add(eagle);
        animals.add(tiger);
        animals.add(duck);

        vetClinic.addPatients(eagle,tiger,duck,kitty,goldenFish);
        a_s_petrov.docAppointment(duck);
        a_s_petrov.docAppointment(goldenFish);

//        System.out.println(vetClinic.getDoctors());
//        System.out.println(vetClinic.getStaff());
//        System.out.println(a_s_petrov.getSchedule());
//
//        System.out.println(vetClinic.getSwimables());
        a_s_petrov.aboutDoc();


    }
}