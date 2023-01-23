/* Learning Trick
 * 1000
 * 900
 * 500
 * 400
 * 
 * 100
 * 90
 * 50
 * 40
 * 
 * 10
 * 9
 * 5
 * 4
 * 
 * 1
 * 
 * 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
 * M     CM   D     CD   c    XC  L  XL   X  IX V  IV  I
 */

public class IntegerToRoman {
    public String IntToRoman(int num) {
        int[] intCode = { 1000, 900, 500, 400,  100,  90,  50,   40,  10,   9,    5,   4,    1 };
        String[] code = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        String sb = "";
        for (int i = 0; i < intCode.length; i++) {
            while (num >= intCode[i]) {
                sb = sb + code[i];
                num -= intCode[i];
            }
        }
        return sb;
    }

    public static void main(String[] args) {
        IntegerToRoman obj = new IntegerToRoman();
        System.out.println(obj.IntToRoman(80));
    }
}