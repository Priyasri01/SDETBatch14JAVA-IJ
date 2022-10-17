package com.syntax.class09Array;

public class ArrayFixedSize {
    public static void main(String[] args) {
        int[] nums = new int[3];

        nums[1]= 10;
        nums[2]=20;

        System.out.println(nums[0]); // note we won't get any compier error , because Array is fixed in size . for when we given size 3,  comiler will allocate space like nums[0], nums[1],nums[2].
                                     // so even we not assign the value/elemenst, compiler will provide the default value for int which is zero.

        String[] color= new String[3];

        color[0]= "White";
        color[1]="Pink";
        color[2]="balck";
        color[3]="yellow";
        System.out.println(color[4]); //note  this error , because array size is fixed  for 3 which is 0 to 3 index , but you have 4th index
                                     // and you store the value also. so,  we will get only run time error,  not copiler error.
                                     //run time error will say index outofboud for length
    }
}
