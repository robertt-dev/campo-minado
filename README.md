# 🎮 Campo Minado (Console)

Esse é um projetinho de **Campo Minado em Java**, feito no console.  
Foi desenvolvido a partir do curso de **Java do Leonardo Leitão (Cod3r)**, como prática de **POO, exceções e coleções**.

## 📌 Como funciona
- O jogo roda no **console**.
- Você informa as coordenadas (linha, coluna).
- Depois escolhe se quer:
  - `1` ➝ Abrir o campo.
  - `2` ➝ (Des)Marcar o campo como suspeita de mina.
- Se abrir uma mina 💣 → perde o jogo.
- Se abrir todos os campos seguros ✅ → ganha o jogo.
- Pode digitar `sair` a qualquer momento para encerrar.

## 🗂 Estrutura do projeto
- `Aplicacao` → Classe principal que inicia o jogo.
- `Visao.TabuleiroConsole` → Interface de texto (console) para jogar.
- `Modelo.Tabuleiro` → Representa o tabuleiro e gerencia os campos.
- `Modelo.Campo` → Representa cada casa do jogo (pode ter mina, estar aberta, marcada etc).
- `Excecao.*` → Exceções personalizadas (`ExplosaoException`, `SairException`).

## ▶️ Como rodar
1. Clone este repositório:
   ```bash
   [git clone https://github.com/robertt-dev/campo-minado.git]

## ✨ Tecnologias utilizadas
1. Java 17+ (mas roda em versões anteriores também)
2. Programação Orientada a Objetos
3. Streams e Lambda Expressions

## 🙌 Créditos
Projeto baseado no curso Java Completo do Leonardo Leitão - Cod3r.
