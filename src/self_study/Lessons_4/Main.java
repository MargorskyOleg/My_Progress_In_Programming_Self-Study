package self_study.Lessons_4;

public class Main {

    private static final int ROW = 5;//строка
    private static final int COL = 6;//колонка
    private static char[][] MATRIXTABLE = new char[ROW][COL];
    private static final String MESSAGEDECRYPTION = "";
    private static final String MESSAGEENCRYPT = "oleeuuuuxxP";
    private static final String KEYWORD = "trident";//trident трезубец
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ.,_?";

    public static void main(String[] args) {

        KeyWordProcessing keyWordProcessing = new KeyWordProcessing(MATRIXTABLE);
        keyWordProcessing.handlerKeyWord(KEYWORD + ALPHABET);

        Transcript transcript = new Transcript(MATRIXTABLE);//расшифровка
        transcript.divideTheLineIntoPairs(MESSAGEDECRYPTION);

        Encryption encryption = new Encryption(MATRIXTABLE);//шифрование
        encryption.divideTheLineIntoPairs(MESSAGEENCRYPT);
    }

//    private static String keyboard(String encryption) {
//        System.out.print(encryption + ": ");
//        Scanner scan = new Scanner(System.in);
//        return scan.next();
//    }
}
