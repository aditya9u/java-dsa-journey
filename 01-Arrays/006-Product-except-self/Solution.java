public class Solution {

   static void ProductExceptSelf(int[] arr){

    int[] prefix = new int[arr.length];
    int[] postfix=new int[arr.length];
    prefix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
      prefix[i]=arr[i]*prefix[i-1];
    }
    
    postfix[arr.length-1]=arr[arr.length-1];
    for(int i=arr.length-2;i>=0;i--){
      postfix[i]=postfix[i+1]*arr[i];
    }

    arr[0]=postfix[1];
    arr[arr.length-1]=prefix[arr.length-2];

    for(int i=1;i<=arr.length-2;i++){
      arr[i]=prefix[i-1]*postfix[i+1];
    }

  }
  public static void main(String[] args) {

   int[] arr={1,2,3,4,5,6};

   ProductExceptSelf(arr);

   for (int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
   }
  }
  
}
