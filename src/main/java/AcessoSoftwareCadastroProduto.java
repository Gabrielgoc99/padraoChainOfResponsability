
public class AcessoSoftwareCadastroProduto implements TipoSoftware {

    private static AcessoSoftwareCadastroProduto acessoSoftwareCadastroProduto = new AcessoSoftwareCadastroProduto();

    private AcessoSoftwareCadastroProduto() {};

    public static AcessoSoftwareCadastroProduto getAcessoSoftwareCadastroProduto() {
        return acessoSoftwareCadastroProduto;
    }

}