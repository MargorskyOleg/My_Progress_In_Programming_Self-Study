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

        for (int i = 0; i < num; i=i+2) {                //+2 94->
            letter[i] = s.charAt(i);                    //s.charAt(i); символ в указанной позиции;
        }
//        System.out.println(" ");                      //:" "
//        System.out.print(letter);                     //:First, solve the problem. Then, write the code.
//        System.out.println(" ");                      //:" "

        String result = new String(letter);
//        System.out.print(result+" ");                 //:First, solve the problem. Then, write the code.

        int num2 = 0;
        while (num2 < result.lastIndexOf("e",num2)){                                                                //()условия                   {}телоцыкла код который не обходимо выполнить до тех пор пока условия истено
        //    num2 = result.indexOf("e",);
            System.out.print(num2 +" ");                            //:22 30 44 56 72 80 90
        }

//        int num2 = 0;
//        while (num2 < result.lastIndexOf("e")){                                                                       //()условия                   {}телоцыкла код который не обходимо выполнить до тех пор пока условия истено
//            num2 = result.indexOf("e",num2+1);
//            System.out.print(num2 +" ");                          //:22 30 44 56 72 80 90
//        }

//        int num2 = 0;
//        while (num2 < result.length()){                                                                               //()условия                   {}телоцыкла код который не обходимо выполнить до тех пор пока условия истено
//            num2 = result.indexOf("e",num2+1);
//            System.out.print(num2 +" ");                          //:22 30 44 56 72 80 90 -1 22 30 44 56 72 80 90 -1 22 30 44 56 72 80 90 -1
//        }
        
//        int num2 = 0;
//        int num3 = result.length();
//        while (num2 < num3){                                                                                          //()условия                   {}телоцыкла код который не обходимо выполнить до тех пор пока условия истено
//            num2 = result.indexOf("e",num2+1);
//            System.out.print(num2 +" ");                          //:22 30 44 56 72 80 90 -1 22 30 44 56 72 80 90 -1 22 30 44 56 72 80 90 -1
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
    }
}