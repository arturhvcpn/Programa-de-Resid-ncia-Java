package model.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class principalReserva {
    public static void main(String[]args){
        try{
            Scanner read = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);

            //protege contra entrada de datas inválidas
            System.out.print("Número do quarto :");
            int number = read.nextInt();

            System.out.print("Check-in(dd/MM/yyyy):");
            Date dateCheckIn = sdf.parse(read.next());

            System.out.print("Check-out(dd/MM/yyyy):");
            Date dateCheckOut = sdf.parse(read.next());

            Reserva foo = new Reserva(number,dateCheckIn,dateCheckOut);
            String att = foo.atualizarDatas(dateCheckIn,dateCheckOut);

            if (att != null ){
                System.out.println("Erro na Reserva" + att);
            }else{
                System.out.println("Reserva: " + foo);
            }

            System.out.println("\nInforme as datas para atualização:");

            System.out.print("Check-in(dd/MM/yyyy):");
            dateCheckIn = sdf.parse(read.next());

            System.out.print("Check-out(dd/MM/yyyy):");
            dateCheckOut = sdf.parse(read.next());

            foo.atualizarDatas(dateCheckIn,dateCheckOut);

        }catch (ParseException e){
            System.out.println("Parse Exception");
        }
    }
}
