package self_study.Lessons_2;

public class Main {

    public static void main(String[] args) {

        String s = "// JSuGnsquxMtdeMFhvT OLppJMm^QfwmcS]d_CKzH_eMofXd\\j]yFoucKdv_[n]pqIuIejAGJvhopdzBJmdRnngdqrkSzc" +
                "_kMeioDu^mt\\dTDYFmbeuVhJLCC]DRuXA^eL\\JHpwGgzkpK[ecYlxkViJCCZglarLr\\[GiswwfmhniiZVsbte`xgfo\\IZk\\" +
                "DVP[HOUDmk\\pRyhv[TcDoKgMguppRNj^LKiR^OaLBo pJIjghxtAoqhgtiDoNZ_m`AyeHQVXMnXBAU^DwOHrXMvg^^pd[[Tl]BP" +
                "JJF_Xc]oBZfg_LzrzShUTFSGd\\mxl[f`yEUtrjjPvXtMrrQX[cTZpgwDryvwq_CbnGhZqFAQcYZvLFPmKU]JGMkiSHQCsnnYWUS" +
                "ZlJqbVbDrWNBsljJl\\Ct[bWVRaDH]ozCasg^dUnHbDUTFGYQJeBwU[rrUn_ASZaCXK[zFL`XivSXMCQLImyrmCiGBoIppmpH]Sw" +
                "ugYLxEeOYI[fR]Ts`\\iPU\\UyQCkcvGKvuGV_jbBnInPxaJrS]tPgnCbYSZvuUCSSx`lLHoJy[vGaMWXGLXFCq_Hr`wMPgGYG\\" +
                "wzBYfLhkRMsvAMvCojxwQ]YYttfKbtST]AFPXVi`MYR`SOv_kRNrW\\KL[ad`AAFrysVvvx_gGJl_ywGJxH[Qg[wBquoqlJ`LS[a" +
                "[sAdmmalMkfM^[[bsaoK_vUEBIhvwe`L_WgQx_h^GijQKiQWRbge^PC__vceFfocK[hHoJdUsREpLDuSrRdUxvhOUHmBwDY[tHGj" +
                "AIbHyRlMLMT\\BPmnBZePmYngXcYpsdvEwKRik\\WfJ\\DHoQAgQfZ[]qxcVukVtvUbQP_qxED`CyGRVgsGbl`NK\\bGMjTplBmN" +
                "H]r`mJjLctX^kgNjCdnHWHWohYeNkOnBMsJspTUYCUeREDVa]emINerAFCrU`\\[UFVRr]UtiPVFC]FkeCDlG\\fobBJnm]ztatQ" +
                "Ljl^DIkDs!r";

        characterFib(s);
    }

    public static void characterFib(String a) {
        int num = a.length();

        int i = 1;
        int j = 1;
        int n;

        while (i < num) {
            n = i + j;

            System.out.print(a.charAt(i) + "" + a.charAt(j) + "");

            i = n;
            n = j + i;
            j = n;
        }
    }// Just code it!
}














