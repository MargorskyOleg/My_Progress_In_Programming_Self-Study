package self_study.Lessons_4;

public class KeyWordProcessing {//Обработка ключевых слов

    private char[][] matrixtable;

    public KeyWordProcessing(char[][] matrixtable) {
        this.matrixtable = matrixtable;
    }

    public IndexMatrixRowCol keyFormationIntoTheMatrix(Character character){
        for(int Row = 0;Row < matrixtable.length;Row++){
            for(int Col = 0;Col < matrixtable[Row].length;Col++){
                if (matrixtable[Row][Col] == 0) {
                    matrixtable[Row][Col] = character;
                    return new IndexMatrixRowCol(Row, Col);
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
            Character characterToUpperCaseReplaceSpace = replaceSpace(characterToUpperCase);
            keyFormationIntoTheMatrix(characterToUpperCaseReplaceSpace);
        }
    }

    private Character replaceSpace(Character spaceUnderscore){
        char space = ' ';
        char Underscore = '_';
        if (space == spaceUnderscore){
            return Underscore;
        }
        return spaceUnderscore;
    }
}
