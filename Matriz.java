package Studing;

public class Matriz {
    public static void isMatriz(){

        int matriz[][] = new int[33][33];

        for(int i = 0;i < matriz.length; i++){
          for (int k = 0; k < matriz.length; k++){
              if(i == k){
                  matriz[i][k] = 1;
                  System.out.print(matriz[i][k]+ " ");
              }
              else if(i>k){
                  matriz[i][k] = 2;
                  System.out.print(matriz[i][k]+ " ");
              }
              else{
                  matriz[i][k] = 0;
                  System.out.print(matriz[i][k]+ " ");

              }
          }
        System.out.println();
        }
    }
    public static void main(String[]args){
        isMatriz();
    }
}
