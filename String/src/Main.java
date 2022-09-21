
public class Main {
    public static void main(String[] args) {
        String message = "Ne Mutlu Türküm Diyene";

        System.out.println("number of characters : " + message.length()); //
        System.out.println("4th character : " + message.charAt(0)); //
        System.out.println(message.concat(" test"));
        System.out.println(message.startsWith("N")); //true
        System.out.println(message.endsWith("z")); //false

        char[] characters = new char[2];
        message.getChars(0,2,characters,0);  
        for (char character : characters) {
            System.out.println(character);
        }

        System.out.println(message.indexOf('u')); //4
        System.out.println(message.lastIndexOf('u')); //7

        String newMessage = message.replace(' ','-');
        System.out.println(newMessage);

        System.out.println(message.substring(5)); //is a string
        System.out.println(message.substring(5,7)); //is

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        
    }
}
