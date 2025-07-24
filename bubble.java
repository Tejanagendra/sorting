
import java.util.Arrays;

public class bubble {
    public static void main(String[] args){
        int[] arr= {3,2,1};
        int n=arr.length-1;
        for(int i=n;i>=0;i--){
            
            for(int j=1;j<=i;j++){
                if(arr[j-1]>arr[j]){
                    int temp =arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
