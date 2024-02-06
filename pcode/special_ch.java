public class special_ch {
    public static void main(String[] args) {

        String input = "programming";
        char targetChar = 'm';
        int occurrenceCount = countOccurrences(input, targetChar);

        System.out.println("String: " + input);
        System.out.println("Occurrences of '" + targetChar + "': " + occurrenceCount);
        
    }

    public static int countOccurrences(String str, char targetChar) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == targetChar) {

                count++;

            }
        }

        return count;
    }
}
