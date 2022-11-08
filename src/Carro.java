public class Carro {

    String fabricante ;
    String modelo;
    String cor;
    int anoFabricacao ;
    double precoCompra;
    Pessoa proprietario;

    int calcularTempoDeUsoEmAnos(){
        return 2022 - anoFabricacao;
    }
    void imprimirTempoDepresiacao(){

        double valorRevenda = calcularValorRevenda();
        int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

        if(precoCompra <= 0){
            System.out.println("O carro nao tem Depreciação");
            return;
        }

        System.out.printf("Tempo d uso: %d%n", tempoDeUsoMeuCarro);
        System.out.printf("Valor de Revenda: %6.2f%n", valorRevenda);
        System.out.printf("Valor do ipva: %.2f%n", calcularIpva());
    }
    double calcularIpva(){
        int tempoDeuso = calcularTempoDeUsoEmAnos();
        if(tempoDeuso >= 10){
            return 0;
        }

        return calcularValorRevenda() * 0.04;
    }

    double calcularValorRevenda(){
       int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
       int vidaUltilEmAnos = 20;
       double valorRevenda = (precoCompra / vidaUltilEmAnos) * (vidaUltilEmAnos - tempoDeUsoEmAnos);

       if (valorRevenda < 0){
           valorRevenda = 0;
       }

        return valorRevenda;
    }

}
