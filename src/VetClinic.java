import javax.print.Doc;
import java.util.*;

public class VetClinic {
    private List<Animal> patients = new ArrayList<Animal>();
    private Map <Doctor, ArrayList<Animal>> doctors = new HashMap<>();
    private List<Object> staff = new ArrayList<>();


    public void addPatient(Animal a) {
        patients.add(a);
    }

    public void addPatients(Animal ... animals){ // добавление коллекции
        Collections.addAll(patients, animals);
    }

    public List<Goable> getGoables() {
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal a : patients) {
            if (a instanceof Goable) {
                result.add((Goable) a);
            }
        }
        return result;
    }

    public List<Flyable> getFlyables() {
        List<Flyable> result = new ArrayList<>(patients.size());
        for (Animal a : patients) {
            if (a instanceof Flyable) {
                result.add((Flyable) a);
            }
        }
        return result;
    }

    public List<Swimable> getSwimables() {
        List<Swimable> result = new ArrayList<>(patients.size());
        for (Animal a : patients) {
            if (a instanceof Swimable) {
                result.add((Swimable) a);
            }
        }
        return result;
    }

    public void addDoctor(Doctor doctor){ // добавление доктора и его персональной медсестры к персоналу клиники
        doctors.put(doctor, doctor.getSchedule());
        staff.add(doctor);
        staff.add(doctor.getNurse());
    }

    public Map<Doctor, ArrayList<Animal>> getDoctors() { //возвращает список докторов с его пациентами
        return doctors;
    }

    public List<Object> getStaff() { //возвращает список всего персонала клиники
        return staff;
    }

}
