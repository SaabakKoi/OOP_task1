package pharmacy;

public class Component implements Comparable<Component>{

    private String name;
    private String weight;
    private int power;
    private int index;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }


    @Override
    public int compareTo(Component o) {
        if(this.power > o.power){
            return 1;
        }else if(this.power < o.power){
            return -1;
        }
        return 0;
    }

    public int getPower() {
        return power;
    }
}
