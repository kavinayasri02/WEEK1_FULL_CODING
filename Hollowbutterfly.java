public class Hollowbutterfly{
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for(int i = 1; i <= n; i++){
            // Left stars
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i) // print star at border
                    System.out.print("*");
                else
                    System.out.print(" "); // hollow inside
            }
            // Spaces
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            // Right stars
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Lower half
        for(int i = n; i >= 1; i--){
            // Left stars
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            // Spaces
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }
            // Right stars
            for(int j = 1; j <= i; j++){
                if(j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

