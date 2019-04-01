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
    }
}
