public class Solution {

  //Brute Force Approach 
  public void removeDuplicate(int[] arr){
    // here Brute force approach will not work as we are thinking it as O(n^2)
    //but if we use extra space then we can make problem with better time complexity
    // in this case using extra space can be brute force approach
  }

  // Two pointer approach
  public static int removeDuplicateOptimal(int[] arr){
    int i=0,j=0;

    while(j<arr.length){
      if(arr[i]==arr[j]){
        j++;
      }else{
        i++;
        arr[i]=arr[j];
        j++;
      }
    }

    return i+1;
  }

  public static void main(String[] args){

    int[] arr = {0,0,0,1,1,1,2,2,3,3,4,4,4,4,5};

    System.out.println(removeDuplicateOptimal(arr));

    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  
}
