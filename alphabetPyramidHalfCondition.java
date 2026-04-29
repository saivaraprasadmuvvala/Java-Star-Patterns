public class alphabetPyramidHalfCondition {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++){
            for(int k = 0; k <= 5-i-1; k++){
                System.out.print(" ");
            }
            char c = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j = 1; j<=2*i+1; j++){
                System.out.print(c);
                if(j<=breakpoint){
                    c++;
                }
                else{
                    c--;
                }
            }
            for(int k = 0; k <= 5-i-1; k++){
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
}
