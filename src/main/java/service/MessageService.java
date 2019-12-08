package service;

import entity.Player;

public interface MessageService {

     void send(Player sender, Player receiver, String message) throws Exception;

     void sendReceivedMessage(String message);

}
