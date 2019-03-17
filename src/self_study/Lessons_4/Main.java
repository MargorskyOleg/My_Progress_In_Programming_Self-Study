package self_study.Lessons_4;

import java.util.Scanner;

public class Main {

    private static final int ROW = 5;//строка  5 /6
    private static final int COL = 6;//колонка 6 /7
    private static char[][] MATRIXTABLE = new char[ROW][COL];
    private static String MESSAGEDECRYPTION;
    private static String MESSAGEENCRYPT;
    private static String KEYWORD;//trident трезубец
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ.,_?";// "ABCDEFGHIJKLMNOPQRSTUVWXYZ.,_?" = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_,.!?@"

    public static void main(String[] args) {
        startNextKey();
    }

    private static void startNextKey() {
        if (KEYWORD != null) {
            theChoiceActions();
        } else {
            System.out.print("Insert Key World!:");
            KEYWORD = keyboard();
            System.out.println();
            theChoiceActions();
        }
    }

    public static void theChoiceActions(){
        char E = 'E',T = 'T',Q = 'Q',M = 'M';
        boolean continueUntilItWorks = true;
        while (continueUntilItWorks) {
            System.out.print("Encrypt ------ > E\n" + "Decrypt ------ > T\n" + "Reset Matrix-- > R\n"+ "Quite -------- > Q\n" + "ChoiceNextChar--:");
            String stScan = keyboard();
            Character charScan = Character.toUpperCase(stScan.charAt(0));
            System.out.println();

            if (E == charScan) {
                keyWordProcessing();
                Encryption();
            }
            if (T == charScan) {
                keyWordProcessing();
                Transcript();
            }
            if (M == charScan){
                keyWordProcessing();
                testMatrix();
            }
            if (Q == charScan) {
                continueUntilItWorks = quite();
            }
        }
    }

    public static boolean quite(){
        char Y = 'Y',N = 'N';
        System.out.print("\nare you sure you want to go out\n"+"Yes click > Y\n"+"No  click > N\n"+"Quite------:");
        while (true){
            String stScan = keyboard();
            Character charScan = Character.toUpperCase(stScan.charAt(0));
            System.out.println();

            if(Y == charScan){
                return false;
            }
            if(N == charScan){
                return true;
            }
        }
    }

    private static String keyboard(){
        StringBuilder newstring = new StringBuilder();
        Scanner scanner1 = new Scanner(System.in);
        String string = scanner1.nextLine().replace(' ', '_');

        for(int i = 0;i < string.length();i++) {
            Character charCheck = alphabeticalCheck(string.charAt(i));

            if(charCheck != null){
                newstring.append(charCheck);
            }
        }
        return newstring.toString();
    }

    public static Character alphabeticalCheck(Character character){
        for(int i = 0;i < ALPHABET.length();i++) {
            Character charALPHABET = ALPHABET.charAt(i);
            if (charALPHABET == Character.toUpperCase(character)) {
                return character;
            }
        }
        return null;
    }

    private static void keyWordProcessing() {
        KeyWordProcessing keyWordProcessing = new KeyWordProcessing(MATRIXTABLE);
        keyWordProcessing.handlerKeyWord(KEYWORD + ALPHABET);
    }

    private static void Encryption() {
        System.out.print("Encrypt ------ : ");
        MESSAGEENCRYPT = keyboard();
        System.out.println("MESSAGEENCRYPT = "+MESSAGEENCRYPT);
        System.out.print("Encryption --- = ");

        Encryption encryption = new Encryption(MATRIXTABLE, ROW, COL);//шифрование
        encryption.divideTheLineIntoPairs(MESSAGEENCRYPT);
        System.out.println("\n");
    }

    private static void Transcript(){
        System.out.print("Decrypt --------- : ");
        MESSAGEDECRYPTION = keyboard();
        System.out.println("MESSAGEDECRYPTION = "+MESSAGEDECRYPTION);
        System.out.print("Transcript ------ = ");

        Transcript transcript = new Transcript(MATRIXTABLE, ROW, COL);//расшифровка
        transcript.divideTheLineIntoPairs(MESSAGEDECRYPTION);
        System.out.println("\n");
    }

    private static void testMatrix(){
        for(int Row = 0;Row < MATRIXTABLE.length;Row++){
            for(int Col = 0;Col < MATRIXTABLE[Row].length;Col++){
                System.out.print(MATRIXTABLE[Row][Col]);
            }
            System.out.println(" ");
        }
        System.out.println();
    }
}