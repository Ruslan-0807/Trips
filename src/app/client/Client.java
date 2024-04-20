package app.client;

import app.controller.TripController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
    public static void main(String[] args) {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app");
        TripController controller = context.getBean(TripController.class);
        System.out.println(controller.getById(4L));
    }
}



