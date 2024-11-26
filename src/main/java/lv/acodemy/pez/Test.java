package lv.acodemy.pez;

public class Test {
    public static void main(String[] args) {
        String input = "get 1";
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}

