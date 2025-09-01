package StringPrograms;
//Kunal Kushwaha
public class SkipACharacter {
    public static void main(String[] args) {
        String input = "aabbbappccad";
        StringBuilder ans = new StringBuilder();
        System.out.println(skipWord3(input, ans));
//        System.out.println(skipWord2(input, ans));
//        StringBuilder ans = new StringBuilder();
//        System.out.println(skipWord(input));
//        System.out.println(skip(processed, input));
//        char[] arr = input.toCharArray();
//        System.out.println(process(arr));
    }

    static StringBuilder skipWord3(String input, StringBuilder ans) {
        if (input.isEmpty()) {
            return ans;
        }
        if (input.startsWith("app") && !input.startsWith("apple")) {
            return skipWord3(input.substring(3), ans);
        } else {
            return skipWord3(input.substring(1), ans.append(input.charAt(0)));
        }
    }

    static StringBuilder skipWord2(String input, StringBuilder ans) {
        if (input.isEmpty()) {
            return ans;
        }
        if (input.startsWith("apple")) {
            return skipWord2(input.substring(5), ans);
        } else {
            return skipWord2(input.substring(1), ans.append(input.charAt(0)));
        }
    }

    static StringBuilder skipWord1(String input) {
        StringBuilder ans = new StringBuilder();
        while (!input.isEmpty()) {
            if (input.startsWith("apple")) {
                input = input.substring(5);
            } else {
                ans = ans.append(input.charAt(0));
                input = input.substring(1);
            }
        }
        return ans;
    }

    static String skipWord(String input) {
        if (input.isEmpty()) {
            return "";
        }
        char ch = input.charAt(0);
        if (input.startsWith("apple")) {
            return skipWord(input.substring(5));
        } else {
            return ch + skipWord(input.substring(1));
        }
    }

    static StringBuilder skip(StringBuilder processed, String input) {
        if (input.isEmpty()) {
            return processed;
        }
        char ch = input.charAt(0);
        if (ch == 'a') {
            return skip(processed, input.substring(1));
        } else {
            return skip(processed.append(ch), input.substring(1));
        }
    }

    static StringBuilder process(char[] arr) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 'a') {
                ans.append(arr[i]);
            }
        }
        return ans;
    }
}
