package it.develhope;

import java.util.Objects;

public class Smartphone implements Cloneable {

    public String brandName;
    public String modelName;
    public int batteryAh;
    public SmartphonePrice producerPrice;
    public SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batteryAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batteryAh = batteryAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }
    @Override
    public String toString() {
        return "Smartphone: Brand Name = " + brandName +
                ", model name = " + modelName +
                ", battery Ah = " + batteryAh +
                ", producer price = " + producerPrice +
                ", retail price = " + retailPrice ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batteryAh == that.batteryAh &&
                brandName.equals(that.brandName) &&
                modelName.equals(that.modelName) &&
                producerPrice.equals(that.producerPrice)
                && retailPrice.equals(that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batteryAh, producerPrice, retailPrice);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        return clonedSmartphone;
    }
}

