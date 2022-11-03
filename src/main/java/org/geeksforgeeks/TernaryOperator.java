package org.geeksforgeeks;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 100, b = 50, c = 30, result;

        //result holds max of three
        //numbers
        result = ((a>b) ? (a>c) ? a:c
                :(b>c)?b:c);

        //this is same as below if else statements
//        if(a>b){
//            if(a>c){
//                result = a;
//            }else{
//                result =b;
//            }
//        }
//        else if(b>c){
//            result = b;
//        }
//        else
//            result =c;
        System.out.println("Max of three numbers = "+result);
    }

}
