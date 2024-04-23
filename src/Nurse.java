public class Nurse extends VetClinic{

    private String name;
    private int workExperience;

    public Nurse(String name, int workExperience) {
        this.name = name;
        this.workExperience = workExperience;
    }

    public Nurse() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Nurse [name=" + name +  "]";
    }
}
