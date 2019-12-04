public  class SimpleBaseball {

    public static void main(String[] args) {

        Ballcount ballcount = new Ballcount();
        ballcount.startGame();
        System.out.println("Hit in game: " + ballcount.hitCount + "\nGAME OVER\n");
    }
}

