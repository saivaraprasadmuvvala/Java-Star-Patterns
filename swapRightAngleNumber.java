public class swapRightAngleNumber {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++){ //Here i loop starts from 1 and prints up to 5 rows
            int swap = 1; //this should be printed
            if(i%2==0){
                swap = 1;  //based on the condition swap value changes
            }
            else{
                swap = 0;
            }
            for(int j = 0; j<=i; j++){  //j loop takes care of columns like i is 0 and j is 0 loop runs once 1 is printed
                System.out.print(swap+ " "); 
                swap = 1 - swap;  // the next element after printing should be opposite so we did this otherwise the whole row is gonna print the same number because of the condition we did checked on i.
            }
            System.out.println();
        }
    }
}
