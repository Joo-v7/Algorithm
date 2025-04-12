class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int[] answer = {0, 0};
        
        for(int height=3; height <= total/height; height++) {
            int width = total/height;
            
            if((width-2)*(height-2)==yellow) {
                answer[0]=width;
                answer[1]=height;
                break;
            } 
        }
        return answer;
    }
}

/*
brown + yellow = width * height
yellow = (width-2)*(height-2)
brown = 2width + 2height - 4
*/