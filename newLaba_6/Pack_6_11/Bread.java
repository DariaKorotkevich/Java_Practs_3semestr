package Pack_6_11;

import java.util.Formatter;
public class Bread extends Food {
    protected Double weight;

    public void setWeight(Double weight) {

        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bread{weight=%.2f, count=%d, unitPrice=%.2f}".format(String.valueOf(weight), count, unitPrice);
    }

    @Override
    public Double getPrice() {
        return weight * unitPrice * count ;
    }
}
