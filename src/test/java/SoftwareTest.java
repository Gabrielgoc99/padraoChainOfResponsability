import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoftwareTest {

    UsuarioGerente gerente;
    UsuarioDeptoPessoal deptoPessoal;
    UsuarioSupervisor supervisor;
    UsuarioVendedor vendedor;

    @BeforeEach
    void setUp() {
        gerente = new UsuarioGerente(null);
        deptoPessoal = new UsuarioDeptoPessoal(gerente);
        supervisor = new UsuarioSupervisor(deptoPessoal);
        vendedor = new UsuarioVendedor(supervisor);
    }

    @Test
    void retornaVendedorAcessarSoftwareVenda() {
        assertEquals("Vendedor, acesso permitido!", vendedor.acessarSoftware(new Software(AcessoSoftwareVenda.getAcessoSoftwareVenda())));
    }

    @Test
    void retornaSupervisorAcessarSoftwareCadastroProduto() {
        assertEquals("Supervisor, acesso permitido!", supervisor.acessarSoftware(new Software(AcessoSoftwareCadastroProduto.getAcessoSoftwareCadastroProduto())));
    }


    @Test
    void retornaDeptoPessoalAcessarSoftwareDeptoPessoal() {
        assertEquals("Depto Pessoal, acesso permitido!", deptoPessoal.acessarSoftware(new Software(AcessoSoftwareDeptoPessoal.getAcessoSoftwareDeptoPessoal())));
    }


    @Test
    void retornaGerenteAcessarSoftwareCadastroFuncionario() {
        assertEquals("Gerente, acesso permitido!", gerente.acessarSoftware(new Software(AcessoSoftwareCadastroFuncionario.getAcessoSoftwareCadastroFuncionario())));
    }


}