package markSeven;

public class markTrapezio {

    private double base_menor,base_maior,altura;

//construtor da classe trapézio
    public markTrapezio(){
        base_maior = 0;
        base_menor = 0;
        altura = 0;
    }
    public markTrapezio(double base_menor,double base_maior,double altura){
        this.base_menor = base_menor;
        this.base_maior = base_maior;
        this.altura = altura;
    }

    //método da classe trapézio
    public double markArea(){
    double area = ((base_maior+base_menor)*altura)/2;
    return (area);
    }
//################################################################################################


    //set base_menor
    public void setBase_menor(double base_menor){
        this.base_menor = base_menor;
    }
    //get base_menor
    public double getBase_menor(){
        return this.base_menor;
    }

    //set base_maior
    public void setBase_maior(double base_maior){
        this.base_maior = base_maior;
    }
    //get base_maior
    public double getBase_maior(){
        return this.base_maior;
    }

    //set altura
    public void  setAltura(double altura){
        this.altura = altura;
    }
    //get altura
    public double getAltura() {
        return this.altura;
    }
}
