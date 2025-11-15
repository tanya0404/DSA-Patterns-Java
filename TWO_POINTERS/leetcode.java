88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int[] newnums=new int[m+n];
        int k=newnums.length-1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                newnums[k--]=nums1[i--];
            }
            else  newnums[k--]=nums2[j--];
            
        }
        while(i>=0){
            newnums[k--]=nums1[i--];
        }
        while(j>=0){
            newnums[k--]=nums2[j--];
        }
         for (int x = 0; x < m+n; x++) {
            nums1[x] = newnums[x];
        }
    }
}






125. Valid Palindrome

class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]", "");
        char[] arr=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}





