package com.company;

public class Cinematica {
    public double velocidade,espaco,tempo;
    public double velocidadeMedia(){
        double vm;
        vm = espaco/tempo;
        return vm;
    }
    public double aceleracao(){
        double a;
        a = velocidade/tempo;
        return a;
    }
}
