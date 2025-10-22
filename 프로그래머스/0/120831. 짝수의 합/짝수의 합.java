class Solution {
    public int solution(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if (0 == i % 2) {
                sum += i;
        }
        }
        return sum;
    }
}