package decorator.decorators;

import decorator.interfaces.Car;
import decorator.interfaces.imp.CarDecorator;

public class SportCar extends CarDecorator {
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding features of Sport Car");
    }
}
