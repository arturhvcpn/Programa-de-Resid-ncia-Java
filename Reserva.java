package model.entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private int numeroQuarto;
    private Date checkIn, checkOut;
        //construtor
    public Reserva(int numeroQuarto,Date checkIn,Date checkOut){
        this.numeroQuarto = numeroQuarto;
        this.checkOut = checkOut;
        this.checkIn = checkIn;
    }
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // get
    public Date getCheckIn() {
        return checkIn;
    }
    public Date getCheckOut() {
        return checkOut;
    }
    public int getNumeroQuarto() {
        return numeroQuarto;
    }
        // set
    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    @Override
    public String toString() {
        return  "Reserva" +
                "\nNúmero do Quarto:" + numeroQuarto +
                "\nCheck In(dd/MM/yyyy): " + checkIn +
                "\nCheck Out(dd/MM/yyyy):" + checkOut +
                " Reserva: Quarto " + sdf.format(getNumeroQuarto()) +
                ", Check in " + sdf.format(getCheckIn()) +
                ", Check out "+ sdf.format(getCheckOut()) +
                ", "+
                "noites";
    }
}
