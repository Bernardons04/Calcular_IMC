package com.mycompany.testefuncao02;

public class Operacoes {
    public static float imc(float alt, float pes) {
        float imc = pes/(alt*alt);        
        return imc;
    }
    public static String classificação(float alt, float pes) {        
        String classe = "";
        float imc = pes / (alt*alt);
        if (imc < 18.5) {
            classe = "Abaixo do peso";
        } else if (18.6 < imc && imc < 24.9) {
            classe = "Peso ideal (parabéns)";
        } else if (25 < imc && imc < 29.9) {
            classe = "Levemente acima do peso";
        } else if (30 < imc && imc < 34.9) {
            classe = "Obesidade grau I";
        } else if (35 < imc && imc < 39.9) {
            classe = "Obesidade grau II (severa)";
        } else if (40 < imc) {
            classe = "Obesidade grau III (mórbida)";
        }
        return classe;
    }    
}
