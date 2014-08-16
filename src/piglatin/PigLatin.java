package piglatin;

/**
 * A Pig Latin generator.
 * @author Kevin Ji <kevin.ji@outlook.com>
 */
public class PigLatin {
    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
    
    public static String pigLatinWord(String word) {
        char firstLetter = word.charAt(0);
        boolean startsWithVowel = isVowel(firstLetter);
        String newWord;
        
        if (startsWithVowel) {
            newWord = word + "way";
        } else {
            newWord = word.substring(1) + firstLetter + "ay";
        }
        
        return newWord;
    }
    
    private static boolean isVowel(char letter) {
        for (char vowel : VOWELS) {
            if (letter == vowel) {
                return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(pigLatinWord("happy"));
        System.out.println(pigLatinWord("egg"));
    }
}
