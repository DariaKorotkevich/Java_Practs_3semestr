package Pack_6_11;

import Pack_6_11.Food;

public class Milk extends Food {
    protected Double weight ;

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public Double getPrice() {
        return count * unitPrice * weight;
    }

    @Override
    public String toString() {
        return "Milk{weight=%.2f, count=%d, unitPrice=%.2f}".format(String.valueOf(weight), count, unitPrice);
    }
}
