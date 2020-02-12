package Study;

import java.util.Scanner;

public class exercicio6 {
    public static void Exercicio6(){
        try{
            Scanner read = new Scanner(System.in);
            int array[] = new int[100];

            for(int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("###### Deadline ######");
        }
    }

    public static void main(String[]args){
        Exercicio6();
    }
}
