package characters;

public class WorkingWithCharacters {
    public static void main(String[] args) {

        // casting an integer into a character
        // only its loer 16 of data are used
        char ch = (char)0XAAB0041;
        char ch1 = (char)65.89; // floating to int then int to cha

        System.out.println(ch);
        System.out.println(ch1);

        // character to integer
        int i = (int)'a';
        System.out.println(i);

        // Use implicit casting if the result of casting fit into target variable
        byte b = 'a'; // implicit casting
        int j = 'a'; // implicit casting

        byte c = '\u0000'; // implicit casting

        byte d = (byte)'\uFFF4'; // explicit casting

        System.out.println(b);
        System.out.println(j);
        System.out.println(c);
        System.out.println(d);


        char sample = '\u3fFa';

        System.out.println(sample);

        System.out.println("\\");

        System.out.println("\"");

        // Using print statements to find ASCII code
        System.out.println((int)'a');
        System.out.println((int)'1');
        System.out.println((int)'B');

        // Using print statement to find the character for decimal codes
        System.out.println((char)40);
        System.out.println((char)59);
        System.out.println((char)85);
        System.out.println((char)79);

        // Using print statement to find out the character for hexadecimal
        System.out.println((char)0x40);
        System.out.println((char)0x72);
        System.out.println((char)0x7A);


        // code that generate a random lowercase letter 97 122
        char randomCharacter = (char)('a' + (int)(Math.random() * 26));
        System.out.println(randomCharacter);


        int value = '1' + '2' * ('4' - '3') + 'b' / 'a';
        System.out.println(value);

    }
}
