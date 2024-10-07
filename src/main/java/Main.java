public class Main {
    public static void main(String[] args) {
        double numberGen = Math.round(Math.random()*9)+1;
        int numberLucky = (int) numberGen;
        System.out.println("Your Lucky Number Today is " + numberLucky);
    }
}
