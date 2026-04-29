public class charRightTriangle {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            char sai = 'A';
            for(int j = 1; j<=i; j++){
                System.out.print(sai+" ");
                sai++;
            }
            System.out.println();
        }

        for(int i = 1; i <= 5; i++){
            char sai = 'A';
            for(int j = 5; j>=i; j--){
                System.out.print(sai+" ");
                sai++;
            }
            System.out.println();
        }
//program 3
      for(int i = 0; i <= 5; i++){
            char c = (char)('A' + i);
            for(int j = 0; j<=i; j++){
                System.out.print(c+" ");
            }
            System.out.println();
        }  
    }
}
