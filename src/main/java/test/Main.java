package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.cafe.Cafe;
import test.cafe.DrinkType;
import test.cafe.Order;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		// Fibonacci program
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("Tim1_Fibonacci.xml");

		// Cafe program
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("/cafe.xml", Main.class);

		Cafe cafe = new Cafe() ;
		for (int i = 1; i <= 10; i++) {
			Order order = new Order(i);
			order.addItem(DrinkType.LATTE, 2, false);
			order.addItem(DrinkType.MOCHA, 3, true);
			cafe.placeOrder(order);
			System.out.println("order placed");
		}

		// Image manipulation program
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
 