public class missingCharacter {

    String missingChar(String inp, String dict) {
        String result = "", temp = inp;
        int index = temp.indexOf('_');

        inp = inp.toLowerCase();
        String[] splited = dict.toLowerCase().split(":");

        for (int i = 0; i < splited.length; i++) {
            if (splited[i].length() == inp.length()) {
                char ch = splited[i].charAt(index);
                temp = temp.replace('_', ch);
                if (temp.equalsIgnoreCase(splited[i])) {
                    result += temp + ':';
                    temp = inp;
                } else {
                    temp = inp;
                }
            }
        }
        return result.toUpperCase();
    }

    public static void main(String[] args) {
        missingCharacter obj = new missingCharacter();
        System.out.println(obj.missingChar("FI_ER", "fiber:filer:tailor:fiber:fixer"));
    }
}
