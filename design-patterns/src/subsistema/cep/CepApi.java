package subsistema.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getIntancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
    return "Gravataí";
    }

    public String recuperarEstado(String cep){
    return "RS";
    }
}
