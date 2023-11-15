package br.com.ajrdevops.TabelaFipe.principal;

import br.com.ajrdevops.TabelaFipe.service.ConsumoApi;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";
    public void exibeMenu() {
        var menu = """
                **** OPÇÕES ****
                Carro
                Moto
                Caminhão
                
                Digite umas das opções para consultar: 
                """;

        System.out.println(menu);
        var opcao = leitura.nextLine();

        String endereco;

        if (opcao.toLowerCase().contains("car")) {
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mo")) {
            endereco = URL_BASE + "carros/marcas";
        } else {
            endereco = URL_BASE + "carros/marcas";
        }

        var json = consumo.obterDados(endereco);

        System.out.println(json);

    }
}
