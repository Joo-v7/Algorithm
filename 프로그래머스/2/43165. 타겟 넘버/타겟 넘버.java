class Solution {
    public static int count = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return count;
    }
    
    public void dfs(int[] numbers, int depth, int target, int sum) {
        if(numbers.length == depth) {
            if(target == sum) {
                count++;
            }
            return;
        }
        
        int plus = sum+numbers[depth];
        int minus = sum-numbers[depth];
        
        dfs(numbers, depth+1, target, plus);
        dfs(numbers, depth+1, target, minus);
        
    }
    
}