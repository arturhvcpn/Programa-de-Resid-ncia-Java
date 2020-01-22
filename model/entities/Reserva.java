package model.entities;

import model.exceptions.DomainException;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private int numeroQuarto;
    private Date checkIn, checkOut;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(int numeroQuarto, Date checkIn, Date checkOut)throws DomainException{
        if(!checkOut.after(checkIn)){
           throw new DomainException("Erro data informada posterior a data de hoje");
        }

        this.numeroQuarto = numeroQuarto;
        this.checkOut = checkOut;
        this.checkIn = checkIn;
    }

    public void atualizarDatas(Date checkIn, Date checkOut)throws DomainException{
        if (checkIn.before(new Date()) || checkOut.before(new Date())){
            throw new DomainException("Datas devem ser futuras");
        }
        if(!checkOut.after(checkIn)){
            throw new DomainException("Erro data informada posterior a data de hoje");
        }
        else{
            System.out.println(toString());
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    public long duracao(){
        long tempo =  checkOut.getTime() - checkIn.getTime();
        long resultado = (TimeUnit.DAYS.convert(tempo,TimeUnit.MILLISECONDS));
        return resultado;
    }
    public Date getCheckIn() {
        return checkIn;
    }
    public Date getCheckOut() {
        return checkOut;
    }
    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    @Override
    public String toString() {
        return  "\nReserva" +
                "\nNúmero do Quarto: " + numeroQuarto +
                "\nCheck In(dd/MM/yyyy): " + checkIn +
                "\nCheck Out(dd/MM/yyyy): " + checkOut +
                "\nReserva: Quarto " + getNumeroQuarto() +
                ", Check in " + sdf.format(getCheckIn()) +
                ", Check out "+ sdf.format(getCheckOut()) +
                ", "+ duracao() +
                " noites";
    }
}