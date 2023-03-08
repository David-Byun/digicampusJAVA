package dto;

public class ItemDTO {
    private String id;
    private String name;
    private double price;
    private int qt;

    public ItemDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public ItemDTO(String id, String name, double price, int qt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qt = qt;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qt=" + qt +
                '}';
    }
}