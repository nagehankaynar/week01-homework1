
public class Main {
    public static void main(String[] args) {
        int [] sayilar = new int[]{1,3,5,7,9,0,2};
        int aranacak = 6;
        boolean varMi=false;

        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMi=true;
            }
        }
        if (varMi){
            System.out.println(aranacak+" sayısı  bulunmaktadır.");
        }else {
            System.out.println("Aradığınız sayı bulunmamaktadır.");
        }
    }
}
