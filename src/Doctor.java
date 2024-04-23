import java.util.ArrayList;

public class Doctor extends VetClinic{

    private String name;
    private String specialization;
    private int workExperience;
    private Nurse nurse;
    private ArrayList<Animal> schedule = new ArrayList<>();

    public Doctor(String name, String specialization, int workExperience, Nurse nurse) {
        this.name = name;
        this.specialization = specialization;
        this.workExperience = workExperience;
        this.nurse = nurse;
        this.schedule = new ArrayList<>();
    }

    public void docAppointment(Animal animal){ //записывает пациента на прием к доктору
        System.out.printf("%s  have a doctor's appointment today. \n", animal.type);
        schedule.add(animal);

    }

    public ArrayList<Animal> getSchedule() { //Показывает всех пациентов доктора из расписания
        return schedule;
    }

    public void aboutDoc() { // Общая информация про доктора
        System.out.printf("\n %s specialization is %s, work experience in this field %d years.\n", name, specialization, workExperience);
        System.out.printf("%s is Dr.%s personal assistant.", nurse.getName(), name);
    }

    public Nurse getNurse() {
        return nurse;
    }

    @Override
    public String toString() {
        return "Dr{" +
                "name='" + name + '\'' +
                "specialization='" + specialization + '\'' +
                '}';

    }
}
