package self_study.Lessons_1;

public class Main {
    // First, solve the problem. Then, write the code.
    // считает позиции всех букв "e"
    // e 22 30 44 56 72 80 90
    //FzirrBsDtP,m UsJoOlQvXef xtUhiep LpYr`oUbVlhe_mg.O WTshMeKnK,J nwhr^iotVeM ztRhQek McVo`dRer.W
    public static void main(String[] args) {
        String s = "FzirrBsDtP,m UsJoOlQvXef xtUhiep LpYr`oUbVlhe_mg.O WTshMeKnK,J nwhr^iotVeM ztRhQek McVo`dRer.W";

        int num = s.length();                           //число элиментов в num 94    спомошью length() можно подсчитать сколько символов встроке!
        char[] letter = new char[num];                  //[a][.][.]... = 1 2 3...

        //int letter2 = s.indexOf("e");                   //"",letter.length = 94   "e",letter.length = -1    "e" = 22


        for (int i = 0; i < num; i=i+2) {                //+2 94->
            letter[i] = s.charAt(i);                    //s.charAt(i); символ в указанной позиции;
//            letter2 = s.charAt(i);                      //letter2 = s.charAt(i); = 44
//            System.out.print(letter2 +" ");           //:70 105 114 115 116 44 32 115 111 108 118 101 32 116 104 101 32 112 114 111 98 108 101 109 46 32 84 104 101 110 44 32 119 114 105 116 101 32 116 104 101 32 99 111 100 101 46
//            System.out.print(i+" ");                  //:0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92
            //            if(letter2 == s.indexOf("e",letter2)){
            //                System.out.print(letter2+" ");          //:44 44
            //            }
        }
//        System.out.println(" ");                      //:" "
//        System.out.print(letter2+" ");                //:46
//        System.out.println(" ");                      //:" "
//        System.out.print(letter);                     //:First, solve the problem. Then, write the code.
//        System.out.println(" ");                      //:" "


        String result = new String(letter);


//        System.out.print(result+" ");                 //:First, solve the problem. Then, write the code.
        int num2 = 0;
//        System.out.print(num2+" ");                    //:1
        while (num2 < result.indexOf("e",num2+1)) {                                                                                            //result.indexOf("e",num2)) { //: 22 22 22 22 22 22 22               result.length()){
            num2 = result.indexOf("e",num2+1);
            System.out.print(result.indexOf("e",num2) +" ");                //:2 3 4 5 6 7 8 9 10 11 12 13 14 15...

//            if(num2 == result.indexOf("e",num2)){
//                System.out.print(num2+" ");              //:22 30 44 56 72 80 90
//            }
        }








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
    }
}