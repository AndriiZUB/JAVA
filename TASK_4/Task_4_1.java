package JAVA.TASK_4;

public class Task_4_1 {
    String[] mas1 = {"12", "20", "35", "40", "12"} ;

    public static void  replaceWords(String[]a){
        for (int i = 0; i < a.length; i ++){

          if(a[i]=="12"){
              a[i]= "replace";

          }

            System.out.println ("arr [" + i + "] =" + a [i]);
        }

        //return result;
    }
}
