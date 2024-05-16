import ReprodutorMusical.AppMusica;
import AparelhoTelefonico.Telefone;
import NavegadorInternet.Navegador;
public class Main {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        navegador.adicionarNovaAba();

        Telefone telefone = new Telefone();
        telefone.ligar();
    }
}