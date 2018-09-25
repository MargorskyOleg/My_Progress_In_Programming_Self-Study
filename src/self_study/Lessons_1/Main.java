package self_study.Lessons_1;


public class Main {
    // First, solve the problem. Then, write the code.
    // считает позиции всех букв "e"
    //FzirrBsDtP,m UsJoOlQvXef xtUhiep LpYr`oUbVlhe_mg.O WTshMeKnK,J nwhr^iotVeM ztRhQek McVo`dRer.W
    public static void main(String[] args) {


        String s = "FzirrBsDtP,m UsJoOlQvXef xtUhiep LpYr`oUbVlhe_mg.O WTshMeKnK,J nwhr^iotVeM ztRhQek McVo`dRer.W";
        int lenn = s.length();                  //94   "Fzirr
        char[] tempCharArrey1 = new char[lenn]; //[a][.][.]... = 123...

        for (int i = 0; i < lenn; i = i + 2) {              //94->
            tempCharArrey1[i] = s.charAt(i);    //-символ в указанной позиции;
            System.out.print(tempCharArrey1[i]);//First, solve the problem. Then, write the code.
        }
        System.out.println();                   //следуешия строка



        int index1 = s.indexOf("e");            //
        while (index1 < s.length()){            //
            if(index1 == s.indexOf("e")){

                System.out.print(s.indexOf("e")+" ");
            }
            index1++;                           //
        }
        System.out.println();                   //souf следуешия строка







        int a = 0;
        while(a < 10) {
            System.out.print(a+" ");
            a++;
        }

    }
}
