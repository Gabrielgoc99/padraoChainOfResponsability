
public class UsuarioGerente extends Usuario {

    public UsuarioGerente(Usuario nivelSuperior) {
        areasSoftware.add(AcessoSoftwareCadastroFuncionario.getAcessoSoftwareCadastroFuncionario());
        setUsuarioMaisAvancado(nivelSuperior);
    }

    public String getDescricaoUsuario() {
        return "Gerente, acesso permitido!";
    }
}