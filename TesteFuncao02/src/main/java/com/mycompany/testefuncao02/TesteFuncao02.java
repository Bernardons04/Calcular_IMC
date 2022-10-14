/*Neste projeto, eu simulo uma calculadora de IMC, usando métodos em uma classe diferente*/
package com.mycompany.testefuncao02;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TesteFuncao02 {

    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat(".00");
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura: "));
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso: "));
        JOptionPane.showMessageDialog(null, "O seu imc é: " + deci.format(Operacoes.imc(altura, peso))
            + "\n e você se classifica em: " + Operacoes.classificação(altura, peso));
    }
}
