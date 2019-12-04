import java.util.ArrayList;

public class TeamInfo{
    TeamMember hitter[] = new TeamMember[9];
     String teamName;

    public TeamInfo(){
        for (int i = 0; i < 9; i++){
            this.hitter[i] = new TeamMember();
        }
    }

    public void inputTeamName(String name) {
        this.teamName = name;
    }

    public void inputTeamMember(int i, String name, double ratio){
        this.hitter[i].name = name;
        this.hitter[i].hitRatio = ratio;
    }

    public void printTeamData(){
        System.out.println("Team " + this.teamName + "player's data" );
        for (int i = 0; i<9; i++){
            System.out.println("Num" + (i+1) + " " + this.hitter[i].name + ", " + this.hitter[i].hitRatio);
        }
    }

    static void printTeamIndex(ArrayList<TeamInfo> baseballTeams){
        System.out.println("Team data index");
        for (TeamInfo team : baseballTeams) {
            int x = 1;
            System.out.println(x + ". " + team.teamName);
        }
    }
}
