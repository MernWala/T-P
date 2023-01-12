/*
 * Input Format
 * Constraints
 * number will always contain more than 1 digit, i.e. N>9
 *
 * Output Format
 * ----------------
 * Sample Input 0
 * 582109
 * 
 * 5^8 + 8^2 + 2^1 + 1^0 + 0^9 + 9^0
 * 390625 + 64 + 2 + 1 + 0 + 1
 * 390693
 * 
 * Sample Output 0
 * 390693
 */

public class Number55_1 {

    public int findPower(int a, int b) {
        int result = 1;
        for(int i=1; i<=b; i++){
            result *= a;
        }
        return result;
    }

    public int num55_1(int inp){
        String num = String.valueOf(inp);
        String[] data = num.split("");
        int temp=1;
        try{
            for(int i=0; i<data.length; i++)
                temp += findPower(Integer.valueOf(data[i]), Integer.valueOf(data[i+1]));
            temp += 1;
        }catch(Exception e){
            return temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        Number55_1 obj = new Number55_1();
        System.out.println(obj.num55_1(582109));
    }
}