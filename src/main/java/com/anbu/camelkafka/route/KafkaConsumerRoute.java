package com.anbu.camelkafka.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        //Kafka Consumer
        from("kafka:ytube-topic1?brokers=localhost:9092")
                .log("Message received from kafka topic : ${body}");
    }
}
