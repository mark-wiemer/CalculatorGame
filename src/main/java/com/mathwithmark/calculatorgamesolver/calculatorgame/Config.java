package com.mathwithmark.calculatorgamesolver.calculatorgame;

// TODO make multiple classes (rules, I/O, testing)
public class Config {
  /** The path to the directory containing all test cases */
  public static String TESTCASES_PATH = "test-cases";

  /** Operator index. INVALID must remain < 0 */
  public static final int INVALID = -1;
  public static final int ADD = 0;
  public static final int SUBTRACT = 1;
  public static final int MULTIPLY = 2;
  public static final int DIVIDE = 3;
  public static final int PAD = 4;
  public static final int SIGN = 5;
  public static final int DELETE = 6;
  public static final int CONVERT = 7;
  public static final int POWER = 8;
  public static final int REVERSE = 9;
  public static final int SUM = 10;
  public static final int SHIFT_RIGHT = 11;
  public static final int SHIFT_LEFT = 12;
  public static final int MIRROR = 13;
  public static final int META_ADD = 14;
  public static final int STORE = 15;
  public static final int INVERSE_TEN = 16;
  public static final int META_STORE_RULE = 17;

  /** The string for a rule with an invalid operator */
  public static final String INVALID_STRING = "INVALID";
  public static final String[] OPERATOR_STRINGS = {
    "+",
    "-",
    "*",
    "/",
    "", // PAD
    "+/-",
    "<<",
    "=>",
    "^",
    "Reverse",
    "SUM",
    "Shift >",
    "< Shift",
    "Mirror",
    "[+]",
    "Store",
    "Inv10",
    "Update Store",
  };

  public static final int[] NUM_OPERANDS = {
    1, // ADD
    1, // SUBTRACT
    1, // MULTIPLY
    1, // DIVIDE
    1, // PAD
    0, // SIGN
    0, // DELETE
    2, // CONVERT
    1, // POWER
    0, // REVERSE
    0, // SUM
    0, // SHIFT_RIGHT
    0, // SHIFT_LEFT
    0, // MIRROR
    1, // META_ADD
    0, // STORE (takes zero on creation)
    0, // INVERSE_TEN
    0, // META_STORE_RULE
  };

  /** The maximum number of digits in a CalculatorGame */
  public static final int MAX_DIGITS = 6;

  /**
   * Returns the rule string for the given operator
   * If the operator takes operands, this throws an exception
   */
  public static String ruleString(int operator) {
    if (NUM_OPERANDS[operator] != 0) {
      throw new RuntimeException("invalid number of operands");
    }
    return Config.OPERATOR_STRINGS[operator];
  }

  /**
   * Returns the rule string for the given operator and operand
   * If the operator doesn't take exactly 1 operand, this throws an exception
   */
  public static String ruleString(int operator, int operand1) {
    if (NUM_OPERANDS[operator] != 1) {
      throw new RuntimeException("invalid number of operands");
    }
    return Config.OPERATOR_STRINGS[operator] + operand1;
  }

  /**
   * Returns the rule string for the given operand and operands
   * If the operator doesn't take exactly 2 operands, this throws an exception
   */
  public static String ruleString(int operator, int operand1, int operand2) {
    if (NUM_OPERANDS[operator] != 2) {
      throw new RuntimeException("invalid number of operands");
    }
    return operand1 + Config.OPERATOR_STRINGS[operator] + operand2;
  }

  public static final int NUM_OPERATORS = OPERATOR_STRINGS.length;

  public static final String START_PROMPT = "Enter start value: ";
  public static final String GOAL_PROMPT = "Enter goal value: ";
  public static final String MOVES_PROMPT = "Enter the number of moves: ";
  public static final String RULES_PROMPT =
    "Enter one rule per line (empty string to mark end of list):\n";
  public static final String PORTALS_PRESENT_PROMPT =
    "Are there any portals for this game? (y/n): ";
  public static final String LEFT_PORTAL_PROMPT =
    "Enter the distance from the ones place of the portal on the left: ";
  public static final String RIGHT_PORTAL_PROMPT =
    "Enter the distance from the ones place of the portal on the right: ";
  public static final String AGAIN_PROMPT = "Solve again (y/n): ";
  public static final String SOLUTION_PROMPT = "Solution:";

  // TODO remove this?
  public static final String APPLY_PROMPT = "Apply ";

  /** The user input required to quit the program */
  public static final String QUIT = "n ", CONTINUE = "y ";

  /** The separator for rule input through the scanner */
  public static final String SCANNER_SEPARATOR = "\n";
  /** The separator for rule input through command-line arguments */
  public static final String CMDLINE_SEPARATOR = ",";
}