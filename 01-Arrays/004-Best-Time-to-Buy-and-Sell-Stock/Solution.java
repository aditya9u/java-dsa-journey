public class Solution {

  public static int BestTimeToBuyAndSell(int[] price){

   //If I have to think with brute force
   int max = 0;
   for(int i=0;i<price.length;i++){
    for(int j=i+1;j<price.length;j++){
      if(price[j]-price[i]>max){
        max = price[j]-price[i];
      }
    }
   }

   return max;

  }
  public static int OptimumBTTBAS(int[] price){

    int min = price[0];
    int max = 0;
    for(int i=0;i<price.length;i++){
      if(min>price[i]){
        min=price[i];
        if(price[i]-min > max){
          max = price[i] - min;
        }
      }else{
        if(price[i]-min > max){
          max = price[i] - min;
        }
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] price = {7,6,4,3,1};
    System.out.println(OptimumBTTBAS(price));
  }
  
}
