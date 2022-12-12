class Solution {
    public int climbStairs(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}
