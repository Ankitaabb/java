public class remove_duplicate {
    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);

        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        if (length < 2) {
            return str;
        }
        int tail = 1;
        for (int i = 1; i < length; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (charArray[i] == charArray[j]) {
                    break;
                }
            }
            if (j == tail) {
                charArray[tail] = charArray[i];
                ++tail;
            }
        }
        return new String(charArray, 0, tail);
    }
}
