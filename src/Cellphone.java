import java.util.Objects;

/**
 * 这是java写的手机数据类
 */
class Cellphones {
    String brand;
    double price;

    public Cellphones(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cellphones cellphone = (Cellphones) o;
        return Double.compare(cellphone.price, price) == 0 && Objects.equals(brand, cellphone.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
