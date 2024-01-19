package compareobjects;

public class Product implements Comparable<Product> {

    int id;
    int weight;
    int price;
    public Product(int id,int weight,int price)
    {
        this.id=id;
        this.weight=weight;
        this.price=price;
    }
    public int compareTo(Product p) {
        if (this.price == p.price) {
            return 0;
        } else if (this.price > p.price) {
            return 1;
        } else {
            return -1;
        }
    }
    public static void main(String args[])
    {
        Product p1=new Product(1,40,400);
        Product p2=new Product(2,10,100);
        System.out.println("The result is "+p1.compareTo(p2));
    }


}
