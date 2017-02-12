package simple.camelroute01;


import org.apache.camel.CamelContext;

import org.apache.camel.impl.DefaultCamelContext;
import simple.camelroute01.routes.Route01;
import simple.camelroute01.routes.Route02;


public class StartApp {
    public static void main(String ... args) throws Exception{
        //Create CamelContext
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new Route01());
        context.addRoutes(new Route02());



        context.start();
        Thread.sleep(1000000000);
        //context.stop();
    }
}