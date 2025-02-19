# ContaBanco - Desafio DIO

Este projeto faz parte da trilha **Java Básico** do **Bootcamp Bradesco - Java Cloud Native** da [DIO (Digital Innovation One)](https://www.dio.me). O objetivo é praticar conceitos fundamentais da linguagem Java, incluindo declaração de variáveis, uso do terminal, manipulação de entrada do usuário via `Scanner`, concatenação de strings e exibição formatada de saída.

## 📌 Descrição do Projeto

O programa solicita ao usuário informações sobre sua conta bancária via terminal e, ao final, exibe uma mensagem formatada com os dados fornecidos.

## 🚀 Tecnologias Utilizadas

- Java 17+ (ou versão compatível)
- IDE de sua escolha (VS Code, IntelliJ IDEA, Eclipse, etc.)

## 📋 Requisitos

- Ter o Java instalado na máquina
- Utilizar um terminal para rodar o programa

## 📜 Instruções

1. Clone este repositório ou crie o projeto manualmente.
2. No diretório do projeto, crie a classe `ContaTerminal.java` e adicione o seguinte código:

```java
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());
        
        System.out.println("Digite o número da agência: ");
        String agencia = sc.nextLine();
        
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        
        System.out.println("Digite o saldo da conta: ");
        double saldo = Double.parseDouble(sc.nextLine());
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n", nomeCliente, agencia, numero, saldo);
        
        sc.close();
    }
}
```

3. Compile e execute o programa no terminal:

```sh
javac ContaTerminal.java
java ContaTerminal
```

4. Insira os dados conforme solicitado pelo programa e veja a mensagem final exibida corretamente formatada.

## 🎯 Objetivos de Aprendizado

- Revisar a sintaxe básica do Java
- Praticar entrada de dados pelo terminal
- Manipular strings e formatação de saída
- Trabalhar com tipos de dados básicos (int, double, String)

## 📌 Exemplo de Entrada e Saída

**Entrada:**

```
Digite o número da conta: 1021
Digite o número da agência: 067-8
Digite o nome do cliente: THONE CARDOSO DE ARAUJO
Digite o saldo da conta: 237.48
```

**Saída:**

```
Olá THONE CARDOSO DE ARAUJO, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

## 🏆 Contribuição

Se desejar contribuir, sinta-se à vontade para abrir issues ou pull requests!

---

Feito com ❤️ para fins educacionais!

