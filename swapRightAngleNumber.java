public class swapRightAngleNumber {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++){
            int swap = 1;
            if(i%2==0){
                swap = 1;
            }
            else{
                swap = 0;
            }
            for(int j = 0; j<=i; j++){
                System.out.print(swap+ " ");
                swap = 1 - swap;
            }
            System.out.println();
        }
    }
}
