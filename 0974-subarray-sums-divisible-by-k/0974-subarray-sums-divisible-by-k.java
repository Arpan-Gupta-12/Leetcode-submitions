class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int [] freq=new int [k];
        freq[0]=1;
        int ans=0;
        int pfx_Sum=0;
        
        for(int i=0;i<nums.length;i++)
        {
          pfx_Sum=(pfx_Sum+nums[i])%k;
          if(pfx_Sum<0)
          {
             pfx_Sum+=k;
          }
          ans+=freq[pfx_Sum];
          freq[pfx_Sum]++;
        }
        return ans;
    }
}