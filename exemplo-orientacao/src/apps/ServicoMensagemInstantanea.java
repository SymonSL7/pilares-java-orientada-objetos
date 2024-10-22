package apps;
public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConexaoInternet(){
        System.out.println("Validando a conexão com a internet!");
    }

}
