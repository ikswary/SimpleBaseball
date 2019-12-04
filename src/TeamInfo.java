import java.util.Scanner;

public class TeamInfo{
    class TeamMember{
        String name;
        double hitRatio;
    }
    String teamName;
    TeamMember hitter[] = new TeamMember[9];

    public void inputTeamName(){
        Scanner sc = new Scanner(System.in);
        this.teamName = sc.nextLine();
        sc.close();
    }

    public void inputTeamMember(){
        /* 기능 구현 위해 예제출력과 다르게 작성됨
           차후 수정 필요
         */
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<9; i++){
            System.out.println("Input player Num" + i + "> name");
            this.hitter[i].name = sc.next();
            System.out.println("Input player Num" + i + "> hit ratio(0.1 < ratio < 0.5");
            this.hitter[i].hitRatio = sc.nextDouble();
        }
        sc.close();
    }








}
