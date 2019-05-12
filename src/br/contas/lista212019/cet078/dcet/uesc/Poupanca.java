package br.contas.lista212019.cet078.dcet.uesc;
import br.clientes.lista212019.cet078.dcet.uesc.Cliente;

/**
 *
 * @author brenu
 */
public class Poupanca extends Conta {
    
    private double rentabilidade;
    
    public Poupanca(int numero,double saldo,Cliente cliente){
        super(numero,saldo,cliente);

    }
    public void renderJuros(double taxa){
        this.rentabilidade = this.getSaldo() * taxa;
        this.creditar(this.rentabilidade);
    }
}
