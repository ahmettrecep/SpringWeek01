package hello.spring.test;


import hello.spring.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appcontext.xml");
        Car car = applicationContext.getBean("carId", Car.class);
        car.go();
    }
}
