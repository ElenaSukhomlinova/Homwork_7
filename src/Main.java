public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] pizzaSize = new int[3];
        pizzaSize[0] = 1;
        pizzaSize[1] = 2;
        pizzaSize[2] = 3;
        System.out.println(pizzaSize[2]);

        float[] boxSize = {1.57f, 7.654f, 9.986f};
        System.out.println(boxSize[1]);

        int[] apples = {9, 5, 8, 3, 8, 2, 6};
        System.out.println(apples[5]);
        System.out.println();

        System.out.println("Задача 2");
        for (int i = 0; i < pizzaSize.length; i++) {
            if (i < pizzaSize.length - 1) {
                System.out.print(pizzaSize[i] + ",");
            } else {
                System.out.print(pizzaSize[i]);
            }
        }
        System.out.println();
        for (int n = 0; n < apples.length; n++) {
            if (n < apples.length - 1) {
                System.out.print(apples[n] + ",");
            } else {
                System.out.print(apples[n]);
            }
        }
        System.out.println();
        for (int m = 0; m < boxSize.length; m++) {
            if (m < boxSize.length - 1) {
                System.out.print(boxSize[m] + ",");
            } else {
                System.out.print(boxSize[m]);
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 3");
        for (int e = pizzaSize.length - 1; e >= 0; e--) {
            if (e > 0) {
                System.out.print(pizzaSize[e] + ",");
            } else {
                System.out.print(pizzaSize[e]);
            }
        }
        System.out.println();
        for (int k = apples.length - 1; k >= 0; k--) {
        if (k > 0) {
                System.out.print(apples[k] + ",");
            } else {
                System.out.print(apples[k]);
            }
        }
        System.out.println();
        for (int v = boxSize.length - 1; v >= 0; v--) {
            if (v > 0) {
                System.out.print(boxSize[v] + ",");
            } else {
                System.out.print(boxSize[v]);
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 4");
        for (int u = 0; u < pizzaSize.length; u++) {
            if (pizzaSize[u] % 2 != 0) {
                pizzaSize [u] = pizzaSize[u] + 1;
                System.out.println(pizzaSize[u]);
            } else {
                System.out.println(pizzaSize[u]);
            }
        }
    }
}

