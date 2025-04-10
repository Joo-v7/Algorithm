class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        int maxWidth = 0;
        int maxHeight = 0;
        
        // 긴 부분 -> 가로, 짧은 부분 -> 세로.
        for(int i=0; i<sizes.length; i++) { 
            if(sizes[i][0] < sizes[i][1]) {
                
                width[i] = sizes[i][1];
                height[i] = sizes[i][0];
                
            } else {
                width[i] = sizes[i][0];
                height[i] = sizes[i][1];
            }
            
            if(width[i] > maxWidth) {
                    maxWidth = width[i];
                }
                if(height[i] > maxHeight) {
                    maxHeight = height[i];
                }
            
        }
        answer = maxWidth * maxHeight;
        return answer;
    }
}