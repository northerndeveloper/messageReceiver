package main.java.service.impl;

import main.java.data.PlayerDTO;
import entity.Player;
import org.apache.log4j.Logger;
import service.MessageService;

public class MessageServiceImpl implements MessageService {

    private final static Logger logger = Logger.getLogger(PlayerDTO.class);


    public  void send(Player sender, Player receiver, String message) throws Exception {

        PlayerDTO playerDTO = PlayerDTO.getInstance();

        int messageCount = playerDTO.findAndIncrementSendMessageCount(sender, receiver);
        sendReceivedMessage(message + messageCount);
    }

    public void sendReceivedMessage(String message) {


       String receivedMessageCount =  message.substring(message.length() - 2);
       if(receivedMessageCount.equals("10")) {
           logger.info("10 messages received. Program will exit now.");
           System.exit(0);
       }
        logger.info("Message is received. Program will continue. The message " + message);
    }
}
