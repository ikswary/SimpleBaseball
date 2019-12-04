import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        TeamInfo team1 = new TeamInfo();
        Scanner sc = new Scanner(System.in);


        System.out.println("input teamname");

        team1.inputTeamName(sc.nextLine());
        for (int i = 0; i < 9; i++) {
            System.out.println("player name");
            String name = sc.nextLine();
            System.out.println("hit ratio");
            Double ratio = sc.nextDouble();
            sc.nextLine();
            team1.inputTeamMember(1, name, ratio);
        }
    }
}

