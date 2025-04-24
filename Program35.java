//Given two integer arrays nums1 and nums2, return an array of their intersection. Each
//element in the result must appear as many times as it shows in both arrays and you may
//return the result in sorted order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Program35 {

    public static ArrayList<Integer> usingCollectionFrameWork(int[] nums1, int[] nums2){
        HashMap<Integer,Integer> m1 = new HashMap<Integer,Integer>();
        for(int i : nums1){
            m1.putIfAbsent(i, 0);
            m1.put(i, m1.get(i)+1);
        }

        HashMap<Integer,Integer> m2 = new HashMap<Integer,Integer>();
        for(int i : nums2){
            m2.putIfAbsent(i, 0);
            m2.put(i, m2.get(i)+1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i : m1.keySet()){
            if(m2.containsKey(i)){
                int temp = Math.min(m1.get(i),m2.get(i));
                while(temp > 0){
                    ans.add(i);
                    temp--;
                }
            }
        }

        Collections.sort(ans);

        return ans;
    }

    public static ArrayList<Integer> secondMethod(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }

        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of first array : ");
        int size1 = sc.nextInt();
        int[] nums1 = new int[size1];
        System.out.println("Enter elements of first array : ");
        for(int i = 0 ; i < size1 ; i++){
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter a size of second array : ");
        int size2 = sc.nextInt();
        int[] nums2 = new int[size2];
        System.out.println("Enter elements of second array : ");
        for(int i = 0 ; i < size2 ; i++){
            nums2[i] = sc.nextInt();
        }

        System.out.println("Using Collection Framework : ");
        System.out.println(usingCollectionFrameWork(nums1, nums2));

        System.out.println("Without using hashmap : ");
        System.out.println(secondMethod(nums1, nums2));

        for(int i : nums1) System.out.print(i + " ");

        sc.close();
        
    }
}
