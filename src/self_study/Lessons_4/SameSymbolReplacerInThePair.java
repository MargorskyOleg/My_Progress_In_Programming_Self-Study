package self_study.Lessons_4;

public class SameSymbolReplacerInThePair {

    final static String X_SYMBOL = "X";



    public static String replaceSameSymbolInThePair(String sourceString){

        //easy way to make whole string UPPERCASE
        sourceString = sourceString.toUpperCase();
        //easy way to replace ' ' by '_'
        sourceString = sourceString.replace(' ', '_');


        String resultString = "";

        //now going to check each pair
        for(int i = 0; i < sourceString.length();) {
            resultString += sourceString.charAt(i);

            if(i < sourceString.length() - 1) { // we can check pair
                if (sourceString.charAt(i) == sourceString.charAt(i + 1)) {
                    resultString += X_SYMBOL;
                    i++; //this is important point
                } else {
                    resultString += sourceString.charAt(i + 1);
                    i += 2; //this is second im point
                }
            }else{ //pair can't be checked cos of end of string
                i++;
            }
        }
        return resultString;
    }

    public static String[] splitAsPairs(String sourceString){
        //to be sure sourceString can be splitted for pairs
        if(sourceString.length() % 2 != 0) {// odd number of symbols
            sourceString += X_SYMBOL; // actually we can add other symbol at the end of string
        }
        String[] resultArray = new String[sourceString.length() / 2]; //array size is half of sourceString length

        for(int i = 0; i < sourceString.length() / 2; i ++){
            resultArray[i] = sourceString.substring(i * 2, i * 2 + 2); // get pair of symbols from the sourceString
        }
        return resultArray;
    }
}
