public class rightAngleTriangleStar {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++){ //if i starts from 1 not 0 or the i< not <= then only 5 rows will be printed if they both happend only 3 will be printed
            for(int j = 0; j <= i; j++){ //if j starts from 1 not 0 or the j< not <= then only 5 rows will be printed if they both happend only 3 will be printed
                System.out.print("*"+" "); // when i is 0 j is 0 so 1 star will be printed when i is 1 j is 0 and 1 so 2 stars will be printed when i is 2 j is 0,1,2 so 3 stars will be printed and so on
            }
            System.out.println();
        }
    }
}
