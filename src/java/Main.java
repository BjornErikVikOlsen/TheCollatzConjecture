public class Main {

    static void calc(int n){

        while (n != 1)
        {
            System.out.print(n + " ");
            // If n is odd
            if ((n & 1) == 1)
                n = 3 * n + 1;
                // If even
            else
                n = n / 2;
        }
        // Print 1 at the end
            System.out.print(n);
    }

    public boolean isEven(int i){
        if (i % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            System.out.println("\n");
            calc(i);
        }
    }
}
