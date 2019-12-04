import java.util.Scanner;

public class TeamInfo{
    class TeamMember{
        String name;
        double hitRatio;
    }
    String teamName;
    TeamMember hitter[] = new TeamMember[9];
    Scanner sc = new Scanner(System.in);

    public void inputTeamName(){
        this.teamName = this.sc.nextLine();
    }

    public void inputTeamMember(){
        /* 기능 구현 위해 예제출력과 다르게 작성됨
           차후 수정 필요
         */
        for(int i=0; i<9; i++){
            System.out.println("Input player Num" + i + "> name");
            this.hitter[i].name = this.sc.next();
            System.out.println("Input player Num" + i + "> hit ratio(0.1 < ratio < 0.5");
            this.hitter[i].hitRatio = this.sc.nextDouble();
        }


    }








}
