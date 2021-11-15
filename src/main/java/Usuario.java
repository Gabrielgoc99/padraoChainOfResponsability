
import java.util.ArrayList;

public abstract class Usuario {

    protected ArrayList areasSoftware = new ArrayList();
    private Usuario usuarioMaisAvancado;

    public Usuario getUsuarioMaisAvancado() {
        return usuarioMaisAvancado;
    }

    public void setUsuarioMaisAvancado(Usuario usuarioMaisAvancado) {
        this.usuarioMaisAvancado = usuarioMaisAvancado;
    }

    public abstract String getDescricaoUsuario();

    public String acessarSoftware(Software software) {
        if (areasSoftware.contains(software.getTipoSoftware())) {
            return getDescricaoUsuario();
        }
        else {
            if (usuarioMaisAvancado != null) {
                return usuarioMaisAvancado.acessarSoftware(software);
            }
            else
            {
                return "Acesso negado!";
            }
        }
    }
}