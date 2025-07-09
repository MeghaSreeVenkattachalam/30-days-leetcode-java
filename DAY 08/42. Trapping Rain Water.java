
class Solution {
    public int trap(int[] height) {
        
        int sum = 0;
        int left = 0;
        int right = height.length-1;
        int lmax = height[0];
        int rmax = height[height.length-1];

        while(left<right){

            if(height[left]<height[right]){

                if(height[left]>lmax){

                    lmax = height[left];

                }else{

                    sum += lmax-height[left];
                }

                left++;

            }else{

                if(height[right]>rmax){

                    rmax=height[right];

                }else{

                    sum+=rmax-height[right];

                }
                
                right--;
            }
                
        }
        return sum;


        /*
        int lb=height[0];
        int rb=height[height.length-1];
        int wl,tw;
        int res = 0;

        for(int i=1;i<=height.length-1;i++){
            lb = height[i];
            for(int j=0;j<=i-1;j++){
                if(height[j]>lb){
                    lb = height[j];
                    wl = Math.min(lb,rb);
                    tw = wl-height[i];
                    res += tw;
                }
            }

            rb = height[i];
            for(int j=i+1;j<=height.length-1;j++){
                if(height[j]>rb){
                    rb = height[j];
                    wl = Math.min(lb,rb);
                    tw = wl-height[i];
                    res += tw;
                }
            }

           
        }
        return res;*/
    }
}
