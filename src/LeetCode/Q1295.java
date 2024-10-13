package LeetCode;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

/*
-> Count the no of digits
-> Convert it into string and take the length
 */


public class Q1295 {
    public static void main(String[] args) {
        int[] arr = {2,3,-44,667,89};
        System.out.println(count(arr));
    }

    static int count(int[] arr){
        int ans = 0;
        for (int element : arr) {
            int count = 0;
            while(element>0){
                count = count + 1;
                element=element/10;
            }
            if(count%2==0){
                ans=ans+1;
            }
        }
        return ans;
    }
}


