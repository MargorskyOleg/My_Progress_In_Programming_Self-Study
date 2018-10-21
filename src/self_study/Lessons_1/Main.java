package self_study.Lessons_1;

public class Main {
    // :First, solve the problem. Then, write the code.
    // считает позиции всех букв "e"
    // e :22 30 44 56 72 80 90
    //FzirrBsDtP,m UsJoOlQvXef xtUhiep LpYr`oUbVlhe_mg.O WTshMeKnK,J nwhr^iotVeM ztRhQek McVo`dRer.W

    public static void main(String[] args) {
        String s = "FzirrBsDtP,m UsJoOlQvXef xtUhiep LpYr`oUbVlhe_mg.O WTshMeKnK,J nwhr^iotVeM ztRhQek McVo`dRer.W";

        int num = s.length();                                                                                           //число элиментов в num 94    спомошью length() можно подсчитать сколько символов встроке!
        char[] letter = new char[num];                                                                                  //[a][.][.]... = 1 2 3...

        for (int i = 0; i < num; i = i + 2) {                                                                           //+2 94->
            letter[i] = s.charAt(i);                                                                                    //s.charAt(i); символ в указанной позиции;
        }

        System.out.print(letter);                                                                                       //:First, solve the problem. Then, write the code.
        System.out.println();
        String decryptionLetter = new String(letter);

        char e = 'e';
        сharacterSearchAndPrint(decryptionLetter,e);
    }

    public static void character(){

    }

    public static void сharacterSearchAndPrint(String a,char b) {
        int e = a.indexOf(b);
        while (e != -1) {
            System.out.print(e + " ");
            e = a.indexOf(b, e + 1);
        }
    }
}



//        int num = s.length();                                                                                         //число элиментов в num 94    спомошью length() можно подсчитать сколько символов встроке!
//        char[] letter = new char[num];                                                                                //[a][.][.]... = 1 2 3...
//
//        for (int i = 0; i < num; i = i + 2) {                                                                         //+2 94->
//            letter[i] = s.charAt(i);                                                                                  //s.charAt(i); символ в указанной позиции;
//        }
//
//        System.out.print(letter);                                                                                     //:First, solve the problem. Then, write the code.
//        System.out.println(" ");                                                                                      //:" "
//
//        String result = new String(letter);
//
//        int e = result.indexOf("e");                                                                                  //создана переменная e, и присваевается индекс первого указываного символа "e" из данной строки result           //для цыкла!
//        while (e != -1){                                                                                              //условия цыкла (переменная e с индексом 22 не равна -1 не найденого символа)
//            System.out.print(e + " ");                                                                                //вывод в консоль по очерёдно найденые инлексы
//            e = result.indexOf("e",e+1);                                                                              //к переменной е присваевается найденые индексы указыванного символа "e" из данной строки result, num_1 начиная поиск с указанного индекса,
//        }                                                                                                             //+1 после нахожения индекса продолжыть поиск
//    }
//}














////        String st = "0123456e89ezxy";
//        int q = 0;
//        int e = result.indexOf("e", q+1);   //22
//        System.out.print(e + " ");
//    }
//}


//        int e22 = result.indexOf("e");
//        while (e22 != -1) {
//            //e22++;
//            e22 = result.indexOf("e");
//            System.out.print(e22 + " ");
//            //:30 44 56 72 80 90 -1
//        }
//    }
//}

//        do{
//                                                                                                                      //сделать что то! цыкол выполнится хотябы один раз! а потом проверяется условия!
//        }while (    );{                                                                                               //()условия истено!
//                                                                                                                      //{}телоцыкла код который не обходимо выполнить до тех пор пока условия истено
//            if (    ){                                                                                                //если это!
//
//            }else {                                                                                                   //иначе так
//
//            }
//        }

        //indexOf(str: "возвращает индекс в данной строке первого вхождения указанного символа" fromIndex: начиная поиск по указанному индексу); или -1, если символ не встречается.

//        public int indexOf(int ch)                — возвращает индекс в данной строке первого вхождения указанного символа
//        public int indexOf(int ch, int fromIndex) — возвращает индекс в данной строке первого вхождения указанного символа, начиная поиск по указанному индексу, или значение -1, если символ не встречается.
//        int indexOf(String str)                   — возвращает индекс в данной строке первого вхождения указанной подстроки. Если эта подстрока не встречается, возвращается -1.
//        int indexOf(String str, int fromIndex)    — возвращает индекс в данной строке первого вхождения указанной подстроки, начиная с указанного индекса. Если не встречается, возвращается -1.

