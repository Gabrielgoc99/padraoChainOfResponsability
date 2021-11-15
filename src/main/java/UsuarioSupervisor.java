
public class UsuarioSupervisor extends Usuario {

    public UsuarioSupervisor(Usuario nivelSuperior) {
       areasSoftware.add(AcessoSoftwareCadastroProduto.getAcessoSoftwareCadastroProduto());
        setUsuarioMaisAvancado(nivelSuperior);
    }

    public String getDescricaoUsuario() {
        return "Supervisor, acesso permitido!";
    }
}