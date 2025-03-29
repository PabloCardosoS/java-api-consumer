# Projeto Java: Consumindo APIs Externas e Manipulando Arquivos

## Visão Geral

Este projeto foi desenvolvido durante o curso **Java: Consumindo APIs, Gravando Arquivos e Lidando com Erros**, da **Alura**. Durante o curso, apliquei e reforcei conceitos fundamentais de **programação orientada a objetos** (OOP), como **herança**, **polimorfismo** e outras técnicas essenciais para o desenvolvimento de software utilizando **Java**.

O curso foi dividido em duas partes principais: um projeto orientado pelo instrutor, onde integramos a **API OMDb** (para filmes), e o **desafio final**, no qual trabalhamos com a **API ViaCEP** (para consulta de endereço com base no CEP).

## O que Aprendi

### 1. **Consumo de APIs (java.net.http)**
   - Trabalhei com o pacote **java.net.http** para realizar requisições HTTP e processar respostas.
   - Integrei duas APIs externas:
     - **API OMDb**: Uma API pública para recuperar informações sobre filmes com base no título ou outros critérios de pesquisa.
     - **API ViaCEP**: Uma API brasileira que retorna detalhes de endereço (como rua, bairro, cidade e estado) com base no código postal (CEP).

### 2. **Trabalhando com JSON (Biblioteca Gson)**
   - Utilizei a biblioteca **Gson** para **serializar** (converter objetos Java em JSON) e **desserializar** (converter JSON de volta para objetos Java) as respostas das APIs.
   - Isso permitiu manipular os dados de forma mais simples e trabalhar com dados estruturados das APIs.

### 3. **Tratamento de Exceções**
   - Aprofundei meu entendimento sobre **tratamento de exceções** em Java utilizando blocos **try-catch** e a declaração **finally** para tratar erros e garantir a execução contínua da aplicação.
   - Isso garante que a aplicação seja resiliente a falhas, como problemas de rede ou entrada inválida do usuário.

### 4. **Manipulação de Arquivos (java.io)**
   - Aprendi a trabalhar com o sistema de arquivos em Java utilizando classes do pacote **java.io**.
   - Implementei a escrita e leitura de arquivos utilizando as classes **FileWriter** e **FileReader**.
   - O projeto armazena os dados obtidos das APIs em arquivos JSON, facilitando o armazenamento e gerenciamento dessas informações.

---

