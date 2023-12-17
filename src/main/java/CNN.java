public class CNN {
    public static void main(String[] args) {
        String a = "383393939A";
        String result = a.replaceAll("\\D", ""); // Replace all non-digit characters with an empty string
        System.out.println(result); // This will print: 383393939
    }
}