//В данной строке на позициях чисел Фибоначчи спрятаны символы оригинальной фразы! Ты должен их найти! И прочитать оригинальную фразу.
//  // JSuGnsquxMtdeMFhvT OLppJMm^QfwmcS]d_CKzH_eMofXd\j]yFoucKdv_[n]pqIuIejAGJvhopdzBJmdRnngdqrkSzc_kMeioDu^mt\dTDYFmbeuVhJLCC]DRuXA^eL\JHpwGgzkpK[ecYlxkViJCCZglarLr\[GiswwfmhniiZVsbte`xgfo\IZk\DVP[HOUDmk\pRyhv[TcDoKgMguppRNj^LKiR^OaLBo pJIjghxtAoqhgtiDoNZ_m`AyeHQVXMnXBAU^DwOHrXMvg^^pd[[Tl]BPJJF_Xc]oBZfg_LzrzShUTFSGd\mxl[f`yEUtrjjPvXtMrrQX[cTZpgwDryvwq_CbnGhZqFAQcYZvLFPmKU]JGMkiSHQCsnnYWUSZlJqbVbDrWNBsljJl\Ct[bWVRaDH]ozCasg^dUnHbDUTFGYQJeBwU[rrUn_ASZaCXK[zFL`XivSXMCQLImyrmCiGBoIppmpH]SwugYLxEeOYI[fR]Ts`\iPU\UyQCkcvGKvuGV_jbBnInPxaJrS]tPgnCbYSZvuUCSSx`lLHoJy[vGaMWXGLXFCq_Hr`wMPgGYG\wzBYfLhkRMsvAMvCojxwQ]YYttfKbtST]AFPXVi`MYR`SOv_kRNrW\KL[ad`AAFrysVvvx_gGJl_ywGJxH[Qg[wBquoqlJ`LS[a[sAdmmalMkfM^[[bsaoK_vUEBIhvwe`L_WgQx_h^GijQKiQWRbge^PC__vceFfocK[hHoJdUsREpLDuSrRdUxvhOUHmBwDY[tHGjAIbHyRlMLMT\BPmnBZePmYngXcYpsdvEwKRik\WfJ\DHoQAgQfZ[]qxcVukVtvUbQP_qxED`CyGRVgsGbl`NK\bGMjTplBmNH]r`mJjLctX^kgNjCdnHWHWohYeNkOnBMsJspTUYCUeREDVa]emINerAFCrU`\[UFVRr]UtiPVFC]FkeCDlG\fobBJnm]ztatQLjl^DIkDs!r

