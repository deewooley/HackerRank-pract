import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B) <=0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }

        char[] name = A.toCharArray();
        char[] name2 = B.toCharArray();
        for(int i = 0; i<name.length;i++){
            if(i==0){

                Character.toUpperCase(name[0]);
                System.out.print( Character.toUpperCase(name[0]));
            }
            else{
                System.out.print(name[i]);
            }
        }

        for(int i = 0; i<name2.length;i++){
            if(i==0){

                Character.toUpperCase(name2[0]);
                System.out.print( " "+Character.toUpperCase(name2[0]));
            }
            else{
                System.out.print(name2[i]);
            }
        }
    }
}



