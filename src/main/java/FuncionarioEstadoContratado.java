public class FuncionarioEstadoContratado implements  FuncionarioEstado{

    private FuncionarioEstadoContratado(){};
    private static FuncionarioEstadoContratado instance = new FuncionarioEstadoContratado();
    public static  FuncionarioEstadoContratado getInstance(){
        return instance;
    }

    public String getEstado() {
        return "Contratado";
    }

    public String contratar(Funcionario funcionario){
        return "Contrato não realizado";
    }

    public String demitir(Funcionario funcionario){
        return "demitido";
    }

    public String transferir(Funcionario funcionario){
        return "transferido";
    }


}
