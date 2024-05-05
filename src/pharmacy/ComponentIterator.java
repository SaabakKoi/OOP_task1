package pharmacy;

import java.util.Iterator;

public class ComponentIterator implements Iterator<Component> {

    private int index;
    private IterablePharmacy pharmacy;

    public ComponentIterator(IterablePharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.pharmacy.getComponents().size();
    }

    @Override
    public Component next() {
        return pharmacy.getComponents().get(index++);
    }

    public IterablePharmacy getPharmacy() {
        return pharmacy;
    }
}
