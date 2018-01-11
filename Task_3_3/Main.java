package JAVA.Task_3_3;



import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        String_number st = new String_number();
        Scanner s = new Scanner(System.in);
        Scanner indx = new Scanner(System.in);
        System.out.println("Enter the string please");
        st.str = s.nextLine();

       // st.getNumbersOfWords(st.str);
        System.out.println("Enter the index please");
        st.idxn= indx.nextInt();

        st.getNum2(st.str, st.idxn);

    }
}
