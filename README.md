# Smart-Bank_V1

 SmartBank - Sistema ATM em Java
 Sobre o Projeto

O SmartBank é uma aplicação desenvolvida em Java que simula o funcionamento básico de um caixa eletrônico (ATM) através do terminal (console).

O sistema permite realizar operações bancárias essenciais como criação de conta, depósito, saque e transferência entre contas.

Este projeto foi desenvolvido com foco na aplicação de conceitos de Programação Orientada a Objetos (POO).

#  Objetivo

Aplicar conceitos fundamentais de:

Programação Orientada a Objetos

Organização em pacotes

Estrutura de dados dinâmica (ArrayList)

Tratamento de exceções

Interação com o usuário via console

#  Tecnologias Utilizadas

Java

 POO (Programação Orientada a Objetos)

ArrayList

Scanner (entrada de dados)

Organização em pacotes

#  Estrutura do Projeto
src/
│
├── view/
│   └── SmartBank.java
│
├── model/
│   ├── Cliente.java
│   └── Conta.java
│
└── Helper/
    └── Utils.java
 # Descrição das Classes
## SmartBank.java

Classe principal do sistema.

Responsável por:

Exibir o menu principal

Controlar as operações

Gerenciar a lista de contas

Buscar contas pelo número

Interagir com o usuário

##   Cliente.java

Classe que representa o cliente do banco.

Contém informações como:

Nome

Email

CPF

Data de nascimento

##   Conta.java

Classe que representa a conta bancária.

Funcionalidades:

Depositar valores

Sacar valores

Transferir dinheiro entre contas

Exibir dados da conta

##   Utils.java

Classe auxiliar com métodos utilitários:

Conversão de String para Data

Método de pausa do sistema

Auxílio em formatações

#  Funcionalidades do Sistema

O sistema apresenta o seguinte menu:

1 - Criar conta
2 - Efetuar saque
3 - Efetuar depósito
4 - Efetuar transferência
5 - Listar contas
6 - Sair do sistema
▶️ Como Executar o Projeto
##   1️⃣ Clonar o repositório
https://github.com/benjamilson7-code/SmartBank.git
##  2️⃣ Abrir em uma IDE

Pode ser executado em:

IntelliJ IDEA

Eclipse

VS Code

NetBeans

 Executar a classe principal

##  Execute o arquivo:

  SmartBank.java

# Conceitos de POO Aplicados

Encapsulamento

Associação entre classes

Abstração

Organização modular

Manipulação de objetos

Estrutura de dados dinâmica

# Possíveis Melhorias Futuras

Persistência de dados (Arquivo ou Banco de Dados)

Interface gráfica (JavaFX ou Swing ou Angular)

Sistema de autenticação

Histórico de transações

Validação avançada de dados

Testes unitários

# Autor

Benjamim Kipopi Mukwalemba
Estudante de Engenharia Informática
Foco em Desenvolvimento Backend e Sistemas