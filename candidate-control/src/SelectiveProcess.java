public class SelectiveProcess {
    public static void main(String[] args) throws Exception {
        evaluateCandidate(1900.0);
        evaluateCandidate(2200);
        evaluateCandidate(2000);
    }
    static void evaluateCandidate(double expectedSalary){
        double baseSalary = 2000.0;
        if(baseSalary > expectedSalary){
            System.out.println("Ligar para o candidato");
        }else if(baseSalary==expectedSalary){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
