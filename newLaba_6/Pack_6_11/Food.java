package Pack_6_11;

public class Food implements Priceable {
    protected int count;
    protected double unitPrice ;

    public void setCount(int count) {

        this.count = count;
    }

    public void setUnitPrice(Double unitPrice) {

        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {

        return "Food{count=%d, unitPrice=%.2f}".format(String.valueOf(count), unitPrice);
    }

    @Override
    public Double getPrice() {

        return count * unitPrice ;
    }
}
