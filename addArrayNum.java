public class addArrayNum {

    public static int addArray(int[] arr){
        int sum = 0;
        for(int i =0; i<arr.length; i++)
            for(int j=i; j< arr.length; j++)
                sum += arr[j];
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(addArray(arr));
    }
}
