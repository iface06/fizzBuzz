package fizzbuzz;

import java.util.List;

public class Main {

    public static final int FIZZ_CONSTANT = 3;
    public static final int BUZZ_CONSTANT = 5;
    public static final int WOOF_CONSTANT = 7;

    public static void main(String[] args) {
        FizzBuzzWoofGame game = initGame();
        List<Score> scoring = game.play(1, 50);
        FizzBuzzStringCreator creator = new FizzBuzzStringCreator();
        creator.setSeperator(" - ");
        String printout = creator.create(scoring);

        System.out.println(printout);
    }

    private static FizzBuzzWoofGame initGame() {
        FizzBuzzWoofGame game = new FizzBuzzWoofGame();
        game.addRule(new NumberContainingRule(FIZZ_CONSTANT, "Fizz"));
        game.addRule(new DivisibleRule(FIZZ_CONSTANT, "Fizz"));
        game.addRule(new NumberContainingRule(BUZZ_CONSTANT, "Buzz"));
        game.addRule(new DivisibleRule(BUZZ_CONSTANT, "Buzz"));
        game.addRule(new NumberContainingRule(WOOF_CONSTANT, "Woof"));
        game.addRule(new DivisibleRule(WOOF_CONSTANT, "Woof"));
        return game;
    }
}
