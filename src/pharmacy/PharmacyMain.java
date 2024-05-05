package pharmacy;

import java.util.*;

public class PharmacyMain {
    public static void main(String[] args) {
        Component piniciline = new Component("piniciline", "10mg", 100 );
        Component salt = new Component("salt", "100g", 10);
        Component sugar = new Component("sugar", "50g", 25);

        IterablePharmacy pharmacy1 = new IterablePharmacy();
        pharmacy1.addComponents(salt,sugar);

        IterablePharmacy pharmacy2 = new IterablePharmacy();
        pharmacy2.addComponents(piniciline,salt,sugar);

        IterablePharmacy pharmacy3 = new IterablePharmacy();
        pharmacy3.addComponents(piniciline,salt,sugar);

        IterablePharmacy pharmacy4 = new IterablePharmacy();
        pharmacy4.addComponents(piniciline,sugar);


//        for (Component c : pharmacy2){
//            System.out.println(c);
//        }
//
//        List<Component> list = new ArrayList<>();
//        list.add(sugar);
//        list.add(salt);
//        list.add(piniciline);
//
//        Collections.sort(list);
//        System.out.println(list);

        Set<IterablePharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        System.out.println(result.size());
    }

}
