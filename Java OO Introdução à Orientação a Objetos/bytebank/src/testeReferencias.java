public class testeReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); //oprimeiraConta nao é um objeto de Conta mas sim uma referencia
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        
        System.out.println("saldo segunda: " + segundaConta.saldo);
        
        segundaConta.saldo += 100;
        
        System.out.println("saldo primeira: " + primeiraConta.saldo); // as duas dao o mesmo valor porque estao referenciando o mesmo objeto
        System.out.println("saldo segunda: " + segundaConta.saldo);

    }
}
