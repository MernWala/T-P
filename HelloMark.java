import java.io.*;
import java.util.*;

/*
 *  HELLO MARK      ->   2619
 *  show data       ->   1122
 *  world wide web  ->   402326
 *  a a a a         ->   1111
 *  www google com  ->   231325
 */

public class HelloMark {
    public String assignment(String inp) {
        String splited[] = inp.split(" ");
        String result="";
        int temp, sum;
        for (int i = 0; i < splited.length; i++) {
            splited[i] = splited[i].toLowerCase();
            sum=0;
            temp=0;

            for (int j = 0; j < ((splited[i].length()) / 2); j++) {
                temp = Math.abs(splited[i].charAt(j) - splited[i].charAt(splited[i].length() - (j + 1)));
                sum = temp + sum;
            }

            if(splited[i].length() % 2 != 0){
                // temp = splited[i].charAt(splited[i].length()/2 + 1) - 96;   <-- error did on this line
                temp = splited[i].charAt(splited[i].length()/2) - 96;
                sum = temp + sum;
                result += String.valueOf(sum);
            }else{
                result += String.valueOf(sum);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        HelloMark sol = new HelloMark();
        String str = obj.nextLine();
        System.out.println(sol.assignment(str));
    }
}
