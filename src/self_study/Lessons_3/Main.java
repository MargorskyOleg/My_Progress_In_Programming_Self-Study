package self_study.Lessons_3;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//сделай отдельные функции / методы для:

//1/ выбор символа из массива матрицы ключа шифра по координатам (строка и столбец)
// с учетом перехода края (если дошел до крайней правой начинаешь слева и то же и
// для верх низ и наоборот лево - право, низ верх)

//2/ определение конкретного случая расположения пары символов в матрице-ключе
// шифрования из трех a) прямоугольник b) строка с) столбец

//3/для каждого из случаев выше согласно правил выбери из матрицы-ключа символ
// (на самом деле пару) согласно правил сдвига-нахождения символов
// (не забудь что при расшифровке правила действуют наооборот,
// при зашифровке сдвигался на позицию вниз, теперь значит вверх и так далее)

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//я тебе по условиям "выборки" из матрицы шифра подскажу: выпиши на бумажке, реальные цифры координат, сделай на реальных
// примерах, пронумеруй клетки и ты сразу увидишь, как надо проверять условиями (if) координаты: что и с чем сравнивать...

//прям возьми и пронумеруй все строки и столбцы, возьми пару символов, и выпиши их координаты типа 0, 1 и 2, 2 затем
// соотвествующие им координаты другой (расшифрованых) пары символов, посмотри на цифры, то же самое и для случая столбцы и строки


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Вариант 2 Шифр Плейфера
public class Main{

