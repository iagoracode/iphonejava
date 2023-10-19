// Interface para o Reprodutor Musical
interface ReprodutorMusical {
    void tocarMusica();
    void pausarMusica();
    void avancarMusica();
    void retrocederMusica();
}

// Interface para o Aparelho Telefônico
interface AparelhoTelefonico {
    void fazerLigacao(String numero);
    void receberLigacao(String numero);
    void enviarMensagem(String mensagem);
    void receberMensagem(String mensagem);
}

// Interface para o Navegador na Internet
interface NavegadorInternet {
    void abrirNavegador();
    void fecharNavegador();
    void navegar(String url);
}

// Classe que representa um iPhone que implementa as interfaces
class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação das funções para o Reprodutor Musical
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    public void avancarMusica() {
        System.out.println("Avançando música...");
    }

    public void retrocederMusica() {
        System.out.println("Retrocedendo música...");
    }

    // Implementação das funções para o Aparelho Telefônico
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para " + numero);
    }

    public void receberLigacao(String numero) {
        System.out.println("Recebendo ligação de " + numero);
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem: " + mensagem);
    }

    public void receberMensagem(String mensagem) {
        System.out.println("Recebendo mensagem: " + mensagem);
    }

    // Implementação das funções para o Navegador na Internet
    public void abrirNavegador() {
        System.out.println("Abrindo navegador...");
    }

    public void fecharNavegador() {
        System.out.println("Fechando navegador...");
    }

    public void navegar(String url) {
        System.out.println("Navegando para: " + url);
    }
}

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.tocarMusica();
        iphone.fazerLigacao("123-456-7890");
        iphone.abrirNavegador();
        iphone.navegar("https://www.google.com");
    }
}
