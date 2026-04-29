public class rightAngleTriangleSameRowNumbers {
    public static void main(String[] args){
        for(int i = 0; i <= 5; i++){ //if i starts from 1 not 0 or the i< not <= then only 5 rows will be printed if they both happend only 3 will be printed
            for(int j = 0; j <= i; j++){ //if j starts from 1 not 0 or the j< not <= then only 5 rows will be printed if they both happend only 3 will be printed
                System.out.print(i+" "); // when i is 0 j is 0 the loop runs 1 time 0 prints when i is 1 and j will be like 2 time 0 and 1 so printing i of that particular loop value 2 times like that
            }
            System.out.println();
        }
    }
    
}
