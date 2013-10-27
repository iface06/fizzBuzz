package fizzbuzz;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FizzBuzzWoof game = initGame();
        List<Scoring> scoring = game.play(1, 50);
        FizzBuzzStringCreator creator = new FizzBuzzStringCreator();
        creator.setSeperator(" - ");
        String printout = creator.create(scoring);

        System.out.println(printout);
    }

    private static FizzBuzzWoof initGame() {
        FizzBuzzWoof game = new FizzBuzzWoof();
        game.addRule(new NumberContainingRule(3, "Fizz"));
        game.addRule(new DivisibleRule(3, "Fizz"));
        game.addRule(new NumberContainingRule(5, "Buzz"));
        game.addRule(new DivisibleRule(5, "Buzz"));
        game.addRule(new NumberContainingRule(7, "Woof"));
        game.addRule(new DivisibleRule(7, "Woof"));
        return game;
    }
}
