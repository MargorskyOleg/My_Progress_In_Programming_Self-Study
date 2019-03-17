package self_study.Lessons_4;

public class Transcript {

    private char[][] matrixtable;
    private int ROW;
    private int COL;

    public Transcript(char[][] matrixtable,int ROW,int COL) {
        this.matrixtable=matrixtable;
        this.ROW = ROW - 1;
        this.COL = COL - 1;
    }

    private IndexRowCol findCouplesSymbolInMatrix(Character character){
        for(int Row = 0;Row < matrixtable.length;Row++){
            for(int Col = 0;Col < matrixtable[Row].length;Col++){
                if(matrixtable[Row][Col] == character){
                    return new IndexRowCol(Row,Col);
                }
            }
        }
        return null;
    }

    public void divideTheLineIntoPairs(String messageDecryption) {
        messageDecryption = messageDecryption.toUpperCase();
        for(int i = 0;i < messageDecryption.length() -1;i+=2){
            Character firstCharacter = messageDecryption.charAt(i);
            Character secondCharacter = messageDecryption.charAt(i+1);
            IndexRowCol firstindex = findCouplesSymbolInMatrix(firstCharacter);
            IndexRowCol secondindex = findCouplesSymbolInMatrix(secondCharacter);
            assert firstindex != null;
            assert secondindex != null;
            permutationOfMatrixCharacters(firstindex,secondindex);
        }
    }

    private void permutationOfMatrixCharacters(IndexRowCol firstindex, IndexRowCol secondindex){
        if(firstindex.Row != secondindex.Row){//прямоугольник
            if(firstindex.Col != secondindex.Col){
                decodedCharactersConvertString(matrixtable[firstindex.Row][secondindex.Col]);
                decodedCharactersConvertString(matrixtable[secondindex.Row][firstindex.Col]);
            }
        }
        if(firstindex.Row == secondindex.Row){//горезонт
            if(firstindex.Col != 0){
                if(secondindex.Col != 0){
                    decodedCharactersConvertString(matrixtable[firstindex.Row][firstindex.Col-1]);
                    decodedCharactersConvertString(matrixtable[secondindex.Row][secondindex.Col-1]);
                }
            }
            if(firstindex.Col == 0){
                decodedCharactersConvertString(matrixtable[firstindex.Row][firstindex.Col+COL]);
                decodedCharactersConvertString(matrixtable[secondindex.Row][secondindex.Col-1]);
            }
            if(secondindex.Col == 0){
                decodedCharactersConvertString(matrixtable[firstindex.Row][firstindex.Col-1]);
                decodedCharactersConvertString(matrixtable[secondindex.Row][secondindex.Col+COL]);

            }
        }
        if(firstindex.Col == secondindex.Col){//вертикаль
            if(firstindex.Row != 0){
                if(secondindex.Row != 0){
                    decodedCharactersConvertString(matrixtable[firstindex.Row-1][firstindex.Col]);
                    decodedCharactersConvertString(matrixtable[secondindex.Row-1][secondindex.Col]);
                }
            }
            if(firstindex.Row == 0){
                decodedCharactersConvertString(matrixtable[firstindex.Row+ROW][firstindex.Col]);
                decodedCharactersConvertString(matrixtable[secondindex.Row-1][secondindex.Col]);

            }
            if(secondindex.Row == 0){
                decodedCharactersConvertString(matrixtable[firstindex.Row-1][firstindex.Col]);
                decodedCharactersConvertString(matrixtable[secondindex.Row+ROW][secondindex.Col]);
            }
        }
    }

    private void decodedCharactersConvertString(Character character){
        String string = Character.toString(character);
        System.out.print(string);
    }
}