//        int num2 = 0;
//        while (num2 < result.lastIndexOf("e")){                                                                       //()условия                   {}телоцыкла код который не обходимо выполнить до тех пор пока условия истено
//            num2 = result.indexOf("e",num2+1);
//            System.out.print(num2 +" ");                                                                              //:22 30 44 56 72 80 90
//        }

//        int num2 = 0;
//        while (num2 < result.lastIndexOf("e")){                                                                       //()условия                   {}телоцыкла код который не обходимо выполнить до тех пор пока условия истено
//            num2 = result.indexOf("e",num2+1);
//            System.out.print(num2 +" ");                                                                              //:22 30 44 56 72 80 90
//        }

//        int num2 = 0;
//        while (num2 < result.length()){                                                                               //()условия                   {}телоцыкла код который не обходимо выполнить до тех пор пока условия истено
//            num2 = result.indexOf("e",num2+1);
//            System.out.print(num2 +" ");                                                                              //:22 30 44 56 72 80 90 -1 22 30 44 56 72 80 90 -1 22 30 44 56 72 80 90 -1...
//        }

//        int num2 = 0;
//        int num3 = result.length();
//        while (num2 < num3){                                                                                          //()условия                   {}телоцыкла код который не обходимо выполнить до тех пор пока условия истено
//            num2 = result.indexOf("e",num2+1);
//            System.out.print(num2 +" ");                                                                              //:22 30 44 56 72 80 90 -1 22 30 44 56 72 80 90 -1 22 30 44 56 72 80 90 -1...
//        }



//        int num2 = 0;
//  //      System.out.print(num2+" ");
//        while (num2 < result.indexOf("e",num2+1)) {                                                                   //()условия                   {}телоцыкла
//               num2 = result.indexOf("e",num2+1);
////        //    System.out.print(result.indexOf("e",num2+1) +" ");
////            System.out.print(num2 +" ");
//        }


//        String result = new String(letter);
////        System.out.print(result+" ");                 //:First, solve the problem. Then, write the code.
//        int num2 = result.indexOf(0);
////        System.out.print(num2+" ");                    //:1
//        while (num2 < result.length()){
//            num2++;
////            System.out.print(num2+" ");                //:2 3 4 5 6 7 8 9 10 11 12 13 14 15...
//            if(num2 == result.indexOf("e",num2)){
//                System.out.print(num2+" ");              //:22 30 44 56 72 80 90
//            }
//        }


//        int index = s.indexOf("e");
//        while (index < s.length()){
//            if(index == s.indexOf("e",index)){
//                System.out.print(index+" ");
//            }
//            index++;
//        }


//        int num = s.length();
//        char[] letter = new char[num];
//        for (int i = 0; i < num; i=i+2){
//            letter[i] = s.charAt(i);
//            if(index == s.indexOf("e",index)){
//                System.out.print(index+" ");
//            }
//        }
//        System.out.println(letter);

//        int index = s.indexOf("e");
//        while (index < s.length()){
//            if(index == s.indexOf("e",index)){
//                System.out.print(index+" ");
//            }
//            index++;
//        }

//        int num = s.length();
//        int vc = s.indexOf("e");
//        char[] letter = new char[num];
//
//        for (int i = 0; i < num; i=i+2){
//            letter[i] = s.charAt(i);
//
//            if(vc == s.indexOf("e",vc)){
//                System.out.print(vc+" ");
//            }
//            vc++;
//        }
//        System.out.println(" ");
//        System.out.print(letter);
            //:22 30 44 56
            //:F i r s t ,   s o l v e   t h e   p r o b l e m .   T h e n ,   w r i t e   t h e   c o d e .

        /*
        char[] array = s.toCharArray();
        char lett = 'e';
        int count = 0;
        for(char c: array){
            if(c == lett)
                count++;
        }
        System.out.println("Found " + count + "'" + lett + "'" +" letter");
        //:Found 7'e' letter

        int index1 = s.indexOf("e");            //
        char[] let = new char[index1];
        while (index1 < s.length()){            //
            if(index1 == s.indexOf("e")){
                System.out.print(index1+" ");
            }
            index1++;                           //
        }
        System.out.println(index1);                   //souf следуешия строка
        //:22 94

        int a = 0;
        while(a < 10) {
            System.out.print(a+" ");
            a++;
            //:0 1 2 3 4 5 6 7 8 9

        }*/
//    }
//}