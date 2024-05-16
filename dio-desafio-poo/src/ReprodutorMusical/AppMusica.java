package ReprodutorMusical;

public class AppMusica implements ReprodutorMusical {
    public void tocar(){
        System.out.println("Tocando música");
    };
    public void pausar(){
        System.out.println("Música pausada");
    }

    public void selecionarmusica(){
        System.out.println("Selecionando a música");
    }
}
