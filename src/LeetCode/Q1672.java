package LeetCode;



public class Q1672 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {1,2,3,1}
        };

        int ans = 0;

        for (int person = 0; person < arr.length; person++) {
            //going to row
            int sum = 0;
            for (int account = 0; account < arr[person].length; account++) {
                //every col of each row
                sum = sum + arr[person][account];
            }

            if (sum>=ans){
                ans = sum;
            }
        }
        System.out.println(ans);


    }
}
