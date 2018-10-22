package self_study.Lessons_2;

import java.io.FileReader;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    //В данной строке на позициях чисел Фибоначчи спрятаны символы оригинальной фразы! Ты должен их найти! И прочитать оригинальную фразу.
    //JSuGnsquxMtdeMFhvT OLppJMm^QfwmcS]d_CKzH_eMofXd\j]yFoucKdv_[n]pqIuIejAGJvhopdzBJmdRnngdqrkSzc_kMeioDu^mt\dTDYFmbeuVhJLCC]DRuXA^eL\JHpwGgzkpK[ecYlxkViJCCZglarLr\[GiswwfmhniiZVsbte`xgfo\IZk\DVP[HOUDmk\pRyhv[TcDoKgMguppRNj^LKiR^OaLBo pJIjghxtAoqhgtiDoNZ_m`AyeHQVXMnXBAU^DwOHrXMvg^^pd[[Tl]BPJJF_Xc]oBZfg_LzrzShUTFSGd\mxl[f`yEUtrjjPvXtMrrQX[cTZpgwDryvwq_CbnGhZqFAQcYZvLFPmKU]JGMkiSHQCsnnYWUSZlJqbVbDrWNBsljJl\Ct[bWVRaDH]ozCasg^dUnHbDUTFGYQJeBwU[rrUn_ASZaCXK[zFL`XivSXMCQLImyrmCiGBoIppmpH]SwugYLxEeOYI[fR]Ts`\iPU\UyQCkcvGKvuGV_jbBnInPxaJrS]tPgnCbYSZvuUCSSx`lLHoJy[vGaMWXGLXFCq_Hr`wMPgGYG\wzBYfLhkRMsvAMvCojxwQ]YYttfKbtST]AFPXVi`MYR`SOv_kRNrW\KL[ad`AAFrysVvvx_gGJl_ywGJxH[Qg[wBquoqlJ`LS[a[sAdmmalMkfM^[[bsaoK_vUEBIhvwe`L_WgQx_h^GijQKiQWRbge^PC__vceFfocK[hHoJdUsREpLDuSrRdUxvhOUHmBwDY[tHGjAIbHyRlMLMT\BPmnBZePmYngXcYpsdvEwKRik\WfJ\DHoQAgQfZ[]qxcVukVtvUbQP_qxED`CyGRVgsGbl`NK\bGMjTplBmNH]r`mJjLctX^kgNjCdnHWHWohYeNkOnBMsJspTUYCUeREDVa]emINerAFCrU`\[UFVRr]UtiPVFC]FkeCDlG\fobBJnm]ztatQLjl^DIkDs!r
    public static void main(String[] args) {

        String s = "JSuGnsquxMtdeMFhvT OLppJMm^QfwmcS]d_CKzH_eMofXd\\j]yFoucKdv_[n]pqIuIejAGJvhopdzBJmdRnngdqrkSzc_kMeioDu^mt\\dTDYFmbeuVhJLCC]DRuXA^eL\\JHpwGgzkpK[ecYlxkViJCCZglarLr\\[GiswwfmhniiZVsbte`xgfo\\IZk\\DVP[HOUDmk\\pRyhv[TcDoKgMguppRNj^LKiR^OaLBo pJIjghxtAoqhgtiDoNZ_m`AyeHQVXMnXBAU^DwOHrXMvg^^pd[[Tl]BPJJF_Xc]oBZfg_LzrzShUTFSGd\\mxl[f`yEUtrjjPvXtMrrQX[cTZpgwDryvwq_CbnGhZqFAQcYZvLFPmKU]JGMkiSHQCsnnYWUSZlJqbVbDrWNBsljJl\\Ct[bWVRaDH]ozCasg^dUnHbDUTFGYQJeBwU[rrUn_ASZaCXK[zFL`XivSXMCQLImyrmCiGBoIppmpH]SwugYLxEeOYI[fR]Ts`\\iPU\\UyQCkcvGKvuGV_jbBnInPxaJrS]tPgnCbYSZvuUCSSx`lLHoJy[vGaMWXGLXFCq_Hr`wMPgGYG\\wzBYfLhkRMsvAMvCojxwQ]YYttfKbtST]AFPXVi`MYR`SOv_kRNrW\\KL[ad`AAFrysVvvx_gGJl_ywGJxH[Qg[wBquoqlJ`LS[a[sAdmmalMkfM^[[bsaoK_vUEBIhvwe`L_WgQx_h^GijQKiQWRbge^PC__vceFfocK[hHoJdUsREpLDuSrRdUxvhOUHmBwDY[tHGjAIbHyRlMLMT\\BPmnBZePmYngXcYpsdvEwKRik\\WfJ\\DHoQAgQfZ[]qxcVukVtvUbQP_qxED`CyGRVgsGbl`NK\\bGMjTplBmNH]r`mJjLctX^kgNjCdnHWHWohYeNkOnBMsJspTUYCUeREDVa]emINerAFCrU`\\[UFVRr]UtiPVFC]FkeCDlG\\fobBJnm]ztatQLjl^DIkDs!r";

        int num = s.length();
//        int i = 0;


        for (int i = 0; i < 1000; i++){
            int temp = i;
            i = temp;
//            System.out.println(temp);
        }

        int i = 0;
        int j = 1000;
        while (i < j){
            i = i;
            i += i;

            System.out.println(i);
        }


        fibonacci(s,num);
    }

    public static void fibonacci(String a, int b){



    }



}

















