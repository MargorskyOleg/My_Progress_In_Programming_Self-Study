package self_study.Lessons_3;

public class PlayFeirDecryption {

    private char[][] matrix;

    public PlayFeirDecryption(char[][] matrix) {
        this.matrix = matrix;
    }

    private IndexRowCol indexFindingCharacterMatrix(Character character){
        for(int Row = 0;Row < matrix.length;Row++){
            for(int Col = 0;Col < matrix[0].length;Col++){
                if(matrix[Row][Col] == character){
                    return new IndexRowCol(Row,Col);
                }
            }
        }
        return new IndexRowCol (-1,-1);
    }

    public void splitTheStringIntoPairsOfSmvolov(String encryptedString){
        for(int i = 0;i < encryptedString.length() ;i += 2){
            Character firstChar = encryptedString.charAt(i);   //J X P . P J N Y X F . O Y L R W R G O R N O N S U L G . V L E S L F L . L _ Y G . D . S N X S P N S M A X
            Character secondChar = encryptedString.charAt(i+1);//_ F V S X H P P I T _ N X N S L O A M Y _ S L . X O X _ S B L R V P S G O S P E K X D V K T K V L L X S E
            IndexRowCol firstCharacter = indexFindingCharacterMatrix(firstChar);
            IndexRowCol secondCharacter  = indexFindingCharacterMatrix(secondChar);
            permutationOfCoordinatesInTheMatrix(firstCharacter,secondCharacter);
        }
    }

    private void permutationOfCoordinatesInTheMatrix(IndexRowCol firstChar,IndexRowCol secondChar) {
        //J_ XF PV .S PX JH NP YP XI FT ._ ON YX LN RS WL RO GA OM RY N_ OS NL S. UX LO GX ._ VS LB EL SR LV FP LS .G LO _S YP GE .K DX .D SV NK XT SK PV NL SL MX AS XE
        //40 21 00 22 00 40 11 25 21 33 22 02 25 14 01 42 01 03 02 01 11 02 11 13 30 14 03 22 32 14 20 13 14 33 14 22 14 12 25 03 22 24 22 13 11 21 13 00 11 13 05 04 21
        //12 33 32 13 21 31 00 00 10 23 12 11 21 11 13 14 02 04 05 25 12 13 14 22 21 02 21 12 13 34 14 01 32 00 13 03 02 13 00 20 15 21 24 32 15 23 15 32 14 14 21 13 20

        if(firstChar.Row != secondChar.Row){
            if(firstChar.Col != secondChar.Col){// rectangle
//                System.out.print(matrix[firstChar.Row][secondChar.Col]+""+matrix[secondChar.Row][firstChar.Col]+"");
                foldingCharactersIntoAString(matrix[firstChar.Row][secondChar.Col]);
                foldingCharactersIntoAString(matrix[secondChar.Row][firstChar.Col]);
            }
        }
        if(firstChar.Row == secondChar.Row){// horizon
            if(0 != firstChar.Col) {
                if(0 != secondChar.Col){
//                System.out.print(matrix[firstChar.Row][firstChar.Col-1]+""+matrix[secondChar.Row][secondChar.Col-1]+"");
                    foldingCharactersIntoAString(matrix[firstChar.Row][firstChar.Col-1]);
                    foldingCharactersIntoAString(matrix[secondChar.Row][secondChar.Col-1]);
                }
            }
            if(0 == firstChar.Col){
//                System.out.print(matrix[firstChar.Row][firstChar.Col+matrix.length]+""+matrix[secondChar.Row][secondChar.Col-1]+"");
                foldingCharactersIntoAString(matrix[firstChar.Row][firstChar.Col+matrix.length]);
                foldingCharactersIntoAString(matrix[secondChar.Row][secondChar.Col-1]);
            }
            if(0 == secondChar.Col){
//                System.out.print(matrix[firstChar.Row][firstChar.Col-1]+""+matrix[secondChar.Row][secondChar.Col+matrix.length]+"");
                foldingCharactersIntoAString(matrix[firstChar.Row][firstChar.Col-1]);
                foldingCharactersIntoAString(matrix[secondChar.Row][secondChar.Col+matrix.length]);
            }
        }
        if(firstChar.Col == secondChar.Col){// vertical
            if(0 != firstChar.Row) {
                if(0 != secondChar.Row){
//                    System.out.print(matrix[firstChar.Row-1][firstChar.Col]+""+matrix[secondChar.Row-1][secondChar.Col]+"");
                    foldingCharactersIntoAString(matrix[firstChar.Row-1][firstChar.Col]);
                    foldingCharactersIntoAString(matrix[secondChar.Row-1][secondChar.Col]);
                }
            }
            if(0 == firstChar.Col){
//                System.out.print(matrix[firstChar.Row+matrix[0].length][firstChar.Col]+""+matrix[secondChar.Row][secondChar.Col-1]+"");
                foldingCharactersIntoAString(matrix[firstChar.Row+matrix[0].length][firstChar.Col]);
                foldingCharactersIntoAString(matrix[secondChar.Row][secondChar.Col-1]);
            }
            if(0 == secondChar.Col){
//                System.out.print(matrix[firstChar.Row][firstChar.Col-1]+""+matrix[secondChar.Row+matrix[0].length][secondChar.Col]+"");
                foldingCharactersIntoAString(matrix[firstChar.Row][firstChar.Col-1]);
                foldingCharactersIntoAString(matrix[secondChar.Row+matrix[0].length][secondChar.Col]);
            }
        }
    }

