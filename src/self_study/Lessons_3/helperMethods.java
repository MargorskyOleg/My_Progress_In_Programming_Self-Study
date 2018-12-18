package self_study.Lessons_3;

public class helperMethods{

    public static String splitStringAsPairs(String a) { //Вариант-2 разделить строку как пары

        int i = 0;
        int k = 1;
        int b = 2;
        int num = a.length();

        char letter_1;
        char letter_2;
        char n = '\n';
        String str = null;

        while (i < num){
//            System.out.println(" letter_1_i: "+a.charAt(i)+"    "+" index_i: "+i+n
//                              +" letter_2_k: "+a.charAt(k)+"    "+" index_k: "+k);
//            System.out.println(" ");
//            System.out.print(""+a.charAt(i)+a.charAt(j)+" ");
            letter_1 = a.charAt(i);
            i = i + b;
            letter_2 = a.charAt(k);
            k = k + b;

            str = letter_1 + "" + letter_2;
            System.out.print(str+" ");//>J_ XF PV .S PX JH NP YP XI FT ._ ON YX LN RS WL RO GA OM RY N_ OS NL S. UX LO GX ._ VS LB EL SR LV FP LS .G LO _S YP GE .K DX .D SV NK XT SK PV NL SL MX AS XE
//!тут проблема, из цыкла немогу вывисти нормально текст обработаный, вот этот текст целиком "J_ XF PV .S PX JH NP YP..." если ставлю в конце цыкла return str; то он выводит посление два символа! пачему?
//            return str;
        }
        String strStringAsPairs = str;
//        System.out.print(strBin);//XE
        return strStringAsPairs;
    }

    public static String splitStringAsArrayOfFirstLetter(String a) { //Вариант-1 разбиение строки
        int num = a.length();
        char [] letter1 = new char[num];

        for(int i = 0;i < num;i = i + 2){
            letter1[i] = a.charAt(i);
        }
//!этот метод делает массив char [] letter1, но нужно на выходе из метода выходила просто char! чтобы в дальнейшем использовать символы в матрице!
        String str1 = new String(letter1);
        return str1;//J X P . P J N Y X F . O Y L R W R G O R N O N S U L G . V L E S L F L . L _ Y G . D . S N X S P N S M A X
    }

    public static String splitStringAsArrayOfSecondLetter(String a) { //Вариант-1 разбиение строки
        int num = a.length();
        char [] letter2 = new char[num];

        for(int i = 1;i < num;i = i + 2){
            letter2[i] = a.charAt(i);
        }
//!этот метод делает массив char [] letter1, но нужно на выходе из метода выходила просто char! чтобы в дальнейшем использовать символы в матрице!
        String str2 = new String(letter2).trim();
        return str2;// _ F V S X H P P I T _ N X N S L O A M Y _ S L . X O X _ S B L R V P S G O S P E K X D V K T K V L L X S E
    }



}
