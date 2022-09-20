package Lab4;

public class Cosmetics {
    public String producer;
    private String name;
    private String brand;
    private Type type;
    private int price;


    public Cosmetics(String name, String brand, String producer, Type type, int price) {
        this.name = name;
        this.brand = brand;
        this.producer = producer;
        this.type = type;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Cosmetics{" +
                "name = '" + name + '\'' +
                ", brand = '" + brand + '\'' +
                ", producer = '" + producer + '\'' +
                ", type = " + type +
                ", price = " + price +
                '}';
    }
}
