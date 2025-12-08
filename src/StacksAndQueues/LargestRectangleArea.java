package StacksAndQueues;

import java.util.Stack;

class LargestRectangleArea {
    public static void main(String[] args) {
        int[] heights = {6, 4, 5, 2, 4, 3, 9};
        System.out.println(largestRectangleArea1(heights));
        System.out.println(largestRectangleArea2(heights, 0, heights.length - 1));
        System.out.println(largestRectangleArea3(heights));
        System.out.println(largestRectangleArea(heights));
    }

    // optimized using monotonic stacks
    public static int largestRectangleArea(int[] heights) {
        int max = 0; int currHeight; int n = heights.length;
        if(n == 0) return n;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i = 0; i < heights.length; i++)
        {
            while(stack.peek() != -1 && heights[i] <= heights[stack.peek()])
            {
                currHeight = heights[stack.pop()];
                max = Math.max(max, (currHeight * (i - stack.peek() - 1)));
            }
            stack.push(i);
        }
        while(stack.peek() != -1)
        {
            currHeight = heights[stack.pop()];
            max = Math.max(max, (currHeight * (n - stack.peek() - 1)));
        }
        return max;
    }

    // brute force approach
    public static int largestRectangleArea1(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < heights.length; j++) {
                min = Math.min(min, heights[j]);
                max = Math.max(max, min * (j - i + 1));
            }
        }
        return max;
    }

    //divide and conquer approach
    public static int largestRectangleArea2(int[] heights, int start, int end) {
        if (start > end) {
            return 0;
        }
        int minIndex = start;
        for (int i = start; i <= end; i++) {
            if (heights[i] < heights[minIndex]) {
                minIndex = i;
            }
        }
        return Math.max(
                (heights[minIndex] * (end - start + 1)),
                Math.max(
                        largestRectangleArea2(heights, start, minIndex - 1),
                        largestRectangleArea2(heights, minIndex + 1, end)
                )
        );
    }

    // pse and nse method
    public static int largestRectangleArea3(int[] heights) {
        int[] pse = prevSmallerElement(heights);
        int[] nse = nextSmallerElement(heights);
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            max = Math.max(max, heights[i] * (nse[i] - pse[i] - 1));
        }
        return max;
    }

    public static int[] prevSmallerElement(int[] heights) {
        int[] pse = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            pse[i] = -1;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                pse[i] = stack.peek();
            }
            if (stack.isEmpty() || heights[stack.peek()] < heights[i]) {
                stack.push(i);
            }
        }
        return pse;
    }

    public static int[] nextSmallerElement(int[] heights) {
        int[] nse = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            nse[i] = heights.length;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nse[i] = stack.peek();
            }
            if (stack.isEmpty() || heights[stack.peek()] < heights[i]) {
                stack.push(i);
            }
        }
        return nse;
    }
}