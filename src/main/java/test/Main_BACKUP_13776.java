package test;

<<<<<<< HEAD
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
=======
import org.springframework.boot.autoconfigure.SpringBootApplication;
import test.cafe.Cafe;
import test.cafe.DrinkType;
import test.cafe.Order;
>>>>>>> 65633bb37164c581a43b91ce97817e61a71b3441

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		// Fibonacci program
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("Tim1_Fibonacci.xml");

		// Cafe program
		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("/cafe.xml", Main.class);

		/*
		Cafe cafe = new Cafe() ;
		for (int i = 1; i <= 10; i++) {
			Order order = new Order(i);
			order.addItem(DrinkType.LATTE, 2, false);
			order.addItem(DrinkType.MOCHA, 3, true);
			cafe.placeOrder(order);
			System.out.println("order placed");
<<<<<<< HEAD
		}*/

		//Splitter
		SpringApplication.run(Main.class, args);


=======
		}

		// Image manipulation program
>>>>>>> 65633bb37164c581a43b91ce97817e61a71b3441
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
}
 