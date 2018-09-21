package algorithm.leetcode.easy;

import java.util.LinkedList;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * @author: zhoujian1286
 * @since: 2018/9/20
 */
public class ValidParentheses020 {
    public boolean isValid(String s) {
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (c == '(' || c == '[' || c == '{') {
                list.addFirst(c);
            } else {
                if (list.size() == 0) {
                    return false;
                }
                Character first = list.removeFirst();
                if (c == ')' && first != '(') {
                    return false;
                } else if (c == ']' && first != '[') {
                    return false;
                } else if (c == '}' && first != '{') {
                    return false;
                }
            }
        }
        return list.size() == 0;
    }
}
