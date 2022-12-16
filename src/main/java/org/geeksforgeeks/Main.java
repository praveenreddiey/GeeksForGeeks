package org.geeksforgeeks;
import org.geeksforgeeks.easy.arrays.*;
import org.geeksforgeeks.easy.recursion.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LargestElement.largestElement(new int[]{20,10,20,8,12},5);
        SortedArrayOrNot.sortedArrayOrNot(new int[]{20,20},2);
        System.out.println(SecondLargestElement.secondLargestElement(new int[]{20,10,20,8,12},5));
        ReverseArray.reverseArray(new int[]{30,20,5},3);
        RemoveDuplicates.removeDuplicates(new int[]{10,20,20,30,30},5);
        LeftRotateArrayByOne.leftRotateArrayByOne(new int[]{1,2,3,4,5},5,1);
        System.out.println(Arrays.toString(LeftRotateArrayByDPlaces.leftRotateArrayByDPlaces(new int[]{1,2,3,4,5},5,1)));
        MoveZeroesToEnd.moveZeroesToEnd(new int[]{8,5,0,10,0,20},6);
        System.out.println(findImmediateSmallerThanX.immediateSmaller(new int[]{1,2,3,4,5},5,1));
        Nto1Digits.printNTo1(5);
        System.out.println(Factorial.factorial(4));
        System.out.println(Fibbannocci.fibbannocci(7));
        System.out.println(SumOfN.sumOfNNumbers(5));
        System.out.println(Palindrome.palindromeOrNotUsingRecursion("abc",0,2));
        System.out.println(SumOfDigits.sumOfDigits(253));
        System.out.println(RopeCutting.ropeCutting(23,11,9,12));

    }
}