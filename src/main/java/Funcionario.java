public class Funcionario {
    private String nome;
    private FuncionarioEstado estado;

    public Funcionario(){
        this.estado = FuncionarioEstadoContratado.getInstance();
    }

    public void setEstado(Funcionario funcionario){
        this.estado = estado;
    }

    public String contratar(Funcionario funcionario){
        return this.estado.contratar(this);
    }

    public String transferir(Funcionario funcionario){
        return this.estado.transferir(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioEstado getEstado(){
        return estado;
    }
}
