public class Calculator {
  public static double eval(String s) {
    String[] expression = s.split(" "); //Split the string at the spaces.
    MyDeque<Double> queue = new MyDeque<Double>(expression.length);
    for (int i = 0; i < expression.length; i = i + 1) {
      try {
        queue.addLast(Double.parseDouble(expression[i])); //Is the thing a number?
      } catch (NumberFormatException e) { //If it's not...
      //Leave it.
      }
      if (expression[i].equals("+")) { //Addition.
        queue.addLast(queue.removeLast() + queue.removeLast()); //Add the last two numbers.
      }
      if (expression[i].equals("-")) { //Subtraction.
        queue.addLast(-1 * queue.removeLast() + queue.removeLast()); //Being careful about which one is supposed to be subtracted.
      }
      if (expression[i].equals("*")) { //Multiplication.
        queue.addLast(queue.removeLast() * queue.removeLast()); //Multiply the last two.
      }
      if (expression[i].equals("/")) { //Division.
        queue.addLast(1 / queue.removeLast() * queue.removeLast()); //Being careful about which one is the divisor.
      }
      if (expression[i].equals("%")) { //Mod.
        Double last = queue.removeLast();
        Double secondLast = queue.removeLast();
        queue.addLast(secondLast % last); //Being careful of which number is being modded.
      }
    }
    return queue.getLast();
  }
}
