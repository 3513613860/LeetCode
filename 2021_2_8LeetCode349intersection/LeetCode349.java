package Code2021_2_7;

import java.util.HashSet;

public class LeetCode349 {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] array = intersection(nums1, nums2);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static  int[] intersection(int[] nums1, int[] nums2) {
        //建立HashSet
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        //将数组1的元素放入set1中
        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }

        //将数组2的元素放入set2中
        for(int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }

        //遍历set2,找到set1中不包含set2的元素，进行删除
        for(int i = 0; i < nums2.length; i++){
            if(!set1.contains(nums2[i])){
                set2.remove(nums2[i]);
            }
        }

        //将Object类型的数组转换为int类型的数组
        Object [] array1 = set2.toArray();
        int [] array2 = new int[array1.length];
        for(int i = 0; i < array1.length; i++){
            array2[i] = Integer.parseInt(array1[i].toString());
        }
        return array2;
    }
}
