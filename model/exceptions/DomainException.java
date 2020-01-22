package model.exceptions;

public class DomainException extends Exception {
    private static final long serialVersionUID = 1L;

    public DomainException(String message){
        //upcasting / downcasting
        super(message);
    }
}