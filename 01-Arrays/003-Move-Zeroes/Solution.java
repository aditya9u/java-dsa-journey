public class Solution {

  //this approach is a brute force approach
  public static void moveZeroes(int[] arr){
    int i=0,j=0,count=0;
    while(i<arr.length){
      if(arr[i]!=0){
        i++;
      }else{
        count++;
        j=i;
        while(j<arr.length-1){
          arr[j]=arr[j+1];
          j++;
        }
      }
    }
    for(int m=arr.length-count;m<arr.length;m++){
      arr[m]=0;
    }
  }

  public static void moveZeroesOptimal(int[] arr){

    int i=0,j=0;
    while(j<arr.length){
      if(arr[j]!=0){
        arr[i]=arr[j];
        i++;
        j++;
      }else{
        j++;
      }
    }
    while(i<arr.length){
      arr[i]=0;
      i++;
    }

  }

  public static void main(String[] args) {
    int[] arr = {0,1,0,3,12};
    moveZeroesOptimal(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }

  }
  
}
