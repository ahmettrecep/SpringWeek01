package hello.spring.model;

public class GoodYear implements Wheel {

    @Override
    public void useTire() {
        System.out.println("GoodYear#useTire");
    }
}