//9223372036854775808
//354224848179261915075

//        long N = 100;
//        for (long i = 1; i <= N; i++)
//            System.out.println(i + ": " + getFib(i));
//    }
//
//    public static long getFib(long n) {
//        if (n <= 1)
//            return n;
//        else
//            return getFib(n - 1) + getFib(n - 2);
//    }
//}

//0 1 1 2 3 5 8 13 21 34 55

//1: 1
//2: 1
//3: 2
//4: 3
//5: 5
//6: 8
//7: 13
//8: 21
//9: 34
//10: 55
//11: 89
//12: 144
//13: 233
//14: 377
//15: 610
//16: 987
//17: 1597
//18: 2584
//19: 4181
//20: 6765
//21: 10946
//22: 17711
//23: 28657
//24: 46368
//25: 75025
//26: 121393
//27: 196418
//28: 317811
//29: 514229
//30: 832040
//31: 1346269
//32: 2178309
//33: 3524578
//34: 5702887
//35: 9227465
//36: 14930352
//37: 24157817
//38: 39088169
//39: 63245986
//40: 102334155
//41: 165580141
//42: 267914296
//43: 433494437
//44: 701408733
//45: 1134903170
//46: 1836311903
//47: 2971215073
//48: 4807526976
//49: 7778742049
//50: 12586269025


    //    int t = s.length();
    //    System.out.println(t + " ");//:986
    //    char[] let = new char[t];

//        for (int i = 0;i < 60;i++){
//            for (int j = i;j < i;j++);
//        //    i=+i;
//        //    let[i] = s.charAt(i);
//            System.out.print(i+" ");
//        }

        //0 1 1 2 3   5     8            13                      21                                     34                                                             55               2+1
        //0   1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59   1++

//        int i = 0;
//        int j = i;
//        while (i<100){
//            j =+ i;
//            System.out.println(i + " ");
//        }




















        /*
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("file.txt"))) {
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY,0,channel.size());

            for (int i = 0; i < channel.size(); i++){
                System.out.print((char) buffer.get());
            }
        }catch (IOException exception){
            System.out.println("Input / Output error");
        }
*/


/*
        try(FileReader reader = new FileReader("file.txt")) {
            int symbol;

            while ((symbol = reader.read()) != -1){
                System.out.print((char) symbol);
            }
        } catch (IOException e) {
            System.out.println("Input error");
        }*/
    //}
//}
