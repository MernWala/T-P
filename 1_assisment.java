import java.io.*;
import java.util.*;
import java.util.Scanner;

public class assisment1 {
    public static int add(String str){
        String[] splited = str.split("[A-z]");
        int sum = 0, temp;
        boolean flag=false;

        for(int i=0; i<splited.length; i++){
            try{
                temp = Integer.parseInt(splited[i]);
                flag = true;
                if(flag){
                    sum = sum + temp;
                }
            }catch(NumberFormatException e){
                flag = false;
            }
        }
        return sum;
    }
    public static void main(String args[]){
//        Scanner obj = new Scanner(System.in);
//        String x = obj.nextLine();
        System.out.println(add("ABcfderCT234BHJI789"));
    }
}