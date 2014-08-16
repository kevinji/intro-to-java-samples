package piglatin;

/**
 * A Pig Latin generator.
 * @author Kevin Ji <kevin.ji@outlook.com>
 */
public class PigLatin {
    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
    
    public static String pigLatinPhrase(String phrase) {
        String[] words = phrase.split(" ");
        
        for (int index = 0; index < words.length; index++) {
            String word = words[index];
            String newWord = pigLatinWord(word);
            words[index] = newWord;
        }
        
        String newPhrase = String.join(" ", words);
        return newPhrase;
    }
    
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
        System.out.println(pigLatinWord("happy")); // appyhay
        System.out.println(pigLatinWord("egg")); // eggway
        
        System.out.println(pigLatinPhrase("we are one big family"));
        // eway areway oneway igbay amilyfay
    }
}
