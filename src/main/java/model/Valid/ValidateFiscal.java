
package model.Valid;

import model.Fiscal;
import Exceptions.FiscalException;


public class ValidateFiscal {

    public boolean validaCPF(String cpf) {
        //vamos verificar o tamanho primeiro        
        if (cpf.length() != 11 && cpf.length() != 14) {
            return false;
            //throw new RuntimeException("CPF inválido -  Tamanho inválido.");
        }

        //Retira os caracteres deixando apenas digitos
        if (cpf.length() == 14) {
            cpf = cpf.replaceAll("\\.", "");
            cpf = cpf.replaceAll("-", "");
        }

        //se tem tamanho 11 e so possui digitos
        if (cpf.length() == 11 && cpf.matches("[0-9]*")) {
            String[] vet = cpf.split("");

            int digito1 = Integer.parseInt(vet[9]);
            int digito2 = Integer.parseInt(vet[10]);

            //vamos calcular o primeiro verificador
            int soma1 = 0;
            int fator1 = 10;
            for (int i = 0; i <= 8; i++) {
                int val = Integer.parseInt(vet[i]);
                soma1 = soma1 + (fator1 * val);
                fator1--;
            }

            int resultado1 = (soma1 * 10) % 11;
            if (resultado1 == 10) {
                resultado1 = 0;
            }

            if (resultado1 != digito1) {
                return false;
            }

            //vamos calcular o segundo verificador
            int soma2 = 0;
            int fator2 = 11;
            for (int i = 0; i <= 9; i++) {
                int val = Integer.parseInt(vet[i]);
                soma2 = soma2 + (fator2 * val);
                fator2--;
            }

            int resultado2 = (soma2 * 10) % 11;
            if (resultado2 == 10) {
                resultado2 = 0;
            }

            if (resultado2 != digito2) {
                return false;
            }

            //agora so basta verificar se todos são iguais
            for (int i = 0; i <= 9; i++) {
                int val = Integer.parseInt(vet[i]);
                int valProx = Integer.parseInt(vet[i + 1]);
                if (val != valProx) {
                    return true;
                }
            }
        }
        return false;
    }

    public Fiscal validacao(String nome, String sexo, String idade, String cpf, String senha) {
        Fiscal f = new Fiscal();
        if (nome.isEmpty()) {
            throw new FiscalException("Error - Campo vazio: 'nome'.");
        }
        f.setNome(nome);

        if (sexo.isEmpty()) {
            throw new FiscalException("Error - Campo vazio: 'sexo'.");
        }
        f.setSexo(sexo.charAt(0));

        int idadeInt = 0;
        if (idade.isEmpty()) {
            throw new FiscalException("Error - Campo vazio: 'idade'.");
        }

        if (!idade.matches("[0-9]*")) {
            throw new FiscalException("Error - Valor inválido no campo 'idade'.");
        }

        idadeInt = Integer.parseInt(idade);
        f.setIdade(idadeInt);

        if (cpf.isEmpty()) {
            throw new FiscalException("Error - Campo vazio: 'cpf'.");
        }

        ValidateFiscal validCPF = new ValidateFiscal();
        if (!validCPF.validaCPF(cpf)) {
            throw new FiscalException("Error - CPF invalido");
        }

        f.setCpf(cpf);

        if (senha.isEmpty()) {
            throw new FiscalException("Error - Campo vazio: 'senha'.");
        }
        f.setSenha(senha);

        return f;

    }

}
