package entidades;

import lombok.Data;

@Data
public class Pessoa {
    private Integer codigo;
    private String nome;
    private Integer cpf;
    private Integer dataNasc;
}
