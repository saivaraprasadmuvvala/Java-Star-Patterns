class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++){ //if i starts from 1 not 0 or the i< not <= then only 5 rows will be printed if they both happend only 3 will be printed
            for(int j = 0; j <= 5; j++){ //if j starts from 1 not 0 or the j< not <= then only 5 rows will be printed if they both happend only 3 will be printed
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}