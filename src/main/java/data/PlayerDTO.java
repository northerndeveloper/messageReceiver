package main.java.data;

import entity.Player;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerDTO {

    final static Logger logger = Logger.getLogger(PlayerDTO.class);

    private static PlayerDTO playerDTO;

    public static PlayerDTO getInstance() {

        if(playerDTO == null) {
            playerDTO = new PlayerDTO();
            return playerDTO;
        }
        return playerDTO;
    }

    private List<Player> playerList = new ArrayList<Player>();

    public List fillPlayers() {

        playerList.add(new Player(1L,"Alper", "Kopuz"));
        playerList.add(new Player(2L, "John", "Anderson"));
        playerList.add(new Player(3L,"Jonathan", "Michael"));
        playerList.add(new Player(4L,"George", "Elizabeth"));
        playerList.add(new Player(5L,"Elizabeth", "Taylor"));
        playerList.add(new Player(6L,"Stenley", "Kubrick"));
        playerList.add(new Player(7L,"Osman", "Dirilis"));
        return playerList ;
    }

    public int findAndIncrementSendMessageCount(Player sender, Player receiver) throws Exception {

        int totalMessageCount = 0;

        for(Player player: playerList) {

            if(player.getPlayerId() == sender.getPlayerId()) {
                Player receiverPlayer = player.getPlayerMap().get(receiver.getPlayerId());
                if(receiverPlayer == null) {
                    totalMessageCount = 1;
                    receiverPlayer = receiver;
                    receiverPlayer.setReceivedMessageCount(totalMessageCount);
                    Map<Long, Player> receiverMap = new HashMap<Long,Player>();
                    receiverMap.put(receiver.getPlayerId(), receiver);
                    sender.setPlayerMap(receiverMap);
                } else {
                    totalMessageCount = receiverPlayer.getReceivedMessageCount() + 1;
                    receiverPlayer.setReceivedMessageCount(totalMessageCount);
                    sender.getPlayerMap().put(receiver.getPlayerId(), receiverPlayer);
                }
            }
        }

        if(totalMessageCount == 0) {
            throw new Exception("unable to find the receiver");
        }
        return totalMessageCount;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
}
