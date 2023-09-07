package controladorExercicio2;

import entidades.Pessoa;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.jboss.logging.annotations.Message;
import org.omnifaces.util.Messages;
import org.springframework.stereotype.Component;


@Component
@ViewScoped
@Data

public class CadastroControlador {

    private Pessoa pessoa = new Pessoa();

    public void salvar() {
        Messages.addFlashGlobalInfo("Registro salvo com sucesso");
    }

}
