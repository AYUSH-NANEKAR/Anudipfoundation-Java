public class String {
    public static void main(String[] args) {
        String original = "Hello Java";
        System.out.println("Length: " + original.length());
        System.out.println("Character at index 1: " + original.charAt(1));
        String added = original.concat(" Developer");
        System.out.println("After concat: " + added);
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }
}
