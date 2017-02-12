package simple.camelroute01.routes;

import org.apache.camel.builder.RouteBuilder;

public class Route01 extends RouteBuilder{

    public void configure() throws Exception {

        from("file:simple-camelroute-01/src/main/resources/data/inbox?noop=true")
                .to("file:simple-camelroute-01/src/main/resources/data/outbox");
    }
}
