package AparelhoTelefonico;

import AparelhoTelefonico.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    public void ligar(){
        System.out.println("Selecione o contato que deseja ligar: ");
    }
    public void atender(){
        System.out.println("Tocando celular");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Grave seu correio de voz após o sinal: ");
    }

}
