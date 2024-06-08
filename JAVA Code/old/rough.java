public class rough {
    public static void main(String[] args) {
        String mainString = "This is a sample string aaa with a substring.";
        String substringToCheck = "aaa";

        if (mainString.contains('aaa')) {
            System.out.println("Substring 'aaa' is present in the string.");
        } else {
            System.out.println("Substring 'aaa' is not present in the string.");
        }
    }
}
