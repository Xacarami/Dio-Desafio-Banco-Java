import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    List<String> clientes = new ArrayList<>();
    
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        clientes.add(String.format("%s", cliente));
    }

    // protected void vazarContas(){
    //     for (String cliente : clientes){
    //         // System.out.println(String.format("%s", cliente));
    //         System.out.println(cliente.toString());
    //     }
    // }

    // protected void vazarTodosClientes(){
    //     vazarContas();
    // }

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }



    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia)); //pode ou não usar o this
        System.out.println(String.format("Numero: %d", this.numero)); //pode ou não usar o this
        System.out.println(String.format("Saldo: %.2f", this.saldo)); //pode ou não usar o this
    }

}
