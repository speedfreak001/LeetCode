public class PalindromeString {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        boolean palindrome = palindromeWithIteration(s);
        System.out.println(palindrome);
    }

    private static boolean palindrome(String s) {
        String replacedString = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder stringReversal = new StringBuilder("");
        for (int i = replacedString.length() - 1; i >= 0; i--) {
            stringReversal.append(replacedString.charAt(i));
        }
        return replacedString.equalsIgnoreCase(stringReversal.toString());
    }

    private static boolean palindromeWithRecursion(String s) {
        String replacedString = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder("");
        String reversedString = recursive(replacedString, replacedString.length() - 1, sb);
        return replacedString.equalsIgnoreCase(reversedString);
    }

    private static String recursive(String s, int index, StringBuilder sb) {
        if (index < 0) {
            return sb.toString();
        }
        sb.append(s.charAt(index));
        return recursive(s, index - 1, sb);
    }

    private static boolean palindromeWithIteration(String s) {
        String replacedString = s.replaceAll("[^a-zA-Z0-9]", "");
        String lowerString = replacedString.toLowerCase();
        int length = lowerString.length();
        for (int i = 0; i < length / 2; i++) {
            if (lowerString.charAt(i) != lowerString.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
