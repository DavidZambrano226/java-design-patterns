package decorator.decorators;

import decorator.interfaces.Car;
import decorator.interfaces.imp.CarDecorator;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("I am a luxury car");
    }
}
