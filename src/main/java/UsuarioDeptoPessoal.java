
public class UsuarioDeptoPessoal extends Usuario {

    public UsuarioDeptoPessoal(Usuario nivelSuperior) {
        areasSoftware.add(AcessoSoftwareDeptoPessoal.getAcessoSoftwareDeptoPessoal());
        setUsuarioMaisAvancado(nivelSuperior);
    }

    public String getDescricaoUsuario() {
        return "Depto Pessoal, acesso permitido!";
    }
}
