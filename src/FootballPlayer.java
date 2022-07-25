public class FootballPlayer {
    public int no;
    public String name;
    public boolean inPlay;
    public int minutes;
    public int numberToGoals;


    void play(int minutesToPlay) {
        minutes = minutes + minutesToPlay;
    }

    void score() {
        numberToGoals++;
    }

    void info() {
        System.out.println("Number of goals " + name + " scored: " + numberToGoals);
        System.out.println(name + " played totally " + minutes + " minustes so far.");
    }
}
