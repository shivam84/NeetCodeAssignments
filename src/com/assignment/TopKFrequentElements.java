package com.assignment;

import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        if (nums == null || nums.length == 0) {
            int []result=new int[1];
            return result;
        }
        if(nums.length==1) return new int[]{nums[0]};
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> entryList=new ArrayList<>(map.entrySet());
        Collections.sort(entryList,(e1,e2)->e1.getValue().compareTo(e2.getValue()));
        int i=entryList.size()-1;
        int []result=new int[k];
        int j=0;
        while(k>0){
            result[j]=entryList.get(i).getKey();
            j++;
            k--;
            i--;
            j++;
        }
        return result;
         }

         public static void main(String[] args) {
        TopKFrequentElements obj=new TopKFrequentElements();
        int a[]={1,2,2,3,3,3,4,4};
        int k=2;
        int result[]=obj.topKFrequent(a,k);
        System.out.println(result[0]+" "+result[1]);
         }
}
