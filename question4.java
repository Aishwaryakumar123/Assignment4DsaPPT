import java.util.*;
public class question4 {
    public static void main(String[] args) {
        int []nums={1,3,5,4};
        //int []nums=
        Arrays.sort(nums);
        int maxsum=0;
        for(int i=0;i<nums.length;i+=2){
            maxsum+=nums[i];
        }
        System.out.println( maxsum);
       // return maxsum;

    }
}
