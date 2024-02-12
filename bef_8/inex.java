class InternExample {
    public static void main(String[] args) {
        // Creating two string objects with the same content
        String str1 = new String("Hello");
        String str2 = "Hello";

        // Using intern() to ensure both strings share the same memory location
        String str3 = str1.intern();

        // Comparing the memory addresses of the strings
        System.out.println("Memory address of str1: " + System.identityHashCode(str1));
        System.out.println("Memory address of str2: " + System.identityHashCode(str2));
        System.out.println("Memory address of str3: " + System.identityHashCode(str3));

        // Checking if str1 and str2 have the same content
        System.out.println("str1 equals str2: " + str1.equals(str2));

        // Checking if str1 and str3 have the same content
        System.out.println("str1 equals str3: " + str1.equals(str3));
    }
}