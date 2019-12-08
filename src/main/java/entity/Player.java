package entity;

import java.util.HashMap;
import java.util.Map;

public class Player {

    private Long playerId;

    private String name;

    private String surname;

    private int receivedMessageCount;

    private Map<Long, Player> playerMap = new HashMap<Long, Player>();

    public Player(Long playerId, String name, String surname) {
        this.playerId = playerId;
        this.name = name;
        this.surname = surname;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Map<Long, Player> getPlayerMap() {
        return playerMap;
    }

    public void setPlayerMap(Map<Long, Player> playerMap) {
        this.playerMap = playerMap;
    }

    public int getReceivedMessageCount() {
        return receivedMessageCount;
    }

    public void setReceivedMessageCount(int receivedMessageCount) {
        this.receivedMessageCount = receivedMessageCount;
    }
}
