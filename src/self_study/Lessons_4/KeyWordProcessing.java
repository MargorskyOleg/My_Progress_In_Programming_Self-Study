package self_study.Lessons_4;

public class KeyWordProcessing {

    private char[][] matrixtable;

    public KeyWordProcessing(char[][] matrixtable) {
        this.matrixtable = matrixtable;
    }

    public IndexRowCol keyFormationIntoTheMatrix(Character character){
        for(int Row = 0;Row < matrixtable.length;Row++){
            for(int Col = 0;Col < matrixtable[Row].length;Col++){
                if (matrixtable[Row][Col] == 0) {
                    matrixtable[Row][Col] = character;
                    return new IndexRowCol(Row, Col);
                }
                if (matrixtable[Row][Col] == character) {
                    return null;
                }
            }
        }
        return null;
    }

    public void handlerKeyWord(String originalkeyword){
        for(int i = 0;i < originalkeyword.length();i++){
            Character character = originalkeyword.charAt(i);
            Character characterToUpperCase = Character.toUpperCase(character);
            keyFormationIntoTheMatrix(characterToUpperCase);
        }
    }
}