import java.util.Scanner;

// 차후 메인 메소드로 옮겨질 부분
public class ScannerTest {
    public static void main(String[] args) {
        TeamInfo team1 = new TeamInfo();
        Scanner sc = new Scanner(System.in);

        System.out.println("input teamname");
        team1.inputTeamName(sc.nextLine());
        for (int i = 0; i < 9; i++) {
            int j = i + 1;
            System.out.println("player Num" + j + "'s name");
            String name = sc.nextLine();
            System.out.println("hit ratio");
            Double ratio = sc.nextDouble();
            sc.nextLine();
            team1.inputTeamMember(i, name, ratio);
        }
        team1.printTeamData();
        sc.close()
    }
}

