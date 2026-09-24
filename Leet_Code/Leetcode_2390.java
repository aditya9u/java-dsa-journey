package Leet_Code;

import java.util.Stack;

public class Leetcode_2390 {

    public String removeStars(String s) {
        
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
            stack.push(s.charAt(i));
            }else{
                stack.pop();
            }
        }
        String ans = "";

        for(char c : stack){
            ans = ans + c;
        }

        return ans;

    }
    
}