//   / /   J S u G n s q u x M t  d  e  M  F  h  v  T     O  L  p  p  J  M  m  ^  Q  f  w  m  c  S  ]  d  _  C  K  z  H  _  e  M  o  f  X  d  \  j  ]  y  F  o  u  c  K  d  v  _  [  n  ]  p  q  I  u  I  e  j  A  G  J  v  h  o  p  d  z  B  J  m  d  R  n  n  g  d  q  r  k  S  z  c  _  k  M  e  i  o  D  u   ^   m   t   \   d   T   D   Y   F   m   b   e   u   V   h   J   L   C   C   ]   D   R   u   X   A   ^   e   L   \   J   H   p   w   G   g   z   k   p   K   [   e   c   Y   l   x   k   V   i   J   C   C   Z   g   l   a   r   L   r   \   [   G   i   s   w   w   f   m   h   n   i   i   Z   V   s   b   t   e   `   x   g   f   o   \   I   Z   k   \   D   V   P   [   H   O   U   D   m   k   \   p   R   y   h   v   [   T   c   D   o   K   g   M   g   u   p   p   R   N   j   ^   L   K   i   R   ^   O   a   L   B   o       p   J   I   j   g   h   x   t   A   o   q   h   g   t   i   D   o   N   Z   _   m   `   A   y   e   H   Q   V   X   M   n   X   B   A   U   ^   D   w   O   H   r   X   M   v   g   ^   ^   p   d   [   [   T   l   ]   B   P   J   J   F   _   X   c   ]   o   B   Z   f   g   _   L   z   r   z   S   h   U   T   F   S   G   d   \   m   x   l   [   f   `   y   E   U   t   r   j   j   P   v   X   t   M   r   r   Q   X   [   c   T   Z   p   g   w   D   r   y   v   w   q   _   C   b   n   G   h   Z   q   F   A   Q   c   Y   Z   v   L   F   P   m   K   U   ]   J   G   M   k   i   S   H   Q   C   s   n   n   Y   W   U   S   Z   l   J   q   b   V   b   D   r   W   N   B   s   l   j   J   l   \   C   t   [   b   W   V   R   a   D   H   ]   o   z   C   a   s   g   ^   d   U   n   H   b   D   U   T   F   G   Y   Q   J   e   B   w   U   [   r   r   U   n   _   A   S   Z   a   C   X   K   [   z   F   L   `   X   i   v   S   X   M   C   Q   L   I   m   y   r   m   C   i   G   B   o   I   p   p   m   p   H   ]   S   w   u   g   Y   L   x   E   e   O   Y   I   [   f   R   ]   T   s   `   \   i   P   U   \   U   y   Q   C   k   c   v   G   K   v   u   G   V   _   j   b   B   n   I   n   P   x   a   J   r   S   ]   t   P   g   n   C   b   Y   S   Z   v   u   U   C   S   S   x   `   l   L   H   o   J   y   [   v   G   a   M   W   X   G   L   X   F   C   q   _   H   r   `   w   M   P   g   G   Y   G   \   w   z   B   Y   f   L   h   k   R   M   s   v   A   M   v   C   o   j   x   w   Q   ]   Y   Y   t   t   f   K   b   t   S   T   ]   A   F   P   X   V   i   `   M   Y   R   `   S   O   v   _   k   R   N   r   W   \   K   L   [   a   d   `   A   A   F   r   y   s   V   v   v   x   _   g   G   J   l   _   y   w   G   J   x   H   [   Q   g   [   w   B   q   u   o   q   l   J   `   L   S   [   a   [   s   A   d   m   m   a   l   M   k   f   M   ^   [   [   b   s   a   o   K   _   v   U   E   B   I   h   v   w   e   `   L   _   W   g   Q   x   _   h   ^   G   i   j   Q   K   i   Q   W   R   b   g   e   ^   P   C   _   _   v   c   e   F   f   o   c   K   [   h   H   o   J   d   U   s   R   E   p   L   D   u   S   r   R   d   U   x   v   h   O   U   H   m   B   w   D   Y   [   t   H   G   j   A   I   b   H   y   R   l   M   L   M   T   \   B   P   m   n   B   Z   e   P   m   Y   n   g   X   c   Y   p   s   d   v   E   w   K   R   i   k   \   W   f   J   \   D   H   o   Q   A   g   Q   f   Z   [   ]   q   x   c   V   u   k   V   t   v   U   b   Q   P   _   q   x   E   D   `   C   y   G   R   V   g   s   G   b   l   `   N   K   \   b   G   M   j   T   p   l   B   m   N   H   ]   r   `   m   J   j   L   c   t   X   ^   k   g   N   j   C   d   n   H   W   H   W   o   h   Y   e   N   k   O   n   B   M   s   J   s   p   T   U   Y   C   U   e   R   E   D   V   a   ]   e   m   I   N   e   r   A   F   C   r   U   `   \   [   U   F   V   R   r   ]   U   t   i   P   V   F   C   ]   F   k   e   C   D   l   G   \   f   o   b   B   J   n   m   ]   z   t   a   t   Q   L   j   l   ^   D   I   k   D   s   !   r
//   0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199 200 201 202 203 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 219 220 221 222 223 224 225 226 227 228 229 230 231 232 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 255 256 257 258 259 260 261 262 263 264 265 266 267 268 269 270 271 272 273 274 275 276 277 278 279 280 281 282 283 284 285 286 287 288 289 290 291 292 293 294 295 296 297 298 299 300 301 302 303 304 305 306 307 308 309 310 311 312 313 314 315 316 317 318 319 320 321 322 323 324 325 326 327 328 329 330 331 332 333 334 335 336 337 338 339 340 341 342 343 344 345 346 347 348 349 350 351 352 353 354 355 356 357 358 359 360 361 362 363 364 365 366 367 368 369 370 371 372 373 374 375 376 377 378 379 380 381 382 383 384 385 386 387 388 389 390 391 392 393 394 395 396 397 398 399 400 401 402 403 404 405 406 407 408 409 410 411 412 413 414 415 416 417 418 419 420 421 422 423 424 425 426 427 428 429 430 431 432 433 434 435 436 437 438 439 440 441 442 443 444 445 446 447 448 449 450 451 452 453 454 455 456 457 458 459 460 461 462 463 464 465 466 467 468 469 470 471 472 473 474 475 476 477 478 479 480 481 482 483 484 485 486 487 488 489 490 491 492 493 494 495 496 497 498 499 500 501 502 503 504 505 506 507 508 509 510 511 512 513 514 515 516 517 518 519 520 521 522 523 524 525 526 527 528 529 530 531 532 533 534 535 536 537 538 539 540 541 542 543 544 545 546 547 548 549 550 551 552 553 554 555 556 557 558 559 560 561 562 563 564 565 566 567 568 569 570 571 572 573 574 575 576 577 578 579 580 581 582 583 584 585 586 587 588 589 590 591 592 593 594 595 596 597 598 599 600 601 602 603 604 605 606 607 608 609 610 611 612 613 614 615 616 617 618 619 620 621 622 623 624 625 626 627 628 629 630 631 632 633 634 635 636 637 638 639 640 641 642 643 644 645 646 647 648 649 650 651 652 653 654 655 656 657 658 659 660 661 662 663 664 665 666 667 668 669 670 671 672 673 674 675 676 677 678 679 680 681 682 683 684 685 686 687 688 689 690 691 692 693 694 695 696 697 698 699 700 701 702 703 704 705 706 707 708 709 710 711 712 713 714 715 716 717 718 719 720 721 722 723 724 725 726 727 728 729 730 731 732 733 734 735 736 737 738 739 740 741 742 743 744 745 746 747 748 749 750 751 752 753 754 755 756 757 758 759 760 761 762 763 764 765 766 767 768 769 770 771 772 773 774 775 776 777 778 779 780 781 782 783 784 785 786 787 788 789 790 791 792 793 794 795 796 797 798 799 800 801 802 803 804 805 806 807 808 809 810 811 812 813 814 815 816 817 818 819 820 821 822 823 824 825 826 827 828 829 830 831 832 833 834 835 836 837 838 839 840 841 842 843 844 845 846 847 848 849 850 851 852 853 854 855 856 857 858 859 860 861 862 863 864 865 866 867 868 869 870 871 872 873 874 875 876 877 878 879 880 881 882 883 884 885 886 887 888 889 890 891 892 893 894 895 896 897 898 899 900 901 902 903 904 905 906 907 908 909 910 911 912 913 914 915 916 917 918 919 920 921 922 923 924 925 926 927 928 929 930 931 932 933 934 935 936 937 938 939 940 941 942 943 944 945 946 947 948 949 950 951 952 953 954 955 956 957 958 959 960 961 962 963 964 965 966 967 968 969 970 971 972 973 974 975 976 977 978 979 980 981 982 983 984 985
// 1 1 2 3   5     8            13                      21                                     34                                                             55                                                                                                    89                                                                                                                                                                                                               144                                                                                                                                                                                                                                                                                                                                                                 233                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             377                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 610                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             987

// 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
// / / J u s t    c  o  d  e      i   t   !
// Just code it!




//    public static void characterFib(String a){
//        int num = a.length();
//
//        int i = 0;
//        int j = 1;
//        int n;
//
//        while (i < num){
//            n = i + j;
//            System.out.print(a.charAt(i)+""+a.charAt(j)+"");
//            i=n;
//            n=j+i;
//            j=n;
//        }
//    }


//        int num = s.length();
//        char[] letter = new char[num];
//
//        for (int i = 0; i < num; i++) {
//            letter[i] = s.charAt(i);
//            System.out.print(s.charAt(i) +" ");
//        }
//
//
//        System.out.println();


//        for (int i = 0; i < num; i++) {
//            for (int j = 1; j < num; j++) {
//                int n;
//                n=i;
//                letter[n] = s.charAt(n);
//                System.out.print(n + " ");
//                n=j;
//                letter[n] = s.charAt(n);
//                System.out.print(n + " ");
//
//                n = i + j;//1+1=2
//
//                i=n;//2
//                n=j+i;
//                j=n;
//
//            }
//
//        }











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
