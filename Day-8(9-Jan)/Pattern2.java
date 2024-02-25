public class Pattern2 {

    public static void hollowRectangle(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void inverted_Half_Rotated(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void inverted_Half_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void floyd_Triangle(int n) {
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // int temp=1;
                System.out.print(temp + " ");
                temp++;

            }
            System.out.println("");
        }

    }

    public static void zero_One_Triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }

    public static void butterfly_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void myButterfly(int n) {
        // upper loop
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // lower loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void solidRhombus(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=i-1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void myhollow_Rhombus(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            if (i==2 ||i==3 ||i==4) {
                for (int j = 1; j <=1; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <=3; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <=1; j++) {
                    System.out.print("*");
                }
            }
            if (i==1 || i==5) {
                for (int j = 1; j <=n; j++) {
                    System.out.print("*");
                }
                
            }
            System.out.println("");
        }
    }
    public static void hollow_Rhombus(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n; j++) {
                if (i==1||i==5||j==1||j==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }

    public static void diamond_Pattern(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*(i-1)+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*(i-1)+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // hollowRectangle(4,5);
        // hollowRectangle(9,15);
        // inverted_Half_Rotated(10);
        // inverted_Half_Pyramid(5);
        // floyd_Triangle(6);
        // zero_One_Triangle(5);
        // butterfly_Pattern(6);
        // myButterfly(6);//12x12
        // solidRhombus(7);
        // myhollow_Rhombus(5);
        // hollow_Rhombus(5);
        // diamond_Pattern(7);

    }
}