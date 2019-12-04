import java.util.ArrayList;
import java.util.Scanner;

public  class SimpleBaseball {

    public static void main(String[] args) {
        int initInput = 0;
        int listIter = 0;
        int printControl = 0;
        int hometeam = 0;
        int awayteam = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<TeamInfo> baseballTeams = new ArrayList<TeamInfo>();

        while (true) {
            System.out.println("\nSimpleBaseball game");
            System.out.println("1. input data");
            System.out.println("2. print data");
            System.out.println("3. play game");
            initInput = sc.nextInt();
            sc.nextLine();                     //nextInt 입력시 버퍼에 남은 enter로 인한 오작동 방지
            if (initInput == 1) {
                baseballTeams.add(new TeamInfo());
                System.out.println("input teamname");
                baseballTeams.get(listIter).inputTeamName(sc.nextLine());
                for (int i = 0; i < 9; i++) {
                    int j = i + 1;
                    System.out.println("player Num" + j + "'s name");
                    String name = sc.nextLine();
                    System.out.println("hit ratio");
                    Double ratio = sc.nextDouble();
                    sc.nextLine();
                    baseballTeams.get(listIter).inputTeamMember(i, name, ratio);
                }
                listIter++;
                System.out.println("Team data input completed");
            } else if (initInput == 2) {
                TeamInfo.printTeamIndex(baseballTeams);
                System.out.println("Choose team which to show data");
                printControl = sc.nextInt();
                sc.nextLine();
                try {
                    baseballTeams.get(printControl - 1).printTeamData();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("No Team Data Exists");
                }
            } else if (initInput == 3) {
                TeamInfo.printTeamIndex(baseballTeams);
                System.out.println("Choose home team");
                hometeam = sc.nextInt();
                sc.nextLine();
                System.out.println("Choose away team");
                awayteam = sc.nextInt();
                sc.nextLine();
                Ballcount.startSixInning(baseballTeams.get(hometeam - 1),
                        baseballTeams.get(awayteam - 1));
            } else {
                System.out.println("Unexpected input");
            }
        }
    }
}




