package com.assignment;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int k=0;
        int product=1;
        int result[]=new int[nums.length];

        while(k<nums.length){
            for(int i=0;i<nums.length;i++){
                if(i==k) continue;
                else product=product*nums[i];
            }
            result[k]=product;
            product=1;
            k++;
        }
        return result;
    }
    public static void main(String[] args) {
        ProductOfArrayExceptSelf obj=new ProductOfArrayExceptSelf();
        int a[]={1,2,3,4};
        int result[]=obj.productExceptSelf(a);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
