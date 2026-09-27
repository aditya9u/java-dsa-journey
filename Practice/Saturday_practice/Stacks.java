import java.util.Arrays;
import java.util.Stack;

public class Practice {
    
public static int[] nextGreaterToRight(int[] nums) {
    // Create an array to store the answers.
    int n = nums.length;
    int ans[] = new int[n];


    // Create a stack for possible next-greater values.
    Stack<Integer> stack = new Stack<>();

    for(int i=n-1;i>=0;i--){
        while(!stack.isEmpty() && stack.peek()<=nums[i])stack.pop();
        ans[i] = stack.isEmpty()?-1:stack.peek();

        stack.push(nums[i]);
    }

    // Visit the input from right to left.
    //   Remove stack values that are not greater than the current value.
    //   Store -1 if the stack is empty; otherwise, store its top value.
    //   Push the current value onto the stack.

    // Return the answers.
    return ans;
}

// ...existing code...

public static int[] dailyTemperatures(int[] temperatures) {
    // Create an answer array. Default values are 0.
    int n = temperatures.length;
    int ans[] = new int[n];

    Stack<Integer> stack = new Stack<>();

    // Create a stack to store indices of unresolved days.
    for(int i=n-1;i>=0;i--){
        while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i])stack.pop();
        ans[i] = stack.isEmpty()?0:stack.peek()-i;

        stack.push(i);
    }

    // Visit the temperatures from right to left.
    //   Pop indices whose temperatures are less than or equal to today's.
    //   If the stack is not empty, calculate the index difference.
    //   Push today's index.

    // Return the answer array.
    return ans;
}

public static int largestRectangleArea(int[] heights) {
    // Store the largest area found so far.
    int area = Integer.MIN_VALUE;

    // Create a stack of bar indices.
    Stack<Integer> stack = new Stack<>();

    // Scan bars left to right, including one extra step to flush the stack.
    for (int i = 0; i < heights.length; i++) {
        while(!stack.isEmpty() && heights[stack.peek()]>heights[i]){
            int height = heights[stack.peek()];
            int width = i-stack.peek();
            area = Math.max(height*width,area);
            stack.pop();
        }

        stack.push(i);
        // Treat the extra step as a bar of height 0.

        // While the stack is not empty and the top bar is taller
        // than the current bar:
        //   Pop its index.
        //   Determine its height and left/right boundaries.
        //   Calculate its area and update the largest area.

        // Push the current index, except during the extra flush step.
    }
     while(!stack.isEmpty() && heights[stack.peek()]>-1){
            int height = heights[stack.peek()];
            int width = heights.length-stack.peek();
            area = Math.max(height*width,area);
            stack.pop();
        }

    // Return the largest area.
            return area;
}

// ...existing code...

    public static void main(String[] args) {
            int[] nums = {2, 2, 5, 6, 2, 3};
            //System.out.println(Arrays.toString(dailyTemperatures(nums)));
            System.out.println(largestRectangleArea(nums));
    }
}
