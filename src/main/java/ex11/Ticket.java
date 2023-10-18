package ex11;
public class Ticket {
    protected double price;

    public Ticket (double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void printValue() {
        System.out.println("R$ " + this.price + ".");
    }
}
