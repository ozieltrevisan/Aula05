public class Main {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Oziel Trevisan";
        eu.cpf = "008.349.629.77";
        eu.anoNacimento = 1983;

        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2011;
        meuCarro.cor = "preto";
        meuCarro.modelo = "Opala";
        meuCarro.fabricante = "GM";
        meuCarro.precoCompra = 100;
        meuCarro.proprietario = eu;

        //meuCarro.proprietario.nome = "Bruno";


        //       Pessoa proprietarioAntigo = meuCarro.proprietario;

        Pessoa voce = new Pessoa();
        voce.nome = "Sivana Carlan";
        voce.cpf = "009.381.610.32";
        voce.anoNacimento = 1984;


        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2017;
        seuCarro.cor = "Vermlho";
        seuCarro.modelo = "Fusca";
        seuCarro.fabricante = "VW";
        seuCarro.precoCompra = 10000;
        seuCarro.proprietario = voce;

       meuCarro.imprimirTempoDepresiacao();
       meuCarro.calcularIpva();


       System.out.println("***********************");

       seuCarro.imprimirTempoDepresiacao();
       seuCarro.calcularIpva();

       // double valorRevenda = seuCarro.calcularValorRevenda();
//        System.out.printf("Tempo de uso: %d%n", seuCarro.anoFabricacao);
//        System.out.printf("Valor de Revenda: %6.2f%n", valorRevenda);



  /*      System.out.println("Meu carro");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietario: %S%n Nacido em: %S%n ", meuCarro.proprietario.nome, meuCarro.proprietario.anoNacimento);
        System.out.printf("CPF: %S%n ", meuCarro.proprietario.cpf);

        System.out.println("------------");

        System.out.println("Seu carro");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietario: %S%n", seuCarro.proprietario.nome);
        System.out.printf("CPF: %S%n", seuCarro.proprietario.cpf);*/



    }
}