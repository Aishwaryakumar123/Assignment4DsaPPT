import java.util.*;
public class Difference_Of_Two_Array {
    public static void main(String[] args) {
        int []nums1 ={1,2,2,3};
        int []nums2= {1,1,2,2};
        Set<Integer>s1= new HashSet<>();
        Set<Integer>s2= new HashSet<>();
        for(int i: nums1){
            s1.add(i);
        }
        for(int i: nums2){
            s2.add(i);
        }
        List<Integer>list1= new ArrayList<>();
        for(int i: s1){
            if(!s2.contains(i)){
                list1.add(i);
            }
        }
        List<Integer>list2= new ArrayList<>();
        for(int i: s2){
            if(!s1.contains(i)){
                list2.add(i);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        System.out.println(list);
        return;


    }
}
