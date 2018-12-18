package self_study.Lessons_3;

public class PlayFairDecoder {

    private char[][] cipherTable;

    public PlayFairDecoder(char[][] cTable){
        cipherTable = cTable;
    }

    private IndexRowCol IndexOfSymbolInChipherTable(Character symbolToFind){
        for(int row = 0; row < cipherTable.length; row++){
            for(int col = 0; col < cipherTable[0].length; col++){
                if (cipherTable[row][col] == symbolToFind)
                    return new IndexRowCol(row, col);
            }
        }
        return new IndexRowCol(-1, -1);
    }

    //actually we don't need method to print pairs of symbols and their indexes
    //but it is good for educational purposes

    public void printPairsOfSymbolsAndIndexes(String originalString){
        for(int i = 0; i < originalString.length() - 1; i += 2){

            Character firstChar = originalString.charAt(i);
            Character secondChar = originalString.charAt(i + 1);

            String pairFirstSymbol = Character.toString(firstChar);
            String pairSecondSymbol = Character.toString(secondChar);

            IndexRowCol ircFirst = IndexOfSymbolInChipherTable(firstChar);
            IndexRowCol ircSecond = IndexOfSymbolInChipherTable(secondChar);

            System.out.println("1st: '" + pairFirstSymbol + "' [" + ircFirst.Row + ", " + ircFirst.Col + "] \t 2nd: '"
                    + pairSecondSymbol + "' [" + ircSecond.Row + ", " + ircSecond.Col + "]");
        }

    }
}
