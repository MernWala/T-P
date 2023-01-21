import java.util.Scanner;

public class licenceKeyFormating {

    public String keyGenrated(String raw, int value) {

        String[] splited = raw.split("-");
        String semiOut = "", output = "";

        for (int i = 0; i < splited.length; i++) {
            semiOut = semiOut + splited[i];
        }

        StringBuilder temp = new StringBuilder(semiOut);
        semiOut = temp.reverse().toString();

        for (int i = 1; i <= semiOut.length(); i++) {
            output = output + semiOut.charAt(i-1);
            if (i % value == 0) {
                output = output + '-';
            }
        }

        if(output.charAt(output.length() - 1) == '-'){
            output = output.substring(0, output.length() - 1);
        }

        StringBuilder temp2 = new StringBuilder(output);
        output = temp2.reverse().toString().toUpperCase();

        return output;
    }

    public static void main(String[] args) {
        licenceKeyFormating obj = new licenceKeyFormating();
        Scanner sc = new Scanner(System.in);

        // String raw = sc.next();
        // int value = sc.nextInt();

        String raw = "5F3Z-2e-9-w";
        int value = 4;

        System.out.println(obj.keyGenrated(raw, value));
    }
}
