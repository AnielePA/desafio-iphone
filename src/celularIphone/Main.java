package celularIphone;

import celularIphone.IPhone;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.tocar();
        iphone.selecionarMusica("Música favorita");
        iphone.pausar();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}

