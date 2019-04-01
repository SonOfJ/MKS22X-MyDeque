public class Calculator {
  public static double eval(String s) {
    String[] expression = s.split(" "); //Split the string at the spaces.
    MyDeque<Double> queue = new MyDeque<Double>(expression.length);
    for (int i = 0; i < expression.length; i = i + 1) {
      try {
        queue.addLast(Double.parseDouble(expression)); //Is the thing a number?
      } catch (NumberFormatException e) { //If it's not...
      //Leave it.
      }
      if (expression[i].equals("+") && queue.size() > 1) { //Addition.
        queue.addLast(stack.removeLast() + stack.removeLast()); //Add the last two numbers.
      }
      if (expression[i].equals("-") && queue.size() > 1) { //Subtraction.
        queue.addLast(-1 * stack.removeLast() + stack.removeLast()); //Being careful about which one is supposed to be subtracted.
      }
    }
}
