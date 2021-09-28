package decoupled.test;

import decoupled.model.Car;
import decoupled.model.Lassa;
import decoupled.model.Vehicle;
import decoupled.model.Wheel;

public class DecoupledTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Wheel lassa = new Lassa();
        car.setWheel(lassa);
        car.go();
    }
}
