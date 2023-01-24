public class isValidIP {

    public static boolean validate(String str) {
        boolean flag = false;
        String[] splited = str.split("[.]");

        if (splited.length == 4) {
            for (int i = 0; i < 4; i++) {
                if (splited[i].length() >= 0 && splited[i].length() <= 3) {
                    int temp = Integer.parseInt(splited[i]);
                    if (temp >= 0 && temp <= 255) {
                        flag = true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }

        return flag;
    }

    public static void main(String[] args) {
        String[] ip = { "259.259.259.259", "266.266.266.266", "255.255.255.255",
                "555.555.555.555", "666.666.666.666", "249.249.249.249", "249.249.249.256" };

        for (String a : ip)
            System.out.println(validate(a));
    }
}