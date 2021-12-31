package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.scheduling.PollerMetadata;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.support.PeriodicTrigger;
import test.cafe.Cafe;
import test.cafe.DrinkType;
import test.cafe.Order;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		// Fibonacci program
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("Tim1_Fibonacci.xml");

		// Cafe program
		//ApplicationContext context = new ClassPathXmlApplicationContext("cafe.xml");

/*
		Cafe cafe = new Cafe() ;
		for (int i = 1; i <= 10; i++) {
			Order order = new Order(i);
			order.addItem(DrinkType.LATTE, 2, false);
			order.addItem(DrinkType.MOCHA, 3, true);
			cafe.placeOrder(order);
			//System.out.println("order placed");
		}
*/
		hello();

		//Splitter
		//SpringApplication.run(Main.class, args);

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
/*
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context) {

		return args -> {
			MessageChannel channel = context.getBean("orderInputChannel", MessageChannel.class);
			SplitterOrderCreator orderCreator = context.getBean("splitterOrderCreator", SplitterOrderCreator.class);

			System.out.println("Sending orders to input channel");
			for (Object order : orderCreator.createOrders()) {
				channel.send(MessageBuilder.withPayload(order).build());
			}
		};
	}
*/

	public static void cafeApplication() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("cafe.xml");
		Cafe cafe = context.getBean("cafe", Cafe.class);
		for (int i = 1; i <= 100; i++) {
			Order order = new Order(i);
			order.addItem(DrinkType.LATTE, 2, false);
			order.addItem(DrinkType.MOCHA, 3, true);
			cafe.placeOrder(order);
		}
	}

	public static void hello() {

		ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
		MessageChannel channel = context.getBean("inputChannel", MessageChannel.class);
		Message<String> message = MessageBuilder.withPayload("World").build();
		channel.send(message);
	}
}
 