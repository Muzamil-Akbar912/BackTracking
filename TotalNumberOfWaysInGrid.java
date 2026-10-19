public class TotalNumberOfWaysInGrid {
    public static int gridWays(int i, int j, int n, int m) {
        // Base case
        if (i == n-1 && j == m-1) { // condition for last cell
            return 1;
        } else if (i == n || j == m) { // boundary cross condition
            return 0;
        }

        int w1 = gridWays(i+1, j, n, m);
        int w2 = gridWays(i, j+1, n, m);
        int totalWays = w1 + w2;

        return totalWays;
    }
    public static void main(String[] args) {
        int n = 3, m = 3; // n -> no. of rows and m -> no. of columns

        System.out.println("Total no. of ways = " + gridWays(0, 0, n, m));


    }
}
