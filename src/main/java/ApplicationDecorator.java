import decorator.decorators.LuxuryCar;
import decorator.decorators.Rim;
import decorator.decorators.SportCar;
import decorator.interfaces.Car;
import decorator.interfaces.imp.BasicCar;

public class ApplicationDecorator {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar = new Rim(basicCar);
        basicCar.assemble();

        /*Car sportsCar = new SportCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");*/

    }
}
