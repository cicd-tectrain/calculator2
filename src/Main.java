public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int sum = calculator.add(1,2);
        int sub = calculator.substract(5,3);
         int mul = calculator.multiply(2,5);
//        int div = calculator.divide(6,2);

        System.out.println(sum);
        System.out.println(sub);
          System.out.println(mul);
        //System.out.println(div);
    }
}