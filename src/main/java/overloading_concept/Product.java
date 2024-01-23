package overloading_concept;

public class Product {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int quantity)
    {
        return quantity*price;
    }
    public static void main(String[] args) {
    Product p=new Product();
    p.setPrice(2.99);
    System.out.println(p.getPrice(2));
    }


}
