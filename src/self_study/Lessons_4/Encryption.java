package self_study.Lessons_4;

public class Encryption {//шифрование

    private char[][] matrixtable;

    public Encryption(char[][] matrixtable) {
        this.matrixtable=matrixtable;
    }

    private IndexRowCol findCouplesSymbolInMatrix(Character character){
        for(int Row = 0;Row < matrixtable.length;Row++){
            for(int Col = 0;Col < matrixtable[0].length;Col++){
                if(matrixtable[Row][Col] == character){
                    return new IndexRowCol(Row,Col);
                }
            }
        }
        return null;
    }

    public void divideTheLineIntoPairs(String messageEncrypt) {//OLEEUUUUXXP
        String newString = new String();
        for(int i = 0;i < messageEncrypt.length() ;i+=1){
            Character character = messageEncrypt.charAt(i);
            Character characterUnderscore = underscore(character);
            Character charactertoUpperCase = Character.toUpperCase(characterUnderscore);
            newString += Character.toString(charactertoUpperCase);
        }
//        System.out.println(newString);
        ifTwoCaracterLineAddX(newString);

    }

//    public void divideTheLineIntoPairs2(String messageEncrypt) {//вариант 2
//        int i = 0;
//        int j = 1;
//        while (i < messageEncrypt.length()) {
//            Character first = messageEncrypt.charAt(i);//O E U U X P
//            i += 2;
//            Character firstCharacterUnderscore = underscore(first);
//            Character firstCharacter = Character.toUpperCase(firstCharacterUnderscore);
//            newString += firstCharacter;
//
//            Character second = messageEncrypt.charAt(j);//L E U U X
//            j += 2;
//            Character secondCharacterUnderscore = underscore(second);
//            Character secondCharacter = Character.toUpperCase(secondCharacterUnderscore);
//            newString += secondCharacter;
//        }
//        System.out.println(newString);
//        divideTheLineIntoPairsXX();
//            if(firstCharacter != secondCharacter){//OL
//                System.out.print(firstCharacter);
//                System.out.print(secondCharacter);
//            }
//            if(firstCharacter == secondCharacter){//EE UU UU XX
//                System.out.print(firstCharacter);
//                System.out.print(secondCharacter);
////                j=-1;//!
//            }
//        return newString;
//    }

//    public void divideTheLineIntoPairs1(String messageEncrypt) {
//        String newString = new String();
//        for(int i = 0;i < messageEncrypt.length() ;i+=2){
//            Character first = messageEncrypt.charAt(i);
//            Character second = messageEncrypt.charAt(i+1);
//
//            System.out.print(first+""+second+" ");
//
//            Character firstCharacterUnderscore = underscore(first);
//            Character secondCharacterUnderscore = underscore(second);
//
//            Character firstCharacter = Character.toUpperCase(firstCharacterUnderscore);
//            Character secondCharacter = Character.toUpperCase(secondCharacterUnderscore);
//
//            newString += firstCharacter;
//            newString += secondCharacter;
//
//            System.out.println(newString);
//
////            String pairsOfCharacters = firstCharacter +""+ secondCharacter;
//
////            ifTwoCaracterLineAddX(pairsOfCharacters);
//        }
//    }

    private Character underscore(Character character){
        char underscore = '_';
        char space = ' ';
        if(character == space){
            return underscore;
        }
        return character;
    }

    public String ifTwoCaracterLineAddX(String messageEncrypt) {//вариант 1
        String newString = new String();
        char x = 'X';
        for(int i = 0; i < messageEncrypt.length();i+=2){
            if(messageEncrypt.charAt(i) == messageEncrypt.charAt(i+1)){
//                System.out.println(messageEncrypt.charAt(i)+"=="+messageEncrypt.charAt(i+1));
                newString += messageEncrypt.charAt(i);
                newString += x;
                i += 1;//!
            }
            if(messageEncrypt.charAt(i) != messageEncrypt.charAt(i+1)){
//                System.out.println(messageEncrypt.charAt(i)+"!="+messageEncrypt.charAt(i+1));
                newString += messageEncrypt.charAt(i);
                newString += messageEncrypt.charAt(i+1);
            }
        }
//        System.out.println(newString);
        return findTheSameCharacters(newString);
    }
    //OL EE UU UU XX
    //OL Ex EU Ux Ux UX X
    //OL EX UX UX XX
    //OL EX LE EU UX UX UX XP
    //OL EX LE EU UX UX UX XP

    public String findTheSameCharacters(String stringMessageEncrypt){
        for(int i = 0;i < stringMessageEncrypt.length() -1;i+=2){
            Character first = stringMessageEncrypt.charAt(i);
            Character second = stringMessageEncrypt.charAt(i+1);

            IndexRowCol firstindex = findCouplesSymbolInMatrix(first);
            IndexRowCol secondindex = findCouplesSymbolInMatrix(second);

            assert firstindex != null;
            assert secondindex != null;
            permutationOfMatrixCharacters(firstindex,secondindex);
        }
        return null;
    }

    private void permutationOfMatrixCharacters(IndexRowCol firstindex, IndexRowCol secondindex){
        if(firstindex.Row != secondindex.Row){//прямоугольник
            if(firstindex.Col != secondindex.Col) {
                decodedCharactersConvertString(matrixtable[firstindex.Row][secondindex.Col]);
                decodedCharactersConvertString(matrixtable[secondindex.Row][firstindex.Col]);
            }
        }
        if(firstindex.Row == secondindex.Row){//горезонт
            if(firstindex.Col != matrixtable.length){
                if(secondindex.Col != matrixtable.length){
                    decodedCharactersConvertString(matrixtable[firstindex.Row][firstindex.Col+1]);
                    decodedCharactersConvertString(matrixtable[secondindex.Row][secondindex.Col+1]);
                }
            }
            if(firstindex.Col == 5) {
                decodedCharactersConvertString(matrixtable[firstindex.Row][firstindex.Col-5]);
                decodedCharactersConvertString(matrixtable[secondindex.Row][secondindex.Col+1]);
            }
            if(secondindex.Col == 5){
                decodedCharactersConvertString(matrixtable[firstindex.Row][firstindex.Col+1]);
                decodedCharactersConvertString(matrixtable[secondindex.Row][secondindex.Col-5]);
            }
        }
        if(firstindex.Col == secondindex.Col){//вертикаль
            if(firstindex.Row != 4){
                if(secondindex.Row != 4){
                    decodedCharactersConvertString(matrixtable[firstindex.Row+1][firstindex.Col]);
                    decodedCharactersConvertString(matrixtable[secondindex.Row+1][secondindex.Col]);
                }
            }
            if(firstindex.Row == 4) {
                decodedCharactersConvertString(matrixtable[firstindex.Row-4][firstindex.Col]);
                decodedCharactersConvertString(matrixtable[secondindex.Row+1][secondindex.Col]);

            }
            if(secondindex.Row == 4){
                decodedCharactersConvertString(matrixtable[firstindex.Row+1][firstindex.Col]);
                decodedCharactersConvertString(matrixtable[secondindex.Row-4][secondindex.Col]);
            }
        }
    }

    private void decodedCharactersConvertString(Character character){
        String string = Character.toString(character);
//        System.out.print(string);
    }
}