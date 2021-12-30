package test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.Cafe;
import test.DrinkType;
import test.Order;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("Tim1_Fibonacci.xml");
//		MyGateway gtw = (MyGateway)ctx.getBean("test");
//		gtw.method("testt");
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("/cafe.xml", Main.class);

		Cafe cafe = new Cafe() ;
		for (int i = 1; i <= 10; i++) {
			Order order = new Order(i);
			order.addItem(DrinkType.LATTE, 2, false);
			order.addItem(DrinkType.MOCHA, 3, true);
			cafe.placeOrder(order);
			System.out.println("order placed");
		}
	}


	public static void main_tmp(String[] args) {

		// ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("serviceActivator.xml");

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("routing.xml");

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("aggragate.xml");

//		ApplicationContext ctx = new ClassPathXmlApplicationContext("javaScriptService.xml");
//
//		MyGateway myGateway= (MyGateway)ctx.getBean("gateWayService");
//		myGateway.method("Salut !");

//		ApplicationContext ctx = new ClassPathXmlApplicationContext("webServiceCalling.xml");
//
//		MyGateway myGateway= (MyGateway)ctx.getBean("gateWayService");
//		myGateway.method("Salut !");


//		ApplicationContext ctx = new ClassPathXmlApplicationContext("database.xml");
//
//		PersonService personService = ctx.getBean(PersonService.class);
//
//		Person person = new Person();
//		person.setName("Tintin");
//		person = personService.createPerson(person);
//
//		System.out.println(person);


	}

}
 