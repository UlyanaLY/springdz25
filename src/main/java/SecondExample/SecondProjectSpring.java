package SecondExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SecondProjectSpring {
    public static void main(String[] args) {
        System.out.println("Hello1 World!");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Car car = applicationContext.getBean("car-bean", Car.class);
        System.out.println(car);
    }
}
