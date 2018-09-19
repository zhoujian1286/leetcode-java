package algorithm.leetcode.easy;

/**
 * 罗马数字包含以下七种字符：I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 * @author: zhoujian1286
 * @since: 2018/9/19
 */
public class RomaNumber2Integer013 {
    public int romanToInt(String s) {
        char[] chars = (s + " ").toCharArray();
        int index = 0;
        int value = 0;
        while (index < chars.length - 1) {
            char c = chars[index];
            String roman = "";
            if (c == 'C' && (chars[index + 1] == 'D' || chars[index + 1] == 'M')
                    || c == 'X' && (chars[index + 1] == 'L' || chars[index + 1] == 'C')
                    || c == 'I' && (chars[index + 1] == 'V' || chars[index + 1] == 'X')) {
                roman += c;
                roman += chars[index + 1];
                index += 2;
            } else {
                roman += c;
                index++;
            }
            value += getIntValue(roman);
        }
        return value;
    }

    private int getIntValue(String roman) {
        switch (roman) {
            case "M":
                return 1000;
            case "D":
                return 500;
            case "C":
                return 100;
            case "L":
                return 50;
            case "X":
                return 10;
            case "V":
                return 5;
            case "I":
                return 1;
            case "CD":
                return 400;
            case "CM":
                return 900;
            case "XL":
                return 40;
            case "XC":
                return 90;
            case "IV":
                return 4;
            case "IX":
                return 9;
            default:
                return 0;
        }
    }
}
