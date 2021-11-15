
public class AcessoSoftwareVenda implements TipoSoftware {

    private static AcessoSoftwareVenda acessoSoftwareVenda = new AcessoSoftwareVenda();

    private AcessoSoftwareVenda() {

    };

    public static AcessoSoftwareVenda getAcessoSoftwareVenda() {
        return acessoSoftwareVenda;
    }
}