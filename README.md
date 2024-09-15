<!DOCTYPE html>
<html lang="pt-BR">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>README - Sistema de Logs</title>
</head>
<body>

  <h1>Sistema de Logs - Trabalho Final</h1>

  <p>Este projeto implementa um sistema de logging em Java, com suporte para diferentes formatos de saída, como CSV e JSON. Utilizando padrões de projeto como Adapter e DAO, o sistema proporciona flexibilidade no registro de eventos e auditorias.</p>

  <h2>Estrutura do Projeto</h2>
  <pre><code>src/main/java
│
├── dao/                 # Camada de Acesso a Dados
│   ├── LogDAO.java
│   └── LogDAOSqlite.java
│
├── log/                 # Implementações de logs e adaptação de formatos
│   ├── CsvAdapter.java
│   ├── CsvLog.java
│   ├── JsonAdapter.java
│   ├── JsonLog.java
│   └── Log.java
│
└── service/             # Serviço de gerenciamento de logs
    └── LogService.java
  </code></pre>

  <h2>Padrões de Projeto Utilizados</h2>
  <ul>
    <li><strong>DAO (Data Access Object)</strong>: Abstrai o acesso aos dados de logs, facilitando a persistência.</li>
    <li><strong>Adapter</strong>: Implementado para adaptar a saída de logs nos formatos CSV e JSON.</li>
  </ul>

  <h2>Funcionalidades</h2>
  <ul>
    <li>Suporte a logs em formato CSV e JSON.</li>
    <li>Persistência de dados em banco de dados SQLite.</li>
  </ul>

  <h2>Como Executar</h2>
  <ol>
    <li>Importe o projeto em sua IDE Java.</li>
    <li>Configure as dependências necessárias, como JDBC e drivers para SQLite.</li>
    <li>Execute a aplicação para gerar e persistir logs.</li>
  </ol>

  <h2>Tecnologias Utilizadas</h2>
  <ul>
    <li><strong>Java 8+</strong></li>
    <li><strong>SQLite</strong> para persistência de dados</li>
    <li><strong>JDBC</strong> para integração com o banco de dados</li>
  </ul>

  <h2>Licença</h2>
  <p>Este projeto foi desenvolvido para fins acadêmicos e não possui uma licença específica.</p>

</body>
</html>
