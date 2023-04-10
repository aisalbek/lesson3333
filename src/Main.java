import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[]myArray = new int[15];
        for (int i = 0; i <myArray.length ; i++) {
           myArray[i]= random.nextInt(-5,10);
        }
        System.out.println(Arrays.toString(myArray));
        boolean p =false;
        int count=0;
        int sum=0;
        for (int i:myArray) {
           if (i<0){
               p=true;
           }
           if (i>0&&p==true){
               sum+=i;
               count++;

           }

        }
        System.out.println(sum+"/"+count+"="+sum/count);
    }
}