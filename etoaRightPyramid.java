public class etoaRightPyramid {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            char c = 'E';
            for(int k = 1; k <=i ; k++){
                System.out.print(c+" ");
                c--;
            }
            System.out.println();
        }
    }
}
