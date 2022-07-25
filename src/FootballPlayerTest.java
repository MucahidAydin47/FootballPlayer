public class FootballPlayerTest {

    public static void main(String[] args) {

        FootballPlayer alex = new FootballPlayer();

        alex.no = 10;
        alex.name = "Alex de Souza";
        alex.minutes = 0;
        alex.inPlay = true;
        alex.numberToGoals = 0;

        alex.play(90);
        alex.score();
        alex.score();

        alex.info();

        FootballPlayer mucahid = new FootballPlayer();

        mucahid.no = 10;
        mucahid.name = "Mücahid";
        mucahid.minutes = 0;
        mucahid.inPlay = true;
        mucahid.numberToGoals = 0;


        mucahid.play(60);
        mucahid.score();
        mucahid.score();
        mucahid.score();
        mucahid.score();

        mucahid.info();

    }
}
