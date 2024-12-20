package ThirdExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ThirdProjectSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Car car = applicationContext.getBean("car-bean", Car.class);

        System.out.println(car);
    }
}
