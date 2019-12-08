package main.java;

import main.java.data.PlayerDTO;
import service.MessageService;
import main.java.service.impl.MessageServiceImpl;

public class PlayerGame {

    private static MessageService messageService = new MessageServiceImpl();



   public static void main(String[] args) throws Exception {


        PlayerDTO playerDTO = PlayerDTO.getInstance();
        playerDTO.fillPlayers();


       messageService.send(playerDTO.getPlayerList().get(0), playerDTO.getPlayerList().get(1), "message");
       messageService.send(playerDTO.getPlayerList().get(0), playerDTO.getPlayerList().get(1), "second message");
       messageService.send(playerDTO.getPlayerList().get(0), playerDTO.getPlayerList().get(1), "third message");
       messageService.send(playerDTO.getPlayerList().get(0), playerDTO.getPlayerList().get(1), "fourth message");
       messageService.send(playerDTO.getPlayerList().get(0), playerDTO.getPlayerList().get(1), "fifth message");
       messageService.send(playerDTO.getPlayerList().get(0), playerDTO.getPlayerList().get(1), "sixth message");
       messageService.send(playerDTO.getPlayerList().get(0), playerDTO.getPlayerList().get(1), "seventh message");
       messageService.send(playerDTO.getPlayerList().get(0), playerDTO.getPlayerList().get(1), "eight message");
       messageService.send(playerDTO.getPlayerList().get(0), playerDTO.getPlayerList().get(1), "nineth message");
       messageService.send(playerDTO.getPlayerList().get(0), playerDTO.getPlayerList().get(1), "tenth message");
       messageService.send(playerDTO.getPlayerList().get(0), playerDTO.getPlayerList().get(1), "eleventh message");
       messageService.send(playerDTO.getPlayerList().get(0), playerDTO.getPlayerList().get(1), "twelft message");









}

}



