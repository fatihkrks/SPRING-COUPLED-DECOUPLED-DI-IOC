package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Car car=context.getBean("car", Car.class);
	car.drive();
}
}
