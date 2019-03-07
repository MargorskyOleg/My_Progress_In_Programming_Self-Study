package self_study.Lessons_4;

import java.util.Arrays;

public class Main {

    private static final int ROW = 5;//строка
    private static final int COL = 6;//колонка
    private static char[][] MATRIXTABLE = new char[ROW][COL];
    private static final String MESSAGEDECRYPTION = "";
    private static final String MESSAGEENCRYPT = "oleeuuuuxxP";
    private static final String KEYWORD = "trident";//trident трезубец
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ.,_?";

    public static void main(String[] args) {

        System.out.println("Source string");
        System.out.println(MESSAGEENCRYPT);


        System.out.println("\nSame symbol in each pair replaced by 'X'");
        String resultString = SameSymbolReplacerInThePair.replaceSameSymbolInThePair(MESSAGEENCRYPT);

        System.out.println(resultString);
        String[] pairsArray = SameSymbolReplacerInThePair.splitAsPairs(resultString);
        System.out.println(Arrays.toString(pairsArray));


        String demoStr = "Hello world";
        System.out.println("\nSource string");
        System.out.println(demoStr);


        System.out.println("\nSame symbol in each pair replaced by 'X'");
        resultString = SameSymbolReplacerInThePair.replaceSameSymbolInThePair(demoStr);

        System.out.println(resultString);
        pairsArray = SameSymbolReplacerInThePair.splitAsPairs(resultString);
        System.out.println(Arrays.toString(pairsArray));

        demoStr = "Hidethegoldinthetreestump"; //https://en.wikipedia.org/wiki/Playfair_cipher
        System.out.println("\nSource string");
        System.out.println(demoStr);

        System.out.println("\nSame symbol in each pair replaced by 'X'");
        resultString = SameSymbolReplacerInThePair.replaceSameSymbolInThePair(demoStr);

        System.out.println(resultString);
        pairsArray = SameSymbolReplacerInThePair.splitAsPairs(resultString);
        System.out.println(Arrays.toString(pairsArray));

        /*
        KeyWordProcessing keyWordProcessing = new KeyWordProcessing(MATRIXTABLE);
        keyWordProcessing.handlerKeyWord(KEYWORD + ALPHABET);

        Transcript transcript = new Transcript(MATRIXTABLE);//расшифровка
        transcript.divideTheLineIntoPairs(MESSAGEDECRYPTION);

        Encryption encryption = new Encryption(MATRIXTABLE);//шифрование
        encryption.divideTheLineIntoPairs(MESSAGEENCRYPT);
        */
    }

//    private static String keyboard(String encryption) {
//        System.out.print(encryption + ": ");
//        Scanner scan = new Scanner(System.in);
//        return scan.next();
//    }
}
