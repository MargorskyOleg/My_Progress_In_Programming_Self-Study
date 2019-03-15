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

    //to correctly quit app this method should finally returns to main
    public static void theChoiceActions(){
        char E = 'E',T = 'T',Q = 'Q',M = 'M';
        boolean isAppContinue = true; // to perform 'choices' loop till user decided to quit
        while (isAppContinue) {
            System.out.print("Encrypt\t\t = E\n" + "Decrypt\t\t = T\n" + "Show Matrix  = M\n" + "Quite\t\t = Q\n" + "ChoiceNextChar:");
            String stScan = keyboard();

            // making input UPPERCASE all the time to allow user to use for choices lowercase and UPPERCASE symbols
            Character charScan = Character.toUpperCase(stScan.charAt(0));

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
                isAppContinue = toContinueOrQuite(); //Method name changed as new na,e better descibes method functionality
            }
            System.out.println("\n");
        }
    }

    //it is better to return value than calling other method which previously called this one
    //potential problems with jard to manage and hard to debug
    public static boolean toContinueOrQuite(){
        char Y = 'Y';//Yes
        char N = 'N';//No
        System.out.print("\nare you sure you want to go out\n"+"Yes click = Y\n"+"No  click = N\n"+"Quite:");
        while (true){
            Scanner scanner1 = new Scanner(System.in);
            String stScan = scanner1.nextLine();
            Character charScan =  Character.toUpperCase(stScan.charAt(0)); //making input UPPERCASE for end-user confort
            System.out.println();

            if(Y == charScan){
                return false; // true is mean to Continue, false - not to continue
                //scanner1.close(); //not sure scanner close is important here in case we properly return from this method
            }
            if(N == charScan){
                return true; // true is mean to continue
                //startNextKey(); // it was bad practice to call methods from method previously calledmamam
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

        //startNextKey(); //again !!! you are calling method which called this one BAD BAD BAD!!!
        //you just simply need to return to main
    }

    private static void Transcript(){
        System.out.println();
        System.out.print("Decrypt:");
        MESSAGEDECRYPTION = keyboard();

        Transcript transcript = new Transcript(MATRIXTABLE, ROW, COL);//расшифровка
        transcript.divideTheLineIntoPairs(MESSAGEDECRYPTION);
        System.out.println("\n");
       // startNextKey(); the same problem as Encryption
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