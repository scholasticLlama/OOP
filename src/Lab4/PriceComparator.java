package Lab4;

import java.util.Comparator;

public class PriceComparator implements Comparator<Cosmetics> {
    @Override
    public int compare(Cosmetics o1, Cosmetics o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
