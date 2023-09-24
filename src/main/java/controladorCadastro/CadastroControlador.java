package controladorCadastro;

import entidades.Carro;
import entidades.Endereco;
import entidades.Pessoa;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.omnifaces.util.Messages;
import org.springframework.stereotype.Component;


@Component
@ViewScoped
@Data

public class CadastroControlador {

    private Pessoa pessoa = new Pessoa();
    private Endereco endereco = new Endereco();
    private Carro carro = new Carro();

    public void salvar() {
        Messages.addFlashGlobalInfo("Registro salvo com sucesso");
    }

}
