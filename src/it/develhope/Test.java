package it.develhope;

public class Test {
    public static void main(String[] args) {
        SmartphonePrice producer1 = new SmartphonePrice("Euro", 600);
        SmartphonePrice producer2 = new SmartphonePrice("Euro", 400);
        SmartphonePrice retail1 = new SmartphonePrice("Euro", 1200);
        SmartphonePrice retail2 = new SmartphonePrice("Euro", 1000);

        Smartphone smartphone1 = new Smartphone("Apple", "Iphone 14", 3000, producer1, retail1);
        Smartphone smartphone2 = new Smartphone("Samsung", "Galaxy s22", 3500, producer2, retail2);

        System.out.println("Smartphone 1: " + smartphone1);
        System.out.println("Smartphone 2: " + smartphone2);

        boolean smartphoneOut = smartphone1.equals(smartphone2);
        System.out.println("Is smartphone 1 equals to smartphone 2? " + smartphoneOut);

        boolean producerOut = producer1.equals(producer2);
        System.out.println("Is producer 1 equals to producer 2? " + producerOut);

        boolean retailOut = retail1.equals(retail2);
        System.out.println("Is retail 2 equals retail 2? " + retailOut);

        try {
            Smartphone clonedSmartphone = (Smartphone) smartphone2.clone();
            clonedSmartphone.modelName = "Galaxy s23";
            System.out.println("Smartphone original: " + smartphone2);
            System.out.println("Smartphone cloned: " + clonedSmartphone);
        }catch (Exception exception){
            System.out.println("Error");
        }
    }
}
