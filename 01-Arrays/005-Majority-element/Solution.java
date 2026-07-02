public class Solution {
  
  public static int findMajority(int[] arr){

    int ME=0,count=0;
    ME = arr[0];
    count = 1;

    for(int i=1;i<arr.length;i++){
      if(ME==arr[i]){
        count++;
      }else{
        count--;
        if(count==0){
          ME = arr[i];
        }
      }
    }
    int count2=0;
    for(int i=0;i<arr.length;i++){
      if(ME==arr[i]){
        count2++;
      }
    }
    if(count2>arr.length/2){
      return ME;
    }else{
      return -1;
    }

  }

  public static void main(String[] args) {
    int[] arr = {2,2,1,1,1,2,2};
    System.out.println(findMajority(arr));
  }
}
