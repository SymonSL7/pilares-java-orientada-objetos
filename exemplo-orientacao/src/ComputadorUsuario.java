import apps.FacebookMenssenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorUsuario {

    public static void main(String[] args) {
        
        ServicoMensagemInstantanea appEscolhido = null;
        
        String escolherApp = "facebook";
        escolherApp = escolherApp.toUpperCase();

        if (escolherApp.equals("MSN")){

            appEscolhido = new MSNMessenger();

        } else if (escolherApp.equals("FACEBOOK")) {
           
            appEscolhido = new FacebookMenssenger();
            
        } else if (escolherApp.equals("TELEGRAM")) {

            appEscolhido = new Telegram();
            
        }

        appEscolhido.enviarMensagem();
        appEscolhido.receberMensagem();

        

    }

}