    private static String bin(String a) { //Вариант-2 разбиение строки на пары

        int i = 0;
        int k = 1;
        int b = 2;

        int j = a.length();
        char letter_1;
        char letter_2;
        char n = '\n';
        String str = null;

        while (i < j){
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
        String strBin = str;
//        System.out.print(strBin);//XE
        return strBin;
    }

    private static String binary1(String a) { //Вариант-1 разбиение строки
        int num = a.length();
        char [] letter1 = new char[num];

        for(int i = 0;i < num;i = i + 2){
            letter1[i] = a.charAt(i);
        }
//!этот метод делает массив char [] letter1, но нужно на выходе из метода выходила просто char! чтобы в дальнейшем использовать символы в матрице!
        String str1 = new String(letter1);
        return str1;//J X P . P J N Y X F . O Y L R W R G O R N O N S U L G . V L E S L F L . L _ Y G . D . S N X S P N S M A X
    }

    private static String binary2(String a) { //Вариант-1 разбиение строки
        int num = a.length();
        char [] letter2 = new char[num];

        for(int i = 1;i < num;i = i + 2){
            letter2[i] = a.charAt(i);
        }
//!этот метод делает массив char [] letter1, но нужно на выходе из метода выходила просто char! чтобы в дальнейшем использовать символы в матрице!
        String str2 = new String(letter2).trim();
        return str2;// _ F V S X H P P I T _ N X N S L O A M Y _ S L . X O X _ S B L R V P S G O S P E K X D V K T K V L L X S E
    }

    private static String playfairCipher(String a) {//метод раскодировки

//        char let1 = 'J';// 4 0 координаты
//        char let2 = '_';// 1 2 координаты

        int i = 0;
        int j = 1;
        int b = 2;
        int num = a.length();
        char letter_1;
        char letter_2;
        char n = '\n';
//!тут я уже психанул с методами разбиение строки на символы, и матрицу вложил прям в цыкол тут работает разбиение строки на символы как надо я так думаю!!! тогда осталось дело, сравнения координатами массива!
        while (i < num) {
//            System.out.println(" letter_1_i: "+a.charAt(i)+"    "+" index_i: "+i+n  //> letter_1_i: J     index_i: 0
//                              +" letter_2_j: "+a.charAt(j)+"    "+" index_j: "+j);  //> letter_2_j: _     index_j: 1
//            System.out.println(" ");

//            System.out.print(""+a.charAt(i)+a.charAt(j)+" "); //> J_ XF PV .S PX JH NP YP XI FT ._ ON YX LN RS WL RO GA OM RY N_ OS NL S. UX LO GX ._ VS LB EL SR LV FP LS .G LO _S YP GE .K DX .D SV NK XT SK PV NL SL MX AS XE

            letter_1 = a.charAt(i);
            i = i + b;
            letter_2 = a.charAt(j);
            j = j + b;


            char[][] chars = {                      //                  x               x     координаты
                    {'P', 'R', 'O', 'G', 'A', 'M'}, //   0 1 2 3 4 5  y P R O G A M  y 00 01 02 03 04 05
                    {'I', 'N', '_', 'S', 'L', 'K'}, //   1 2 3 4 5 6    I N _ S L K    10 11 12 13 14 15
                    {'E', 'X', '.', 'T', 'D', 'Y'}, //   2 3 4 5 6 7    E X . T D Y    20 21 22 23 24 25
                    {'U', 'H', 'V', 'F', 'B', 'C'}, //   3 4 5 6 7 8    U H V F B C    30 31 32 33 34 35
                    {'J', 'Q', 'W', 'Z', ',', '?'}  //   4 5 6 7 8 9    J Q W Z , ?    40 41 42 43 44 45
            };

            for (int x = 0; x < chars.length; x++) {
                for (int y = 0; y < chars[0].length; y++) {

                    if (letter_1 == chars[x][y] | letter_2 == chars[x][y]) {//>нахождение всех смволов в матрице
//                        System.out.print(x + " " + y + " ");//>1 2 4 0 2 1 3 3 0 0 3 2 1 3 2 2 0 0 2 1 3 1 4 0 0 0 1 1 0 0 2 5 1 0 2 1 2 3 3 3 1 2 2 2 0 2 1 1 2 1 2 5 1 1 1 4 0 1 1 3 1 4 4 2 0 1 0 2 0 3 0 4 0 2 0 5 0 1 2 5 1 1 1 2 0 2 1 3 1 1 1 4 1 3 2 2 2 1 3 0 0 2 1 4 0 3 2 1 1 2 2 2 1 3 3 2 1 4 3 4 1 4 2 0 0 1 1 3 1 4 3 2 0 0 3 3 1 3 1 4 0 3 2 2 0 2 1 4 1 2 1 3 0 0 2 5 0 3 2 0 1 5 2 2 2 1 2 4 2 2 2 4 1 3 3 2 1 1 1 5 2 1 2 3 1 3 1 5 0 0 3 2 1 1 1 4 1 3 1 4 0 5 2 1 0 4 1 3 2 0 2 1

//!мне не понятней когда я нахожу два символа с разными координатами 'сверху строчка if (letter_1 == chars[x][y] | letter_2 == chars[x][y])', и я хочу видеть в консоли эти координаты двух
//!символов мне достаточно написать один раз x и y вот так System.out.println(x + " " + y + " ") может мне символы искать по очереди одним каналом вот так if (letter_1 == chars[x][y])!

//                        System.out.print(chars[x][y]+" ");//>_ J X F P V S . P X H J P N P Y I X T F _ . O N X Y N L R S L W R O G A O M R Y N _ O S N L S . X U O L G X _ . S V L B L E R S L V P F S L G . O L _ S P Y G E K . X D . D S V N K X T S K P V N L S L M X A S E X

//!тут я не пойму как что счем сравнивать, X с X или chars[x] с chars[x]?

//                    } else if (chars[x] != chars[x] | chars[y] != chars[y]) {//тест прямоугольник. немогу сравнить координаты для прямоугольника!
//                        System.out.println(x + " " + y);
//                    } else if (y == y) {

                        //прямоугольник b) строка с) столбец

                    }
                }
            }
        }
        String letterPlayfairCipher = new String();
        return letterPlayfairCipher;
    }

    public static void main(String[] args) {
        String cipher = "J_XFPV.SPXJHNPYPXIFT._ONYXLNRSWLROGAOMRYN_OSNLS.UXLOGX._VSLBELSRLVFPLS.GLO_SYPGE.KDX.DSVNKXTSKPVNLSLMXASXE";

//!тут проблема с методами bin или binary1 binary2 низнаю какой вариант люче, в них описаны проблемы!
//        String stringBin = bin(cipher); //Вариант 2 разбиение строки на пары
//
//        String stringBinary1 = binary1(cipher);//Вариант 1 разбиение строки //>J X P . P J N Y X F . O Y L R W R G O R N O N S U L G . V L E S L F L . L _ Y G . D . S N X S P N S M A X
//
//        String stringBinary2 = binary2(cipher);//Вариант 1 разбиение строки //> _ F V S X H P P I T _ N X N S L O A M Y _ S L . X O X _ S B L R V P S G O S P E K X D V K T K V L L X S E

        String messages = playfairCipher(cipher);

    }
}













////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Вариант 1 Шифр Плейфера
//public class Main {
//
//    private static String playfairCipher(String a) {//метод раскодировки
//        int i = 0;
//        int j = 1;
//        int b = 2;
//        char letter_1;
//        char letter_2;
//        char n = '\n';
//
//        while (i < a.length()) {
////            System.out.println(" letter_1_i: "+a.charAt(i)+"    "+" index_i: "+i+n  //> letter_1_i: J     index_i: 0
////                              +" letter_2_j: "+a.charAt(j)+"    "+" index_j: "+j);  //> letter_2_j: _     index_j: 1
////            System.out.println(" ");
//
////            System.out.print(""+a.charAt(i)+a.charAt(j)+" "); //> J_ XF PV .S PX JH NP YP XI FT ._ ON YX LN RS WL RO GA OM RY N_ OS NL S. UX LO GX ._ VS LB EL SR LV FP LS .G LO _S YP GE .K DX .D SV NK XT SK PV NL SL MX AS XE
//
//            letter_1 = a.charAt(i);
//            i = i + b;
//            letter_2 = a.charAt(j);
//            j = j + b;
//
//            char[][] chars = {                 //               x               x
//                    {'P','R','O','G','A','M'}, //0 1 2 3 4 5  y P R O G A M  y 00 01 02 03 04 05
//                    {'I','N','_','S','L','K'}, //1 2 3 4 5 6    I N _ S L K    10 11 12 13 14 15
//                    {'E','X','.','T','D','Y'}, //2 3 4 5 6 7    E X . T D Y    20 21 22 23 24 25
//                    {'U','H','V','F','B','C'}, //3 4 5 6 7 8    U H V F B C    30 31 32 33 34 35
//                    {'J','Q','W','Z',',','?'}  //4 5 6 7 8 9    J Q W Z , ?    40 41 42 43 44 45
//            };
////                           y  y     x  x        x  x  x     x     x              y     y              x        x           x  x     x  x  x     x  x        x //это координаты где совподают по координатом строка столбец
////J_ XF PV .S PX JH NP YP XI FT ._ ON YX LN RS WL RO GA OM RY N_ OS NL S. UX LO GX ._ VS LB EL SR LV FP LS .G LO _S YP GE .K DX .D SV NK XT SK PV NL SL MX AS XE
//            //letter_1
////J  X  P  .  P  J  N  Y  X  F  .  O  Y  L  R  W  R  G  O  R  N  O  N  S  U  L  G  .  V  L  E  S  L  F  L  .  L  _  Y  G  .  D  .  S  N  X  S  P  N  S  M  A  X //letter_1
////40 21 00 22 00 40 11 25 21 33 22 02 25 14 01 42 01 03 02 01 11 02 11 13 30 14 03 22 32 14 20 13 14 33 14 22 14 12 25 03 22 24 22 13 11 21 13 00 11 13 05 04 21//это координаты из матрицы символа [x][y]
//            //letter_2                                                                                                       ^
//// _  F  V  S  X  H  P  P  I  T  _  N  X  N  S  L  O  A  M  Y  _  S  L  .  X  O  X  _  S  B  L  R  V  P  S  G  O  S  P  E  K ^X  D  V  K  T  K  V  L  L  X  S  E//letter_2
////12 33 32 13 21 31 00 00 10 23 12 11 21 11 13 14 02 04 05 25 12 13 14 22 21 02 21 12 13 34 14 01 32 00 13 03 02 13 00 20 15 21 24 32 15 23 15 32 14 14 21 13 20//это координаты из матрицы символа [x][y]
//                                                                                                                           //^если совпадает первое число координата символа с верхним первым числом координата смвола то это строка
//            for (int x = 0; x < chars.length; x++) {                        //>P I E U J
//                for (int y = 0; y < chars[0].length; y++) {                 //PROGAM IN_SLK EX.TDY UHVFBC JQWZ,?
//
//                    if (letter_1 == chars[x][y] | letter_2 == chars[x][y]) { // нахождение всех смволов в матрице
////                        System.out.print(chars[x][y]+""+" ");
////_  J  X  F  P  V  S  .  P  X  H  J  P  N  P  Y  I  X  T  F  _  .  O  N  X  Y  N  L  R  S  L  W  R  O  G  A  O  M  R  Y  N  _  O  S  N  L  S  .  X  U  O  L  G  X  _  .  S  V  L  B  L  E  R  S  L  V  P  F  S  L  G  .  O  L  _  S  P  Y  G  E  K  .  X  D  .  D  S  V  N  K  X  T  S  K  P  V  N  L  S  L  M  X  A  S  E  X
////12 40 21 33 00 32 13 22 00 21 31 40 00 11 00 25 10 21 23 33 12 22 02 11 21 25 11 14 01 13 14 42 01 02 03 04 02 05 01 25 11 12 02 13 11 14 13 22 21 30 02 14 03 21 12 22 13 32 14 34 14 20 01 13 14 32 00 33 13 14 03 22 02 14 12 13 00 25 03 20 15 22 21 24 22 24 13 32 11 15 21 23 13 15 00 32 11 14 13 14 05 21 04 13 20 21
////                        System.out.println(" letter_1_i: "+letter_1+"    "+" index_i: "+i+n +" letter_2_j: "+letter_1+"    "+" index_j: "+j);
//
//
//
//
//                        if ((x==x | y!=y)) { //тест прямоугольник немогу сравнить координаты
////                            System.out.print(letter_1+""+letter_2+" ");
//
//
//                        } else if (letter_1 == chars[x][0] | letter_2 == chars[x][0]) {//тест строка
////                            System.out.print(letter_1 + "" + letter_2 + " ");
//
////                            if (x == chars[x].length+1) {
////                                x = -chars[x].length-1;
////                                System.out.print(letter_1+""+letter_2+" ");
//                        }
//
//
//                        } else if (letter_1 == chars[0][y] | letter_2 == chars[0][y]) {//тест столбец
//                            System.out.print(letter_1+""+letter_2+" ");
//
//                    }
//                }
//            }
//        }
//        return a;
//    }
//
//    public static void main(String[] args) {
//        String cipher = "J_XFPV.SPXJHNPYPXIFT._ONYXLNRSWLROGAOMRYN_OSNLS.UXLOGX._VSLBELSRLVFPLS.GLO_SYPGE.KDX.DSVNKXTSKPVNLSLMXASXE";
//
//        String messages = playfairCipher(cipher);
////        System.out.println("'"+messages+"'");
//    }
//}












//дальше моя история, попыток! там все на удаление!
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//public class Main {
//
//    public static String binary(String a) {//метод первый парные буквы "J_"
//
//        return a;
//    }
//
//    public static String playfairCipher(String a) {//метод раскодировки
//
//        return a;
//    }
//
//    public static void main(String[] args) {
//        String cipher = "J_XFPV.SPXJHNPYPXIFT._ONYXLNRSWLROGAOMRYN_OSNLS.UXLOGX._VSLBELSRLVFPLS.GLO_SYPGE.KDX.DSVNKXTSKPVNLSLMXASXE";
//
//        String stringBinary = binary(cipher);
////        System.out.println("'"+stringBinary+"'");//'J_'
//
////        String messages = playfairCipher(stringBinary);
////        System.out.println("'"+messages+"'");
//
////        int i = 0;
////        int j = 1;
////        int b = 2;
////        char letter_1 = 0;
////        char letter_2 = 0;
//////        char n = '\n';
////
////        while (i < cipher.length()) {
////
//////            System.out.println(" letter_1_i: "+cipher.charAt(i)+"    "+" index_i: "+i+n
//////                              +" letter_2_j: "+cipher.charAt(j)+"    "+" index_j: "+j);
//////            System.out.println(" ");
////            //System.out.print(""+cipher.charAt(i)+cipher.charAt(j)+" ");
////
////            letter_1 = cipher.charAt(i);
////            i = i + b;
////            letter_2 = cipher.charAt(j);
////            j = j + b;
////        }
//
//        char letter_1 = 'L';//id первоя буква строки, тест для нахождения первого символа в матрице
//        char letter_2 = 'B';//id второя буква строки, тест для нахождения второго символа в матрице
//
//        char[][] chars = {                     //                  x               x
//                    {'P','R','O','G','A','M'}, //   0 1 2 3 4 5  y P R O G A M  y 00 01 02 03 04 05
//                    {'I','N','_','S','L','K'}, //   1 2 3 4 5 6    I N _ S L K    10 11 12 13 14 15
//                    {'E','X','.','T','D','Y'}, //   2 3 4 5 6 7    E X . T D Y    20 21 22 23 24 25
//                    {'U','H','V','F','B','C'}, //   3 4 5 6 7 8    U H V F B C    30 31 32 33 34 35
//                    {'J','Q','W','Z',',','?'}  //   4 5 6 7 8 9    J Q W Z , ?    40 41 42 43 44 45
//        };
//
//        for (int x = 0; x < chars.length; x++) {//PIEUJ
//            for (int y = 0; y < chars[0].length; y++) {//PROGAM IN_SLK EX.TDY UHVFBC JQWZ,?
//
//                if (letter_1 == chars[x][y] || letter_2 == chars[x][y]) {//прямоугольник
//
//                } else if (letter_1 == chars[x][0] | letter_2 == chars[x][0]) {//строка
//
//                    char f = chars[x][0];
////                    System.out.print(letter_1);//L => D
//
//                    if (x == chars[x].length) {
//                        x = -chars[x].length;
//                    }
////                } else if (letter_1 == chars[0][y] | letter_2 == chars[0][y]) {//столбец
//                }
//            }
//        }
//    }
//}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//...

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//public class Main {
//
////    public static String binary(String a) {//метод первый парные буквы "J_"
////        int i = 0;
////        int j = 1;
////        int num = a.length();
////        char letter_1;
////        char letter_2;
////        char n = '\n';
////        String bin;
////
////        while (i < a.length()) {
////            int b = 2;
////
////            System.out.println(" letter_1_i: "+a.charAt(i)+"    "+" index_i: "+i+n
////                              +" letter_2_j: "+a.charAt(j)+"    "+" index_j: "+j);
////            System.out.println(" ");
////
////            letter_1 = a.charAt(i);
////            i = i + b;
////            System.out.println(letter_1);
////
////            letter_2 = a.charAt(j);
////            System.out.println(letter_2);
////
////            System.out.println(i);
////            System.out.println(j);
////
////
////
////            return ""+letter_1+letter_2+""; //J_
////        }
////        return null;    //return bin;//XE
////    }
//
////    public static String playfairCipher(String a) {//метод раскодировки
////
////        return a;
////    }
//
//    public static void main(String[] args) {
//        String cipher = "J_XFPV.SPXJHNPYPXIFT._ONYXLNRSWLROGAOMRYN_OSNLS.UXLOGX._VSLBELSRLVFPLS.GLO_SYPGE.KDX.DSVNKXTSKPVNLSLMXASXE";
//
////        String stringBinary = binary(cipher);
////        System.out.println("'"+stringBinary+"'");//'J_'
//
////        String messages = playfairCipher(stringBinary);
////        System.out.println("'"+messages+"'");
//
//
//
//        int i = 0;
//        int j = 1;
//        int b = 2;
//        char letter_1;
//        char letter_2;
//        char n = '\n';
//        String bun;
//
//        while (i < cipher.length()) {
//
////            System.out.println(" letter_1_i: "+cipher.charAt(i)+"    "+" index_i: "+i+n
////                              +" letter_2_j: "+cipher.charAt(j)+"    "+" index_j: "+j);
////            System.out.println(" ");
////            System.out.print(""+cipher.charAt(i)+cipher.charAt(j)+" ");
//            letter_1 = cipher.charAt(i);
//            i = i + b;
//            letter_2 = cipher.charAt(j);
//            j = j + b;
//
//        }
//
////        char chars_1 = cipher.charAt(i);//id первоя буква строки, тест для нахождения первого символа в матрице
////        char chars_2 = cipher.charAt(j);//id второя буква строки, тест для нахождения второго символа в матрице
//
//        char[][] chars = {
//                {'P','R','O','G','A','M'}, //0.1.2.3.4.5
//                {'I','N','_','S','L','K'}, //1.2.3.4.5.6
//                {'E','X','.','T','D','Y'}, //2.3.4.5.6.7
//                {'U','H','V','F','B','C'}, //3.4.5.6.7.8
//                {'J','Q','W','Z',',','?'}  //4.5.6.7.8.9
//        };
//
////я знаю такой подход по нахождению нужного символа в матрице
//        for (int x = 0;x < chars.length;x++){
//            char ch_1 = chars[x][0];
////            System.out.print(ch_1);//P I E U J
//            for (int y = 0;y < chars[0].length;y++){
//                char ch_2 = chars[x][y];
////                System.out.print(ch_2);//PROGAM IN_SLK EX.TDY UHVFBC JQWZ,?
//                if (chars_1 == chars[x][y] | letter_2 == chars[x][y]){   //прямоугольник
//
//                    System.out.println("letter_chars: " + chars[x][y]);    //chars[x][y]J_  chars[y][x]AX
//
//
//
////                } else if(chars_1 == chars[x][0] || chars_2 == chars[x][0]){    //строка
////
////                } else if(chars_1 == chars[0][y] || chars_2 == chars[x][y]){    //столбец
//
//                }
//            }
//        }
//    }
//}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        for (int y = 0; y < chars.length; y++) {
//            for (int x = 0; x < chars[0].length; x++) {
//                char ch_2 = chars[y][x];
//                if (b == ch_2 | e == ch_2) {
//                    System.out.println("let: " + ch_2);
//
//                }
//            }
//        }

//        for (int y = 0;y < chars.length;y++){
//            char ch_1 = chars[y][0];
////            System.out.print(ch_1);//P I E U J
//            for (int x = 0;x < chars[0].length;x++){
//                char ch_2 = chars[y][x];
////                char ch_3 = chars[y][x];
////                System.out.print(ch_2);//PROGAM IN_SLK EX.TDY UHVFBC JQWZ,?
//                if (b == ch_2 | e == ch_2){
//                    System.out.println("let: "+ ch_2);
//
//                }
//            }
//            System.out.println(" ");
//        }

//        int i = 0;
//        char ch = chars[0][0];
//        while (r < ch){
//            ch = chars[0][0+1];
//            System.out.println(ch);
//        }

//        for(int i = 0;i < chars[0].length;i++){
//            char x = chars[0][0]++;
//            System.out.println(x);//P Q R S T U
//        }

//        System.out.println(chars[0][0]);//P
//        System.out.println(ch);//P

//        if (r == ch){
//
//            ch = chars[0][0]++;
//
//        }

//        char ch = chars[0][0];
//        System.out.println(chars[0][0]++);//Q
//        System.out.println(chars[0][0]);//P
//        System.out.println(chars[0][0]+1);//81
//        System.out.println(chars[0][0+1]);//R
//        System.out.println(chars[0][0]);
//        System.out.println(ch);//P
//        System.out.println(ch+1);//81

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        int i,j;//координаты
//        for (i = 0;i < chars[0].length;i++) {       //4 читать строчки
//            char[] d4 = chars[0];                   //1 строчка пять буквы PROGAM
////            System.out.print(d4[i]+" ");  //P R O G A M
////            System.out.print(d4[0]);      //PPPPPP
////            System.out.print(chars[0]);   //PROGAM PROGAM PROGAM PROGAM PROGAM PROGAM
////            System.out.print(chars[i]);   //PROGAMIN_SLKEX.TDYUHVFBCJQWZ,?
//            char[] d1 = chars[0];
////            System.out.print(d1);         //PROGAMPROGAMPROGAMPROGAMPROGAMPROGAM
////            System.out.print(d1[i]);      //PROGAM
////            System.out.println(d1[0]);    //P P P P P P
//            char[] d2 = chars[i];
////            System.out.println(d2[i]);    //P N . F ,
////            System.out.println(d2[0]);    //P I E U J
//
////            System.out.print(d4[i] + "" + i+ " ");//1 строчка пять буквы P0 R1 O2 G3 A4 M5
////            if (r == d4[i]){                //R
////                System.out.println(d4[i]);  //R
////            }
//
////            System.out.print();
//
////            if (i < chars.length+1){    //если доходит чтение до конца строки то вернуца назад!
////                i = -chars.length;      //-5 смволов
////            }
//            for (j = 0;j < chars[0].length;j++){
//                System.out.println(i);
////
////                System.out.print(chars[i]);
////                System.out.print(chars[j]);
//
//////                if (r == d4[i]){                    //R
//////                    System.out.println(d4[j]);    //R
//////                }
//////                System.out.println(" ");
//            }
//
////            System.out.print(chars[i] + "" + i+ " ");//1 строчка пять буквы P0 R1 O2 G3 A4 M5
//
//
//
////            char[] d5 = chars[i];
////            System.out.println(chars[i]);
//
////            System.out.println(chars[i]);         //P I E U J
////            System.out.print(d5[i]);         //1 строчка пять буквы PROGAM
////            System.out.print(i);            //1 строчка пять буквы
////            System.out.println(chars[i]);   //прочитаны 4 строчки
////            System.out.println(d);          //прочитаны 4 строчки
////            System.out.println(d[0]);       //4 строчки первой буквы
////            System.out.println(d[1]+" ");   //4 строчки второй буквы
//        }
//    }

//
//        chars[x] == a.charAt(i)
//        chars[y] == a.charAt(j)
//
//

//        if (a.charAt(i) == a.charAt(j) | a.charAt(i) == a.charAt(j-1)){
//
//            a.charAt(j);
//
//        }
//    }
//}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Если буквы появляются в одном столбце таблицы, замените их буквами ниже
// соответственно (обертывание в верхнюю сторону столбца, если буква в
// исходной паре находится на нижней стороне столбца).
//Если буквы не находятся в одной строке или столбце, замените их буквами
// на том же ряду соответственно, но на другой паре углов прямоугольника,
// определяемого исходной парой. Порядок важен - первая буква зашифрованной
// пары - это та, которая лежит в той же строке, что и первая буква пары
// открытого текста.

//Если обе буквы одинаковы, добавьте «X» после первой буквы
//или осталось только одна буква, добавьте «X» после первой буквы

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Шифр Плейфера
//Ииии таааак!
//
//Наше новое мега-супер-пупер задание!!!
//
//Расшифровать секретное послание.
//Используется уже известный Playfair cipher.
//Но не простой, а слегка другой (wink) Что б отпал соблазн взять готовые решения.
//
//Отличия от классического:
// - матрица кодировки 5x6 (пять строк по 6 символов в каждой), оригинальный вариант 5x5
// - J и I - это разные буквы (нам не надо экономить символы ибо теперь у нас 5x6=30)
// - к заглавным буквам латинского алфавита от A до Z добавляются символы
//	‘_’ - пойдет вместо пробела,
//	‘.’ - точка,
//	‘,’ - запятая,
//	‘?’ - знак вопроса
// - всего получается 26 (буквы алфавита) + 4 символа = 30 (как раз по размеру нашей матрицы кодировки)
//
//Значит, так как, у нас J и I - это разные буквы, никаких замен J на I производить не надо.
//Пробел, уже был заменен на ‘_’, соотвественно в раскодированой строке слова будут соединены нижним подчеркиваниями, ВОТ_ТАК_ВОТ.  Это нормально, надо так и оставить.
//
//Также, помни, что суть алгоритма такова, что одна из повторяющихся  букв (еще перед шифрованием) заменяются на X, соотвественно в расшифрованном тексте,
// оригинальное слово COLLABORATIVE будет выглядеть как COLXABORATIVE - это тоже нормально, и так и должно быть.
//
//Ну а случае раскодирования,  как твоя задача, это и не проблема, выводи расшифрованную строку, как есть.
//По правде, тебе даже не обязательно морочить себе голову этими деталями, ты уже выполняешь расшифровку, и матрица кода у тебя есть!
//Просто не удивляйся, что в расшифровке ТЕКСТ_БУДЕТ_ВЫГЛЯДЕТЬ_ВОТ_ТАК_ВОТ. Ну только на английском конечно (wink)
//
//Матрицу шифрования - дешифрования я тебе уже приготовил. Просто возьми ее тут. Естественно, ты можешь переводить ее в любые другие форматы данных, как посчитаешь нужным.
//
//{
//{'P', 'R', 'O', 'G', 'A', 'M'}
//{'I', 'N', '_', 'S', 'L', 'K'}
//{'E', 'X', '.', 'T', 'D', 'Y'}
//{'U', 'H', 'V', 'F', 'B', 'C'}
//{'J', 'Q', 'W', 'Z', ',', '?'}
//};
//
//Шифровка послания (помни, что важно скопировать все символы в точности, и ни одного не потерять!):
//
//J_XFPV.SPXJHNPYPXIFT._ONYXLNRSWLROGAOMRYN_OSNLS.UXLOGX._VSLBELSRLVFPLS.GLO_SYPGE.KDX.DSVNKXTSKPVNLSLMXASXE
//
//Удачи и успеха!

//#######################################################################
//тест на писании метода
//class Main {
//    public static void main(String[] args) {
//        int w = 5;
//        int h = 2;
//        int a = computeArea(w, h);
//        System.out.println("Area is " + a);
//        //Area is 10
//    }
//
//    public static int computeArea(int width, int height) {
//        int area;
//        area = width * height;
//        return area;
//    }
//}
