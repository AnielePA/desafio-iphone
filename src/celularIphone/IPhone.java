package celularIphone;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {



    public void tocar() {
        System.out.println("TOCANDO");
    }
    
    public void pausar() {
        System.out.println("PAUSANDO");
        
    }

    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MÚSICA");
        
    }


    public void ligar(String numero) {
        System.out.println("LIGANDO");
        
    }

    
    public void atender() {
        System.out.println("ATENDENDO");
        
    }


    
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO O CORREIO DE VOZ");
        
    }


    public void exibirPagina(String url) {
        System.out.println("EXIBINDO A PÁGINA");
        
    }

    
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO UMA ABA NOVA");
    }

    
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA");
        
    }

}