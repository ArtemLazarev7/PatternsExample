package structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> playerList=new ArrayList<>();

    public void addPlayer(Player player){
        playerList.add(player);
    }
    public void removePlayer(Player player){
        playerList.remove(player);
    }
    public void createTeam(){
        System.out.println("Recruiting players for the team");
        for (Player player : playerList) {
            player.toPlay();

        }
    }
}
