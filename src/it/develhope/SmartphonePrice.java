package it.develhope;

import java.util.Objects;

public class SmartphonePrice implements Cloneable{
    public String priceType;
    public double priceInEuros;

    public SmartphonePrice(String priceType, double priceInEuros){
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    @Override
    public String toString() {
        return "Price Type = " + priceType +
                ", price In Euros = " + priceInEuros ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && priceType.equals(that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();
        return clonedSmartphonePrice;
    }
}
