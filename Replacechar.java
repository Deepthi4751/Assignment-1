public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        String originalString = "Hello World";
        int index = 6; // Index at which character needs to be replaced
        char newChar = 'X'; // New character to replace with

        String replacedString = replaceCharAtIndex(originalString, index, newChar);
        System.out.println("Original String: " + originalString);
        System.out.println("Replaced String: " + replacedString);
    }

    public static String replaceCharAtIndex(String str, int index, char newChar) {
        if (index < 0 || index >= str.length()) {
            throw new IndexOutOfBoundsException("Index is out of bounds!");
        }

        char[] charArray = str.toCharArray();
        charArray[index] = newChar;
        return new String(charArray);
    }
}
