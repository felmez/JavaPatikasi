package BoxingBattle;

public class Main {
    public static void main(String[] args) {
        Player marc = new Player("Marc", 15, 100, 90, 50);
        Player alex = new Player("Alex", 10, 95, 100, 50);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}