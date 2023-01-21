import java.io.*;
import java.util.*;

public class StringNumAddition {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        String temp = "0";
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                temp += str.charAt(i);
            }else{
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        sum = sum + Integer.parseInt(temp);
        System.out.println(sum);
    }
}