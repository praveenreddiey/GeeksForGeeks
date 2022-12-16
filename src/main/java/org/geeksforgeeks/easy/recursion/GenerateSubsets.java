package org.geeksforgeeks.easy.recursion;

public class GenerateSubsets {
    public static void main(String[] args) {
        printSubsetsRecursion("ABC","",0);
    }
    /**
     *
     * @param str
     * @param n
     *
     * for every array/string of length n there will be 2^n sub sets, if array is {1,2,3} there will be 2^3 sub sets
     * 000,001,010,011,100,101,110,111 but for only 1,2,4 we will have single value like(001,010,100), we will get these by 1<<j
     * so to avoid any duplicants we will use '&' and left shift operator, and it has to be greater than 0
     *
     */
    static void printSubsets(String str,int n) {
        for(int i=0;i<(1<<n);i++){
            System.out.print("{ ");
            for(int j=0;j<n;j++){
                if((i & (1<<j)) > 0){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.print(" }");
            System.out.println();
        }
    }
    static void printSubsetsRecursion(String str,String current,int index) {
        if(index == str.length()){
            System.out.println("{ "+current +" }");
            return;
        }
        printSubsetsRecursion(str,current,index+1);
        printSubsetsRecursion(str,current+str.charAt(index),index+1);
    }
}
//refer https://www.geeksforgeeks.org/finding-all-subsets-of-a-given-set-in-java/