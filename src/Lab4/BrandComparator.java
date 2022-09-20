package Lab4;

import java.util.Comparator;

public class BrandComparator implements Comparator<Cosmetics> {

    @Override
    public int compare(Cosmetics o1, Cosmetics o2) {
        return o1.getBrand().compareToIgnoreCase(o2.getBrand());
    }
}
