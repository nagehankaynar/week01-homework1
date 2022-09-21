
public class Main {
    public static void main(String[] args) {
        double[] myList = {2.5,4.7,3.9,5.6};
        double total =0;
        double max = myList[0];
        for (double number:myList){
            if (max<number){
                max=number;
            }
            total=total+number;
            System.out.println("Sayı : "+number);

        }
        System.out.println("Toplam : "+total);
        System.out.println("En büyük : "+max);
    }
}