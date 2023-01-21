import java.util.Scanner;

public class findIndex {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
            arr[i] = obj.nextInt();
        
        int key = obj.nextInt();
        int index = 0;
        for(int i=0; i<size; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        if(index != 0)
            System.out.println(index);
        else
        	System.out.println(-1);
    }
}