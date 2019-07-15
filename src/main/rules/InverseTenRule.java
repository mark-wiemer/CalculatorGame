package rules;

import base.Config;
import base.CalculatorGame;

public class InverseTenRule extends Rule {

    public CalculatorGame apply(CalculatorGame game) {
        char[] valCharArr = String.valueOf((int) game.getValue()).toCharArray();

        for (int i = 0; i < valCharArr.length; i++) {
            char element = valCharArr[i];
            if (Character.isDigit(element)) {
                int digit = element - '0'; // convert to digit
                digit = (10 - digit) % 10;
                // assign new value as character into array
                valCharArr[i] = (char) (digit + '0');
            }
        }

        int newValue = Integer.parseInt(new String(valCharArr));

        return new CalculatorGame(
            newValue,
            game.getGoal(),
            game.getMovesLeft() - 1,
            game.getRules(),
            game.getPortals()
        );
    }

    public InverseTenRule() {
        super(Config.INVERSE_TEN);
    }
}
