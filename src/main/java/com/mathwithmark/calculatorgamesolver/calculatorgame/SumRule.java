package com.mathwithmark.calculatorgamesolver.calculatorgame;

class SumRule extends Rule {
    @Override
    public CalculatorGame apply(CalculatorGame game) {
        int value = game.getValue();
        int sum = 0;
        while (value != 0) {
            sum += value % 10;
            value /= 10;
        }
        return CalculatorGame
            .generateGame(
                sum,
                game.getGoal(),
                game.getMovesLeft() - 1,
                game.getRules(),
                game.getPortals()
            );
    }

    SumRule() {
        super(Config.SUM);
    }
}
