Max Sum Subarray of size K

class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int l=0;
        int h=k-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int res=sum;
        while(h < arr.length){
            
            l++;
            h++;
            if(h>=arr.length) break;
            sum=sum-arr[l-1]+arr[h];
            
            res=Math.max(res,sum);
        }
            return res;
        
    }
}





209. Minimum Size Subarray Sum

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int h=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        boolean flag= false;

        while(h<nums.length){
            sum=sum+nums[h];
            while(sum>=target){
                int len=h-l+1;
                l++;
                sum=sum-nums[l-1];
                res=Math.min(len,res);
                flag=true;
            }
            h++;
        }
        return flag?res: 0;
    }
}