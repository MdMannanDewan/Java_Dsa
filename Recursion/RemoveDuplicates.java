
public class RemoveDuplicates {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currentChar = str.charAt(idx);
        if (map[currentChar - 'a']) {
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currentChar), map);
        }
    }

    public static void rmDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // main logic
        char ch = str.charAt(idx);
        if (map[ch - 'a']) {
            rmDuplicate(str, idx + 1, newStr, map);
        } else {
            map[ch - 'a'] = true;
            rmDuplicate(str, idx + 1, newStr.append(ch), map);
        }
    }

    public static void main(String[] args) {
        // boolean arr[] = new boolean[26];
        // String str = "bangladesh";
        // StringBuilder newStr = new StringBuilder("");
        // removeDuplicates(str, 0, newStr, arr);
        rmDuplicate("australia", 0, new StringBuilder(""), new boolean[26]);
    }
}
