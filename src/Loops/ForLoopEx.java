package Loops;

public class ForLoopEx {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i<1001; i++){
            if(i%15==0){
                sum += i;
                count++;
                System.out.println("Here is the loop: " + count);
            }
            if(count==5) break;
        }
        System.out.println("Here is the sum of the numbers: " + sum);

    }
}
