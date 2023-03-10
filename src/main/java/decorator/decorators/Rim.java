package decorator.decorators;

import decorator.interfaces.Car;
import decorator.interfaces.imp.CarDecorator;

public class Rim extends CarDecorator {

    public Rim(Car car) {
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding RIM to car");
    }
}
