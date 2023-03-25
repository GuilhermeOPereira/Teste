public class Invert {
    public static void main(String[] args) {
        String original = "Hello World";
        String invertida = "";
        
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}
