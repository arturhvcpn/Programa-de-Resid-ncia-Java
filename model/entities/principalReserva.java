package model.entities;

import model.exceptions.DomainException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class principalReserva {
    public static void main(String[]args){
        try{
            Scanner read = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            //protege contra entrada de datas inválidas
            sdf.setLenient(false);

            System.out.print("Número do quarto :");
            int number = read.nextInt();

            System.out.print("Check-in(dd/MM/yyyy):");
            Date dateCheckIn = sdf.parse(read.next());

            System.out.print("Check-out(dd/MM/yyyy):");
            Date dateCheckOut = sdf.parse(read.next());

            Reserva foo = new Reserva(number,dateCheckIn,dateCheckOut);
            foo.atualizarDatas(dateCheckIn,dateCheckOut);

            System.out.println("\nInforme as datas para atualização:");

            System.out.print("Check-in(dd/MM/yyyy):");
            dateCheckIn = sdf.parse(read.next());

            System.out.print("Check-out(dd/MM/yyyy):");
            dateCheckOut = sdf.parse(read.next());

            foo.atualizarDatas(dateCheckIn,dateCheckOut);

        }catch (ParseException e){
            System.out.println("Formato Inválido");
            //e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Formato Inválido: Aceita apenas números");
            //e.printStackTrace();
        }
        catch (RuntimeException e) {
            System.out.println(";-; Erro desconhecido!");
            //e.printStackTrace();
        }
        catch (DomainException e) {
            System.out.println("Erro na reserva:" +e.getMessage());
            //e.printStackTrace();
        }
    }
}