package com.dc.springws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Created by lvdanchen on 17/3/14.
 */
@Configuration
@EnableAutoConfiguration
@EnableWebSocket
public class SampleApp1 extends SpringBootServletInitializer implements WebSocketConfigurer{

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(textMessageHandler(),"/hello").withSockJS();
    }

    @Bean
    public TextMessageHandler textMessageHandler(){
        return new TextMessageHandler();
    }

    @Bean
    public ServerEndpointExporter serverEndpointExporter(){
        return new ServerEndpointExporter();
    }

    public static void main(String[] msg){
        SpringApplication.run(SampleApp1.class,msg);
    }
}
