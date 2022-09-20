package Lab4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cosmetics[] cosmetics = {
                new Cosmetics("Chanel№5", "Chanel", "France", Type.PERFUME, 526),
                new Cosmetics("Bambi Eye", "L'Oreal Paris", "German", Type.DECORATIVECOSMETICS, 216),
                new Cosmetics("Coconut Oil", "KOCONOI", "Spain", Type.SKINCARE, 189),
        };

        System.out.println("Sorted by brand in ascending order.\n");
        Arrays.sort(cosmetics, new BrandComparator());
        printArray(cosmetics);

        System.out.println("\nSorted by price in descending order.\n");
        Arrays.sort(cosmetics, new PriceComparator().reversed());
        printArray(cosmetics);

    }

    public static void printArray(Cosmetics[] cosmetics) {
        for (Cosmetics cosmetic : cosmetics) {
            System.out.println(cosmetic);
        }
    }
}
