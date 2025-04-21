class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=0;
        while(start<end) {
            int h=Math.min(height[start],height[end]);
            int width=end-start;
            int curr=h*width;
             max =Math.max(curr,max);

            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        } 
       return max; 
    }
}