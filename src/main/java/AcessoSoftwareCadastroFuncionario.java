
public class AcessoSoftwareCadastroFuncionario implements TipoSoftware {

    private static AcessoSoftwareCadastroFuncionario acessoSoftwareCadastroFuncionario = new AcessoSoftwareCadastroFuncionario();

    private AcessoSoftwareCadastroFuncionario() {

    };

    public static AcessoSoftwareCadastroFuncionario getAcessoSoftwareCadastroFuncionario() {
        return acessoSoftwareCadastroFuncionario;
    }

}