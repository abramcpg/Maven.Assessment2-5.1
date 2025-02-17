package rocks.zipcode.assessment2.fundamentals;

import java.util.Arrays;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        string1 += string2;
        return string1;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder string2 = new StringBuilder(string1);
        return (string2.reverse().toString());
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder string1r = new StringBuilder(string1);
        string1r.reverse();
        StringBuilder string2r = new StringBuilder(string2);
        string2r.reverse();
        string1r.append(string2r);

        return String.valueOf(string1r);
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        return string.replaceAll(String.format("[%s]", charactersToRemove), "");
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String string2 = "";
        String[] stringArray = charactersToRemove.split("");
        List<String> list = Arrays.asList(stringArray);
        for (int i = 0; i < string.length(); i++) {
            if(!(list.contains(String.valueOf(string.charAt(i))))){
                string2 += string.charAt(i);
            }
        }
        StringBuilder stringR = new StringBuilder(string2);
        return (stringR.reverse().toString());
    }
}
