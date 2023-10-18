package ex11;

public class VipTicket extends Ticket {
    public VipTicket (double price) {
        super(price);
        this.price = price + (price * 0.5);
    }
}
