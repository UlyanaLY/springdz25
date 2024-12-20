package FirstExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstProjectSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car);
        applicationContext.close();
    }
}
