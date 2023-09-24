package entidades;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data
public class Carro {
    private Integer codigo;
    private String marca;
    private String modelo;
    private Integer anoFabricao;
    private Integer anoModelo;
    private Double valor;

}
