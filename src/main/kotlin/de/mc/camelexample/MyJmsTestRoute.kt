package de.mc.camelexample

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class MyJmsTestRoute : RouteBuilder() {
    override fun configure() {
        // context.addComponent("activemq",ActiveMQComponent.activeMQComponent("tcp://localhost:61616"))
        from("activemq:in")
                .log("Message : \${body}")
                .to("activemq:out")
    }
}