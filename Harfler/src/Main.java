
public class Main {
    public static void main(String[] args) {
        char letter = 'U';

        switch (letter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(letter + " is bold");
                break;
            default:
                System.out.println(letter + " is thin");
        }
    }
}
