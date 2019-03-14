package self_study.Lessons_4;

import java.util.Scanner;

public class Main {

//"1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ.,_?#$" //ROW = 6
//                                               COL = 7
//"ABCDEFGHIJKLMNOPQRSTUVWXYZ.,_?"             //ROW = 5
//                                               COL = 6

    private static final int ROW = 5;//строка  5 /6
    private static final int COL = 6;//колонка 6 /7
    private static char[][] MATRIXTABLE = new char[ROW][COL];
    private static String MESSAGEDECRYPTION;
    private static String MESSAGEENCRYPT;
    private static String KEYWORD;//trident трезубец
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ.,_?";

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
        while (true) {
            System.out.print("Encrypt\t\t = E\n" + "Decrypt\t\t = T\n" + "Show Matrix  = M\n" + "Quite\t\t = Q\n" + "ChoiceNextChar:");
            String stScan = keyboard();
            Character charScan = stScan.charAt(0);
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
                quite();
            }
            System.out.println("\n");
        }
    }

    public static void quite(){
        char Y = 'Y';//Yes
        char N = 'N';//No
        System.out.print("\nare you sure you want to go out\n"+"Yes click = Y\n"+"No  click = N\n"+"Quite:");
        while (true){
            Scanner scanner1 = new Scanner(System.in);
            String stScan = scanner1.nextLine();
            Character charScan = stScan.charAt(0);
            System.out.println();

            if(Y == charScan){
                scanner1.close();
            }
            if(N == charScan){
                startNextKey();
            }
        }
    }

    private static String keyboard(){
        Scanner scanner1 = new Scanner(System.in);
        String string = scanner1.nextLine();
        return string;
    }

    private static void keyWordProcessing() {
        KeyWordProcessing keyWordProcessing = new KeyWordProcessing(MATRIXTABLE);
        keyWordProcessing.handlerKeyWord(KEYWORD + ALPHABET);
    }

    private static void Encryption() {
        System.out.println();
        System.out.print("Encrypt:");
        MESSAGEENCRYPT = keyboard();

        Encryption encryption = new Encryption(MATRIXTABLE, ROW, COL);//шифрование
        encryption.divideTheLineIntoPairs(MESSAGEENCRYPT);
        System.out.println("\n");
        startNextKey();
    }

    private static void Transcript(){
        System.out.println();
        System.out.print("Decrypt:");
        MESSAGEDECRYPTION = keyboard();

        Transcript transcript = new Transcript(MATRIXTABLE, ROW, COL);//расшифровка
        transcript.divideTheLineIntoPairs(MESSAGEDECRYPTION);
        System.out.println("\n");
        startNextKey();
    }

    private static void testMatrix(){
        System.out.println();
        for(int Row = 0;Row < MATRIXTABLE.length;Row++){
            for(int Col = 0;Col < MATRIXTABLE[Row].length;Col++){
                System.out.print(MATRIXTABLE[Row][Col]);
            }
            System.out.println(" ");
        }
    }
}