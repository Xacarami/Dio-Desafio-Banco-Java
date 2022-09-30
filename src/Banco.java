import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void vazarContas(){
        for (int i = 0; i < 2; i++) {
            System.out.println(getContas());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // protected void vazarContass(){
    //     for (String cliente : getContas()){
    //         // System.out.println(String.format("%s", cliente));
    //         System.out.println(cliente.toString());
    //     }
    // }
}
