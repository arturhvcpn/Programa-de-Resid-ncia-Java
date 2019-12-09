package markSeven;

import java.util.Scanner;

public class markSeven {
    public static void main(String[]args){

        Scanner read = new Scanner(System.in);

        markTrapezio mark_Trapezio_Area = new markTrapezio();
        markTrapezio mark_Trapezio_Two = new markTrapezio(2,5,7);

        mark_Trapezio_Area.setAltura(2);
        mark_Trapezio_Area.setBase_maior(2);
        mark_Trapezio_Area.setBase_menor(2);
        System.out.println("altura  == " + mark_Trapezio_Area.getBase_menor());
        System.out.println("base menor  == " + mark_Trapezio_Area.getBase_maior());
        System.out.println("base maior  == " + mark_Trapezio_Area.getAltura());

        //System.out.println("area == "+ mark_Trapezio_Area.markArea());
    }
}
