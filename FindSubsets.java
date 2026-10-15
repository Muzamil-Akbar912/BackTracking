public class FindSubsets {
    public static void subsets(String str, String ans, int idx) {
        // Base case
        if (idx == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Yes choice
        subsets(str, ans+str.charAt(idx), idx+1);

        // No choice
        subsets(str, ans, idx+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsets(str, "", 0);
    }
}
