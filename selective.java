
import java.util.Arrays;

public class selective{
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        //minimum number find chayali prati sari ,with consider i and compare with all the j's;
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            //swapping
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
        System.out.print(Arrays.toString(arr));
    }
}