
public class AcessoSoftwareDeptoPessoal implements TipoSoftware {

    private static AcessoSoftwareDeptoPessoal acessoSoftwareDeptoPessoal = new AcessoSoftwareDeptoPessoal();

    private AcessoSoftwareDeptoPessoal() {};

    public static AcessoSoftwareDeptoPessoal getAcessoSoftwareDeptoPessoal() {
        return acessoSoftwareDeptoPessoal;
    }

}