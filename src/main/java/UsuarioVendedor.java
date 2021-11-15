
public class UsuarioVendedor extends Usuario {

    public UsuarioVendedor(Usuario nivelSuperior) {
        areasSoftware.add(AcessoSoftwareVenda.getAcessoSoftwareVenda());
        setUsuarioMaisAvancado(nivelSuperior);
    }

    public String getDescricaoUsuario() {
        return "Vendedor, acesso permitido!";
    }
}