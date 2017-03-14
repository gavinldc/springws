package com.dc.springws;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * Created by lvdanchen on 17/3/14.
 */
public class TextMessageHandler extends TextWebSocketHandler{

    @Override
   public void afterConnectionEstablished(WebSocketSession session)throws Exception{
       System.out.println("connection startetd");
   }

   @Override
   public void handleTextMessage(WebSocketSession session, TextMessage message)throws Exception{
       System.out.println(message.toString());
   }

   @Override
   public void afterConnectionClosed(WebSocketSession session, CloseStatus status)throws Exception{
       System.out.println("connection closed");
   }
}
