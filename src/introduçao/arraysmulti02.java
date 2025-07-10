package introduçao;

public class arraysmulti02 {
    public static void main(String[] args) {
        int[][] arraysInt = new int[3][];

        arraysInt [0] = new int []{1,2};
        arraysInt [1] = new int []{1,2,46};
        arraysInt [2] = new int []{1, 2, 4, 5, 6, 6};

        for (int i = 0; i < arraysInt.length; i++) {
            for (int j = 0; j < arraysInt[0].length; j++) {

            }
         for (int[]arr : arraysInt){
             for (int num : arr){
                 System.out.println(num);
             }
         }
        }
    }
}
