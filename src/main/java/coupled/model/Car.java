package coupled.model;

public class Car {

    //Car HAS-A Tire
    private Tire tire;

    public Car(){
        //Bu kod coupled bir koddur.
        tire = new Tire();
    }
    public void go(){
        tire.useTire();
    }
}
