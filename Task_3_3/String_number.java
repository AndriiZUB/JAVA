package JAVA.Task_3_3;

import java.util.ArrayList;

public class String_number {
    String str = "";
    int idxn=0;
    int wrNum = 0;

    public int getNumbersOfWords(String str) {
        str = str.trim();

        for (int i = 0; i < (str.length() - 1); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i) != str.charAt(i + 1)) {
                wrNum++;
            }
        }
        return wrNum;
    }


    public void getNum2(String str ,int indx) {
       // String str = " JAVA PROGRAMING COURS ";
        int i = 0;
        str = str.trim();
        String word = "";
        System.out.println(str.length());
        ArrayList<String> wordsList = new ArrayList<String>();
        while ( i < str.length()) {
            if (str.charAt(i)!= ' ')  {
                word = word +str.charAt(i);
            }
             if ((str.charAt(i) == ' ') || (i == str.length()-1)){
                wordsList.add(word);
                word="";
                //System.out.println("a=" + wordsList);

            }
           i++;
        }

        System.out.println("Under the index " + indx + "Is the word "+ wordsList.get(indx));
    }

}

