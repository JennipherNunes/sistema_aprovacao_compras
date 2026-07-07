# 🛒 Sistema de Aprovação de Compras

Projeto desenvolvido como desafio final do **Bootcamp Santander - Java**, aplicando o padrão de projeto **Chain of Responsibility**.

## 📖 Sobre o projeto

Este sistema simula o processo de aprovação de compras dentro de uma empresa.

Cada solicitação percorre uma cadeia de responsáveis até encontrar quem possui autorização para aprová-la.

## 🎯 Objetivo

Aplicar na prática os conceitos de **Design Patterns** utilizando Java e Programação Orientada a Objetos.

## 🏗️ Padrão utilizado

### Chain of Responsibility

A solicitação percorre uma cadeia de responsáveis:

```text
Compra
   │
   ▼
Atendente
   │
   ▼
Supervisor
   │
   ▼
Gerente
   │
   ▼
Diretoria
```

Cada responsável verifica se pode aprovar a compra. Caso não possa, encaminha para o próximo responsável.

## 📌 Regras de aprovação

| Valor da compra | Responsável |
|-----------------|-------------|
| Até R$ 100,00 | Atendente |
| Até R$ 500,00 | Supervisor |
| Até R$ 1.000,00 | Gerente |
| Acima de R$ 1.000,00 | Diretoria |

## ▶️ Exemplo de saída

```text
Compra aprovada pelo Atendente: Mouse
Compra aprovada pelo Supervisor: Teclado mecânico
Compra aprovada pelo Gerente: Monitor
Compra encaminhada para aprovação da Diretoria: Notebook
```

## 💻 Tecnologias

- Java
- Programação Orientada a Objetos
- Design Patterns
- Eclipse IDE

## 👩‍💻 Desenvolvido por

Jennipher Nunes
