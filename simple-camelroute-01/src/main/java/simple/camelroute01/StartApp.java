package simple.camelroute01;


import org.apache.camel.CamelContext;

import org.apache.camel.impl.DefaultCamelContext;
import simple.camelroute01.routes.Route01;


public class StartApp {
    public static void main(String ... args) throws Exception{
        //Create CamelContext
        CamelContext context = new DefaultCamelContext();

        // connect to embedded ActiveMQ JMS broker
       // ConnectionFactory connectionFactory =
                //new ActiveMQConnectionFactory("admin", "admin", "tcp://localhost:61616");

        //context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));

        context.addRoutes(new Route01());


       /*
       context.addRoutes(new RouteBuilder() {     //add the routing logic using a RouteBuilder and the Java DSL???

            public void configure() {
                from("file:data/inbox?noop=true")
                       .to("file:data/outbox");

            }
        });
        */

        context.start();
        Thread.sleep(1000000000);
        //context.stop();
    }
}
