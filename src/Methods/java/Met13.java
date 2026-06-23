package Methods.java;

public class Met13 {
    /*static int add(int a, int b, int c) {
        return a + b + c;
    }


    static void main(String[] args) {
        int x = 5;
        int y = 5;
        int z = 5;

        System.out.println(add(x, y, z));
    }
}*/

    /*static boolean isPositive(int n) {
        if (n < 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a = 0;

        boolean b = isPositive(a);
        System.out.println(b);
    }
}*/

    static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }
        if (b >= a && b >= c) {
            return b;
        }

        return c;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int z = 8;
        System.out.println(max(x, y, z));
    }
}



