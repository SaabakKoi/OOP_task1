package pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component> {
    private int index;
    List<Component> components;

    public Pharmacy() {
        this.index = 0;
        this.components = new ArrayList<Component>();
    }

    public void addComponents(Component ... components1) {
        if (components1.length == 0) {
            System.out.println("There is nothing to add");
        }
        Collections.addAll(this.components, components1);
    }

    @Override
    public Iterator<Component> iterator() {
        return null;
    }
}
