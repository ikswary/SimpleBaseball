public class Ballcount{
    private int strike;
    private int ball;
    private int outCount;
    private int leftOnBase;
    private int score;

    static void startSixInning(TeamInfo hometeam, TeamInfo awayTeam){
        int homeTeamHitter = 1;
        int awayTeamHitter = 1;

        Ballcount homescore = new Ballcount();
        Ballcount awayscore = new Ballcount();
        System.out.println("\n" + hometeam.teamName +
                                " VS " + awayTeam.teamName + " starts now\n");
        for (int i = 1; i <= 6; i++){
            System.out.println("TOP of the " + i + " Inning "
                                    + awayTeam.teamName + " attacks\n");
            awayTeamHitter = awayscore.startInning(awayTeam, awayTeamHitter);
            System.out.println("Bottom of the " + i + " Inning "
                                    + hometeam.teamName + " defenses\n");
            homeTeamHitter = homescore.startInning(hometeam, homeTeamHitter);
        }
        System.out.println("The game is over");
        System.out.println(hometeam.teamName + " VS "
                + awayTeam.teamName);
        System.out.println(homescore.score + " : " + awayscore.score);
    }

    int startInning(TeamInfo team, int nextHitter){
        String scoreBoard;
        double hitRatio;
        this.ball = 0;
        this.strike = 0;
        //this.hitCount = 0;
        this.outCount = 0;
        this.leftOnBase = 0;

        while (this.outCount != 3) {
            System.out.println("#" + nextHitter + " " + team.hitter[nextHitter-1].name);
            callBall();
            scoreBoard = this.strike + "S " + this.ball + "B " + this.outCount + "O\n";
            System.out.println(scoreBoard);
            nextHitter++;
            if (nextHitter == 10){
                nextHitter -= 9;
            }
        }
        return nextHitter;
    }
    void callBall(){
        int call=(int) (Math.random() * 1000) % 4 + 1;
        this.addBallcount(call);
    }

    void addBallcount(int call){
        final int strikecall = 1;
        final int ballcall = 2;
        final int hitcall = 3;
        final int outcall = 4;
        if (call == strikecall){
            this.strike++;
            System.out.println("Call Strike");
        }

        if (call == ballcall){
            this.ball++;
            System.out.println("Call Ball");
        }

        if (call == hitcall || this.ball == 4){
            this.leftOnBase++;
            clearBallcount();
            if (leftOnBase >= 4){
                this.score++;
            }
            System.out.println("Hit");
        }

        if (call == outcall || this.strike == 3){
            this.outCount++;
            clearBallcount();
            System.out.println("Out");
        }
    }

    void clearBallcount(){
        this.ball = 0;
        this.strike = 0;
    }
}