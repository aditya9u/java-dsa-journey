

import java.util.HashMap;
import java.util.HashSet;


public class Solution {

  //Brute Force approach
  public static int[] twoSumBruteForce(int[] nums, int target) {
        int[] ans = new int[2];
    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        if(nums[i]+nums[j]==target){
          ans[0] = i;
          ans[1] = j;
        }
      }
    }

    return ans;

    }

    public static int[] twoSumOptimized(int[] nums,int target){
      int[] ans = new int[2];
      HashMap<Integer,Integer> hmap = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        if(hmap.containsKey(target-nums[i])){
          ans[0]=i;
          ans[1]=hmap.get(target-nums[i]);
        }else{
          hmap.put(nums[i], i);
        }
      }

      return ans;
    }

    public static void main(String[] args) {
        // test both methods
        int[] nums = {2,11,15,7};
        int target = 9;

        int[] ans = twoSumBruteForce(nums,target);
        int[] ans2 = twoSumOptimized(nums, target);
        System.out.println(ans[0]+" "+ans[1]);
        System.out.println(ans2[0]+" "+ans2[1]);
    }
  
}
