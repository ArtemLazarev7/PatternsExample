package structuralPatterns.composite;




public class Game {
    public static void main(String[] args) {
        Team team=new Team();

        Player firstForward=new Forward();
        Player firstDefender=new Defender();
        Player coalkeeper=new Goalkeeper();

        team.addPlayer(firstForward);
        team.addPlayer(firstDefender);
        team.addPlayer(coalkeeper);

        team.createTeam();
    }
}
