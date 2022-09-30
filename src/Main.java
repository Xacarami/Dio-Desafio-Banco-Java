public class Main extends Banco{
    public static void main(String[] args) {

        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel");

        Cliente renato = new Cliente();
        renato.setNome("Renato");


        Conta cc = new ContaCorrente(gabriel);
        Conta cp = new ContaPoupanca(renato);
        
        
        cc.depositar(100);
        cc.transferir(25, cp);

        // cc.imprimirExtrato();
        // cp.imprimirExtrato();

        // cc.vazarTodosClientes();
    }
}
