public interface FuncionarioEstado {

    String getEstado();
    String contratar(Funcionario funcionario);
    String demitir(Funcionario funcionario);
    String transferir(Funcionario funcionario);
}
