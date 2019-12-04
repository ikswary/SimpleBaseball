public class Ballcount{
    private int strike;
    private int ball;
    private int outCount;
    public int hitCount;

    void startGame(){
        String scoreBoard;
        this.ball = 0;
        this.strike = 0;
        this.hitCount = 0;
        this.outCount = 0;

        System.out.println("Starting simpleBaseball game");
        System.out.println("first hitter is in the batter box\n");
        while (this.outCount != 3) {
            callBall();
            scoreBoard = this.strike + "S " + this.ball + "B " + this.outCount + "O\n";
            System.out.println(scoreBoard);
        }
    }
    void callBall(){
        int call=(int)(Math.random() * 1000) % 4 + 1;
        this.addBallcount(call);
    }

    void addBallcount(int call){
        int strikecall = 1;
        int ballcall = 2;
        int hitcall = 3;
        int outcall = 4;
        if(call == strikecall){
            this.strike++;
            System.out.println("Call Strike");
        }

        if(call == ballcall){
            this.ball++;
            System.out.println("Call Ball");
        }

        if(call == hitcall || this.ball == 4){
            this.hitCount++;
            clearBallcount();
            System.out.println("Hit. Next hitter is in the batter box");
        }

        if(call == outcall || this.strike == 3){
            this.outCount++;
            clearBallcount();
            System.out.println("Out. Next hitter is in the batter box");
        }
    }

    void clearBallcount(){
        this.ball = 0;
        this.strike = 0;
    }
}