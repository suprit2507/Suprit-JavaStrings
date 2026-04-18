public class StringPractice {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "i am a cat";

        // length
        System.out.println("Length of str1 is: " + str1.length());

        // concatenation
        System.out.println("Joined string: " + str1 + " " + str2);

        // uppercase
        System.out.println("Uppercase of str1: " + str1.toUpperCase());

        // substring
        System.out.println("Part of str2: " + str2.substring(1, 4));

        // equals
        System.out.println("Are both same? " + str1.equals(str2));
    }
}
