
public class Main {
    public static void main(String[] args) {
      

        int number1 = 100;
        int number2 = 125;
        int number3 = 200;
        int max = number1;

        if (max < number2){
            max = number2;
        }

        if (max < number3) {
            max = number3;
        }

        System.out.println("biggest number is : " + max);
    }
}