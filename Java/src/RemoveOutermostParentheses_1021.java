import java.util.Stack;

/**
 * Created by: IntelliJ IDEA
 * User      : boyng
 * Date      : 06/02/2024
 * Time      : 5:48 CH
 * Filename  : RemoveOutermostParentheses_1021
 */
public class RemoveOutermostParentheses_1021 {
    public String removeOuterParentheses(String s) {
        Stack<Character> characterStack = new Stack<>();
        char[] charArray = s.toCharArray();
        int index = 0;
        StringBuilder sb = new StringBuilder("");
        int size = charArray.length;
        for (int i = 0; i < size; i++) {
            char item = charArray[i];
            if (item == '(')
                characterStack.push(item);
            else if (item == ')')
                characterStack.pop();
            if (characterStack.isEmpty() && i != 0) {
                String subString = s.substring(index, i + 1);
                String substringItem = subString.substring(1, subString.length() - 1);
                sb.append(substringItem);
                index = i + 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveOutermostParentheses_1021 test = new RemoveOutermostParentheses_1021();
        System.out.println(test.removeOuterParentheses("()()()()((()))(())"));
    }
}
