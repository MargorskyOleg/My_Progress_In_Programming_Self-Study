package self_study.Lessons_4;

public class Main {

    private static final int ROW = 5;//строка
    private static final int COL = 6;//колонка
    private static char[][] MATRIXTABLE = new char[ROW][COL];
    private static final String MESSAGEDECRYPTION = "";
    private static String MESSAGEENCRYPT = "";
    private static final String KEYWORD = "trident";//trident трезубец
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ.,_?";

    public static void main(String[] args) {

        ;
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

//How do you think, is it possible to decipher all the DNA,to understand the principle of each protein in living cells, machine learning? if at all this is an actual question!
//GP_EEM?ZLWYECNRP_?RU.EEYJPUQRCOIYEWEENLCXPNIYGPUYEGN,ETHYDWEXIENBZAJTEYEGN?OIDIHNLOIEWG,TGFA?OEKRNDT.EE?UCUDEH.GIOKU_?JFFADTGEOIBTTDEHY?DCYGEYCJO.NARU.EWZHTYGAIQCO.SVRWRDPE
