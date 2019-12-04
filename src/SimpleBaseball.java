import java.util.Scanner;

public  class SimpleBaseball {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initInput = 0;

        System.out.println("SimpleBaseball game");
        System.out.println("1. input data");
        System.out.println("2. print data");
        initInput = sc.nextInt();
        sc.nextLine();                     //nextInt 입력시 버퍼에 남은 enter로 인한 오작동 방지
        if(initInput == 1){
            TeamInfo team1 = new TeamInfo();

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
            sc.close();
        }
        else if(initInput == 2){
            

        }
    }

        /*
        Ballcount ballcount = new Ballcount();
        ballcount.startGame();
        System.out.println("Hit in game: " + ballcount.hitCount + "\nGAME OVER\n")
        */
}


