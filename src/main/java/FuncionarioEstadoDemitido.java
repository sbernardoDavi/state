public class FuncionarioEstadoDemitido implements  FuncionarioEstado{

    private FuncionarioEstadoDemitido(){};
    private static FuncionarioEstadoDemitido instance = new FuncionarioEstadoDemitido();
    public static  FuncionarioEstadoDemitido getInstance(){
        return instance;
    }

    public String getEstado() {
        return "Demitido";
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