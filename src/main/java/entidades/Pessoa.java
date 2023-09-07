package entidades;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class Pessoa {
    private Integer codigo;
    private String nome;
    private Integer cpf;
    private Integer dataNasc;
}
