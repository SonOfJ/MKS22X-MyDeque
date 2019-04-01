public class Calculator {
  public static double eval(String s) {
    String[] expression = s.split(" "); //Split the string at the spaces.
    MyDeque<Double> queue = new MyDeque<Double>(expression.length);
}
