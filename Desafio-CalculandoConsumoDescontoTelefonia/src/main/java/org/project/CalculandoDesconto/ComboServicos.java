package org.project.CalculandoDesconto;

import java.util.Arrays;

public class ComboServicos {
    private Servico[] servicos;
    private double desconto1, desconto2, desconto3;
    private double descontoAdicional = 20.00;

    public ComboServicos(Servico[] servicos, double[] descontos) {
        this.servicos = servicos;
        this.desconto1 = descontos[0];
        this.desconto2 = descontos[1];
        this.desconto3 = descontos[2];
    }

    // Método para calcular o valor total do combo com descontos
    public double calcularValorTotal() {
        // Conta quantos serviços foram contratados (com valor maior que 0)
        int servicosContratados = (int) Arrays.stream(servicos)
                .filter(servico -> servico.getValor() > 0)
                .count();

        double desconto = 0;
        // TODO: Aplique o desconto correspondente à quantidade de serviços contratados
        if (servicosContratados==1){
            desconto = desconto1;
        } else if (servicosContratados==2) {
            desconto = desconto2;
        } else if (servicosContratados==3) {
            desconto = desconto3;
        }

        // Calcula o valor total com desconto
        double valorComDesconto = Arrays.stream(servicos)
                .filter(servico -> servico.getValor() > 0)
                .mapToDouble(Servico::getValor)
                .sum() * (1 - desconto / 100);

        // TODO: Aplique desconto adicional se todos os três serviços foram contratados
        if (servicosContratados == 3){
            valorComDesconto -= descontoAdicional;
        }


        return valorComDesconto;
    }
}
