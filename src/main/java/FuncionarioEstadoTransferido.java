public class FuncionarioEstadoTransferido implements  FuncionarioEstado{

    private FuncionarioEstadoTransferido(){};
    private static FuncionarioEstadoTransferido instance = new FuncionarioEstadoTransferido();
    public static  FuncionarioEstadoTransferido getInstance(){
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
