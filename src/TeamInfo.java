import java.util.Scanner;

public class TeamInfo{
    TeamMember hitter[] = new TeamMember[9];
    String teamName;

    public TeamInfo(){
        for (int i = 0; i < 9; i++){
            this.hitter[i] = new TeamMember();
        }
    }

    public void inputTeamName(String name){
        this.teamName = name;
    }

    public void inputTeamMember(int i, String name, double ratio){
        /* 기능 구현 위해 예제출력과 다르게 작성됨
           차후 수정 필요
        */
        this.hitter[i].name = name;
        this.hitter[i].hitRatio = ratio;
        System.out.println("Input player Num " + i + "> " + hitter[i].name+ " " + " " + hitter[i].hitRatio );
    }
}
