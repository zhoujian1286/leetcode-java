package algorithm.leetcode.easy;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 *
 * @author: zhoujian1286
 * @since: 2018/9/19
 */
public class ReverseInteger007 {
    public int reverse(int x) {
        if (x == 0x80000000) {
            return 0;
        }
        int flag = 1;
        if (x < 0) {
            flag = -1;
            x = -x;
        }
        int[] values = new int[10];
        int i = 0;
        while (x > 0) {
            int p = x % 10;
            values[i++] = p;
            x = x / 10;
        }
        int size = values.length;
        for (int j = values.length - 1; j >= 0; j--) {
            if (values[j] == 0) {
                size--;
            } else {
                break;
            }
        }
        if (size < values.length) {
            int output = 0;
            for (int j = 0; j < size; j++) {
                int value = values[j];
                output = output * 10 + value;
            }
            return flag * output;
        } else {
            int output = 0;
            for (int j = 0; j < size - 1; j++) {
                output = output * 10 + values[j];
            }
            if (output < 214748364 || (output == 214748364 && values[size - 1] < 8)) {
                return flag * (output * 10 + values[size - 1]);
            }
        }
        return 0;
    }
}
