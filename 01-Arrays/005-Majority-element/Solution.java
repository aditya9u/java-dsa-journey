public class Solution {
  
  public static int findMajority(int[] nums){

    int ME=0,count=0;
    ME = nums[0];
    count = 1;

    for(int i=1;i<nums.length;i++){
      if(ME==nums[i]){
        count++;
      }else{
        count--;
        if(count==0){
          ME = nums[i];
          count=1;
        }
      }
    }
    int count2=0;
    for(int i=0;i<nums.length;i++){
      if(ME==nums[i]){
        count2++;
      }
    }
    if(count2>nums.length/2){
      return ME;
    }else{
      return -1;
    }

  }

  public static void main(String[] args) {
    int[] nums = {2,2,1,1,1,2,2};
    System.out.println(findMajority(nums));
  }
}
