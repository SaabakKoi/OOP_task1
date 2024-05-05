package pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterablePharmacy implements Comparable<IterablePharmacy>{
    private String name;
    private int index;
    List<Component> components;

    public IterablePharmacy() {
        this.name = "";
        this.index = 0;
        this.components = new ArrayList<Component>();
    }

    public void addComponents(Component ... components1) {
        if (components1.length == 0) {
            System.out.println("There is nothing to add");
        }
        Collections.addAll(this.components, components1);
    }

    public List<Component> getComponents() {
        return components;
    }


    @Override
    public int compareTo(IterablePharmacy o) {
        if (sumPower(components) > sumPower(o.getComponents())) {
            return 1;
        }else if (sumPower(components) < sumPower(o.getComponents())) {
            return -1;
        }
        return 0;
    }
    private int sumPower(List<Component> components) {
        int sum = 0;
        for (Component c : components) {
            sum += c.getPower();
        }
        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        IterablePharmacy that = (IterablePharmacy) obj;
        if (index != that.index) return false;
        return components.equals(that.components);
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        result = 31 * result + index;
        result = 31 * result + components.hashCode();
        return result;
    }
}
