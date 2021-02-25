package array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int remains = money - price;
        while (remains > 0) {
            for (int coin : coins) {
                if (remains - coin >= 0) {
                    remains = remains - coin;
                    rsl[size] = coin;
                    size++;
                    break;
                }
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}
