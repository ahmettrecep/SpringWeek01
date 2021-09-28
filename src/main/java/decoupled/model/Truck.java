package decoupled.model;

public class Truck implements Vehicle{
    private Wheel wheel;

    @Override
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public void go() {
        wheel.useTire();
    }
}
