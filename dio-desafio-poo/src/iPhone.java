import ReprodutorMusical.AppMusica;
import AparelhoTelefonico.Telefone;
import NavegadorInternet.Navegador;
public class iPhone {
    public static void main(String[] args) {

        Telefone telefone = new Telefone();
        telefone.iniciarCorreioVoz();
        telefone.ligar();
        telefone.atender();

        Navegador navegador = new Navegador();
        navegador.adicionarNovaAba();
        navegador.exibirPagina();
        navegador.atualizarPagina();

        AppMusica app = new AppMusica();
        app.selecionarmusica();
        app.tocar();
        app.pausar();
    }
}