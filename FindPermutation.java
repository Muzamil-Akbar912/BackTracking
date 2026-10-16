public class FindPermutation {
    public static void findPermutation(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);

            // delete karo current char ko
            String newStr = str.substring(0, i) + str.substring(i+1);

            findPermutation(newStr, ans+currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
