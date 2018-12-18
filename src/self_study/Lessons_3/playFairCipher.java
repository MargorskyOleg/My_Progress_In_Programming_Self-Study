package self_study.Lessons_3;

public class playFairCipher extends helperMethods {



    public static String decoded(String a) {//метод раскодировки

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

            char[][] arrayChars = {                 //                  x               x     координаты
                    {'P', 'R', 'O', 'G', 'A', 'M'}, //   0 1 2 3 4 5  y P R O G A M  y 00 01 02 03 04 05
                    {'I', 'N', '_', 'S', 'L', 'K'}, //   1 2 3 4 5 6    I N _ S L K    10 11 12 13 14 15
                    {'E', 'X', '.', 'T', 'D', 'Y'}, //   2 3 4 5 6 7    E X . T D Y    20 21 22 23 24 25
                    {'U', 'H', 'V', 'F', 'B', 'C'}, //   3 4 5 6 7 8    U H V F B C    30 31 32 33 34 35
                    {'J', 'Q', 'W', 'Z', ',', '?'}  //   4 5 6 7 8 9    J Q W Z , ?    40 41 42 43 44 45
            };

            for (int x = 0; x < arrayChars.length; x++) {
                for (int y = 0; y < arrayChars[0].length; y++) {

                    if (letter_1 == arrayChars[x][y] | letter_2 == arrayChars[x][y]) {//>нахождение всех смволов в матрице
//                        System.out.print(x + " " + y + " ");//>1 2 4 0 2 1 3 3 0 0 3 2 1 3 2 2 0 0 2 1 3 1 4 0 0 0 1 1 0 0 2 5 1 0 2 1 2 3 3 3 1 2 2 2 0 2 1 1 2 1 2 5 1 1 1 4 0 1 1 3 1 4 4 2 0 1 0 2 0 3 0 4 0 2 0 5 0 1 2 5 1 1 1 2 0 2 1 3 1 1 1 4 1 3 2 2 2 1 3 0 0 2 1 4 0 3 2 1 1 2 2 2 1 3 3 2 1 4 3 4 1 4 2 0 0 1 1 3 1 4 3 2 0 0 3 3 1 3 1 4 0 3 2 2 0 2 1 4 1 2 1 3 0 0 2 5 0 3 2 0 1 5 2 2 2 1 2 4 2 2 2 4 1 3 3 2 1 1 1 5 2 1 2 3 1 3 1 5 0 0 3 2 1 1 1 4 1 3 1 4 0 5 2 1 0 4 1 3 2 0 2 1

//!мне не понятней когда я нахожу два символа с разными координатами 'сверху строчка if (letter_1 == chars[x][y] | letter_2 == chars[x][y])', и я хочу видеть в консоли эти координаты двух
//!символов мне достаточно написать один раз x и y вот так System.out.println(x + " " + y + " ") может мне символы искать поочедно одним каналом вот так if (letter_1 == chars[x][y])!

                        System.out.print(arrayChars[x][y]+" ");//>_ J X F P V S . P X H J P N P Y I X T F _ . O N X Y N L R S L W R O G A O M R Y N _ O S N L S . X U O L G X _ . S V L B L E R S L V P F S L G . O L _ S P Y G E K . X D . D S V N K X T S K P V N L S L M X A S E X

//!тут я не пойму что счем сравнивать, X с X или chars[x] с chars[x]?

//                    } else if (arrayChars[x] == arrayChars[x] | arrayChars[y] != arrayChars[y]) {//тест прямоугольник немогу сравнить координаты
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









    //!тут проблема с методами bin или binary1 binary2 низнаю какой вариант люче, в них описаны проблемы!

//    String encryptedMessage = new String();//>тут я остановился 18,12,2018 7:29


//    String StringAsPairs = splitStringAsPairs(encryptedMessage); //Вариант 2 разбиение строки на пары

//    String splitStringFirstLetter = splitStringAsArrayOfFirstLetter(encryptedMessage);//Вариант 1 разбиение строки //>J X P . P J N Y X F . O Y L R W R G O R N O N S U L G . V L E S L F L . L _ Y G . D . S N X S P N S M A X

//    String splitStringSecondLetter = splitStringAsArrayOfSecondLetter(encryptedMessage);//Вариант 1 разбиение строки //> _ F V S X H P P I T _ N X N S L O A M Y _ S L . X O X _ S B L R V P S G O S P E K X D V K T K V L L X S E

}
