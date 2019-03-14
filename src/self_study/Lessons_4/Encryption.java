package self_study.Lessons_4;

public class Encryption{

    private char[][] matrixtable;
    private int ROW;
    private int COL;

    public Encryption(char[][] matrixtable,int ROW,int COL) {
        this.matrixtable = matrixtable;
        this.ROW = ROW - 1;
        this.COL = COL - 1;
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

    public void divideTheLineIntoPairs(String messageEncrypt) {
        String newString = new String();
        for(int i = 0;i < messageEncrypt.length() ;i+=1){
            Character character = messageEncrypt.charAt(i);
            Character characterUnderscore = underscore(character);
            Character charactertoUpperCase = Character.toUpperCase(characterUnderscore);
            newString += Character.toString(charactertoUpperCase);
        }
        ifTwoCaracterLineAddX(newString);
    }

    private Character underscore(Character character){
        char underscore = '_';
        char space = ' ';
        if(character == space){
            return underscore;
        }
        return character;
    }

    private String ifTwoCaracterLineAddX(String messageEncrypt) {
        String newString = new String();
        char x = 'X';
        for(int i = 0; i < messageEncrypt.length();i++){
            newString += messageEncrypt.charAt(i);

            if(i < messageEncrypt.length()-1){
                if(messageEncrypt.charAt(i) == messageEncrypt.charAt(i+1)){
                    newString += x;
                }else {
                    newString += messageEncrypt.charAt(i+1);
                    i+=1;
                }
            }
        }
        return stringX(newString);
    }

    private String stringX(String string){
        String newString = new String();
        char x = 'X';
        newString += string;
        if(string.length()%2 != 0){
            newString += x;
        }
        return findTheSameCharacters(newString);
    }

    private String findTheSameCharacters(String stringMessageEncrypt){
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
            if(firstindex.Col == COL) {
                decodedCharactersConvertString(matrixtable[firstindex.Row][firstindex.Col-COL]);
                decodedCharactersConvertString(matrixtable[secondindex.Row][secondindex.Col+1]);
            }
            if(secondindex.Col == COL){
                decodedCharactersConvertString(matrixtable[firstindex.Row][firstindex.Col+1]);
                decodedCharactersConvertString(matrixtable[secondindex.Row][secondindex.Col-COL]);
            }
        }
        if(firstindex.Col == secondindex.Col){//вертикаль
            if(firstindex.Row != ROW){
                if(secondindex.Row != ROW){
                    decodedCharactersConvertString(matrixtable[firstindex.Row+1][firstindex.Col]);
                    decodedCharactersConvertString(matrixtable[secondindex.Row+1][secondindex.Col]);
                }
            }
            if(firstindex.Row == ROW) {
                decodedCharactersConvertString(matrixtable[firstindex.Row-ROW][firstindex.Col]);
                decodedCharactersConvertString(matrixtable[secondindex.Row+1][secondindex.Col]);

            }
            if(secondindex.Row == ROW){
                decodedCharactersConvertString(matrixtable[firstindex.Row+1][firstindex.Col]);
                decodedCharactersConvertString(matrixtable[secondindex.Row-ROW][secondindex.Col]);
            }
        }
    }

    private void decodedCharactersConvertString(Character character){
        String string = Character.toString(character);
        System.out.print(string);
    }
}