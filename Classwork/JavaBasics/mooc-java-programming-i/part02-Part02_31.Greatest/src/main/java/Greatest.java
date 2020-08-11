
public class Greatest {

    public static int greatest(int int1, int int2, int int3) {
        //write some code here
        if (int1 >= int2 && int1 >= int3) {
            return int1;
        } else if (int2 > int1 && int2 > int3) {
            return int2;
        } else if (int3 > int1 && int3 > int2) {
            return int3;
        }
        return 0;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
