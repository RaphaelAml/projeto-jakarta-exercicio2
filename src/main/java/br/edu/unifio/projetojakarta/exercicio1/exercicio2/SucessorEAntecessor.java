package exercicio2;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class NumeroBean {

    private Integer numero;
    private Integer sucessor;
    private Integer antecessor;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getSucessor() {
        return sucessor;
    }

    public Integer getAntecessor() {
        return antecessor;
    }

    public void calcularSucessorAntecessor() {
        if (numero != null) {
            sucessor = numero + 1;
            antecessor = numero - 1;
        } else {
            sucessor = null;
            antecessor = null;
        }
    }
}
