package decorator.interfaces.imp;

import decorator.interfaces.Car;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembled basic car ...");
    }
}