    private void foldingCharactersIntoAString(Character characterDecoding) {
        String message = Character.toString(characterDecoding);
        System.out.print(message);
    }

















//моя история прогресса




//   0 1 2 3 4 5  y P R O G A M  y 00 01 02 03 04 05
//   1 2 3 4 5 6    I N _ S L K    10 11 12 13 14 15
//   2 3 4 5 6 7    E X . T D Y    20 21 22 23 24 25
//   3 4 5 6 7 8    U H V F B C    30 31 32 33 34 35
//   4 5 6 7 8 9    J Q W Z , ?    40 41 42 43 44 45

//J_XFPV.SPXJHNPYPXIFT._ONYXLNRSWLROGAOMRYN_OSNLS.UXLOGX._VSLBELSRLVFPLS.GLO_SYPGE.KDX.DSVNKXTSKPVNLSLMXASXE
//                        YXLN    ROGAOM  N_  NL                      LS    _S      DX.D  NKXTSK  NLSL    XE  #
//                        E.K_    OGAMGP  _S  _K                      KL    SL      Y.TY  _I.DLI  _KLK    .X  +
//                  FT._                                ._  LB                                                #
//                  ZFV.                                V.  D,                                                +
//                  ZFV.  E.K_    OGAMGP  _S  _K        V.  D,        KL    SL      Y.TY  _I.DLI  _KLK    .X  ++
//J_XFPV.SPXJHNPYPXI    ON    RSWL      RY  OS  S.UXLOGX  VS  ELSRLVFP  .GLO  YPGE.K    SV      PV    MXAS    #
//WITHOUT_REQUIREMEN    R_    GN,_      MX  G_  _THE_ART  F_  DING_BUG  TO_A  EMPTY_    _F      OU    RYGL    #+<
//WITHOUT_REQUIREMENZFV.R_E.K_GN,_OGAMGPMX_SG__K_THE_ARTV.F_D,DING_BUGKLTO_ASLEMPTY_Y.TY_F_I.DLIOU_KLKRYGL.X

//WITHOUT_REQUIREMENTS_OR_E.K_GN,_OGAMGPMX_SG__K_THE_ART_OF_ADDING_BUGKLTO_ASLEMPTY_Y.TY_F_I.DLIOU_KLKRYGL.X
//WITHOUT_REQUIREMENTS_OR_                      _THE_ART_OF_ADDING_
//WITHOUT_REQUIREMENTS_OR_E.K_GN,_OGAMGPMX_SG__K_THE_ART_OF_ADDING_BUGKLTO_ASLEMPTY_Y.TY_F_I.DLIOU_KLKRYGL.X
//WITHOUT_REQUIREMENTS_OR_EESIGN,_PROGRPMXING_IS_THE_ART_OF_ADDING_BUGS_TO_AN_EMPTY_TEXT_FIIE._IOUIS_SRYGL
//WITHOUT_REQUIREMENTS_OR_DESIGN,_PROGRAMXING_IS_THE_ART_OF_ADDING_BUGS_TO_AN_EMPTY_TEXT_FILE._LOUIS_SRYGLEY

//WITHOUT_REQUIREMEN    R_    GN,_      MX  G_  _THE_ART  F_  DING_BUG  TO_A  EMPTY_    _F      OU    RYGL    +
//                          SI    PROG    IN  IS                      S_    N_      TEXT    E.    IS_S        +!
//                        EE                                                                                  +
//                                    RP                                                  II  _I              +!
//                  TS_O                                _O  AD                                                +
//WITHOUT_REQUIREMENTS_OR_DESIGN,_PROGRAMXING_IS_THE_ART_OF_ADDING_BUGS_TO_AN_EMPTY_TEXT_FILE._LOUIS_SRYGLEY

//БЕЗ ТРЕБОВАНИЙ ИЛИ ПРОЕКТИРОВАНИЯ, ПРОГРАММИРОВАНИЕ - ИСКУССТВО ДОБАВЛЕНИЯ БАГОВ В ПУСТОЙ ТЕКСТОВЫЙ ФАЙЛ. ЛУИ СРИГЛИ























//    public void indexFindingOriginalString(String encryptedMessage){
//        for(int i = 0;i < encryptedMessage.length() ;i += 2){//-1
//
//            Character firstChar = encryptedMessage.charAt(i);   //J X P . P J N Y X F . O Y L R W R G O R N O N S U L G . V L E S L F L . L _ Y G . D . S N X S P N S M A X
//            Character secondChar = encryptedMessage.charAt(i+1);//_ F V S X H P P I T _ N X N S L O A M Y _ S L . X O X _ S B L R V P S G O S P E K X D V K T K V L L X S E
//
//            String stringFirstChar = Character.toString(firstChar);
//            String stringSecondChar = Character.toString(secondChar);
//
//            IndexRowCol firstCharacter = indexFindingCharacterMatrix(firstChar);
//            IndexRowCol secondCharacter  = indexFindingCharacterMatrix(secondChar);
//
//            System.out.println("char1: "+stringFirstChar+" ["+firstCharacter.Row+","+firstCharacter.Col+"]\t"+
//                               "char2: "+stringSecondChar+" ["+secondCharacter.Row+","+secondCharacter.Col+"]");
//
//
//        }
////        return null;
//    }






}
