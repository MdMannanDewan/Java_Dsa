import java.util.*;

public class GetithBit {
    public static void getBit(int num, int i) {
        int bitmask = num >> i;
        if ((bitmask & 1) == 0)
            System.out.println(0);
        else
            System.out.println(1);
    }

    // set ith bit
    public static int setIthBit(int num, int i) {
        return num | (1 << i);
    }

    // clear ith bit
    public static int clearIthBit(int num, int i) {
        return num & (~(1 << i));
    }

    // update ith bit
    public static int updateIthBit(int num, int i, int newBit) {
        if (newBit == 0)
            return clearIthBit(num, i);
        else
            return setIthBit(num, i);
    }

    public static int clearRangeOfBits(int num, int i, int j) {
        int bitmask = ~((~(num & 0) >> j) << i);
        return num & bitmask;
    }

    public static void main(String[] args) {
        int num = 2515, i = 2, newBit = 7;
        // getBit(num, i);
        System.out.println(clearRangeOfBits(num, i, newBit));
    }
}
