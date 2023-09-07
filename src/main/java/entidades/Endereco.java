package entidades;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class Endereco {
    private String rua;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String uf;
    private Integer cep;
    private String complemento;

}
