package com.dc.springws;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

/**
 * Created by lvdanchen on 17/3/14.
 */
@ServerEndpoint(value = "/websocket")
@Component
public class MyWebSocket {

    @OnOpen
    public void onOpen(Session session){

        System.out.println("session open");

    }


    @OnClose
    public void onClose(){
        System.out.println("session close");
    }

    @OnMessage
    public void onMessage(String message,Session session){
        System.out.println(message);
    }

    @OnError
    public void onError(Session session,Throwable error){
        System.out.println("error");
    }


}
