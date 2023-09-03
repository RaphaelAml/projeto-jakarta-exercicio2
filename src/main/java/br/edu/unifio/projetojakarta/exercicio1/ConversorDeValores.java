package br.edu.unifio.projetojakarta.exercicio1.exercicio2;

import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@ViewScoped
@Data

public class ConversorDeValores {

    private Double cotacaoEmDolarDia;
    private Double valorEmDolar;
    private Double resultado;

    public void converter() {
        resultado = cotacaoEmDolarDia * valorEmDolar;
    }


}
