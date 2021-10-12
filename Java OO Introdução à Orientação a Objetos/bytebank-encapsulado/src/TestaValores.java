public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        System.err.println(conta.getAgencia());

        conta.setAgencia(123123123);

        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(1337, 16549);

        System.out.println(Conta.getTotal());
        
    }
}
