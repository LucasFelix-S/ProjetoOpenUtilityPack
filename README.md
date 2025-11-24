# OpenUtilityPack

Um pacote de utilidades em Java criado para acelerar o desenvolvimento, padronizar tarefas repetitivas e deixar o dia a dia mais suave. Pense nele como um cinto de utilidades do Batman.

O projeto em si nasceu para concentrar ferramentas comuns utilizadas em projetos Java: leitura de arquivos de configuração, conexão com SQL Server e manipulação de arquivos texto. É um toolkit que cresce conforme o aprendizado evolui.

## Estrutura do Projeto
```
src/
└── br.com.lucas.openutilitypack
    ├── app
    │   └── App
    ├── database
    │   ├── config
    │   │   ├── LerArquivoConfiguracaoBd
    │   │   └── PojoArquivoConfiguracaoBd
    │   └── connection
    │       └── ConectaSqlServer
    └── file
        ├── EscreverArquivoDeTexto
        └── LerArquivoDeTexto
```

## Funcionalidades Atuais
### - Configuração (JSON)
- Leitura de arquivo JSON com URL, usuário e senha do SQL Server.
- Conversão para POJO para facilitar manipulação.

### - Conexão com SQL Server
- Classe que recebe o POJO e cria a conexão via JDBC.

### - Manipulação de Arquivos
- Leitura de arquivos de texto (TXT, CSV etc.).
- Escrita de arquivos texto para logs e exportações.

## Futuras Expansões
- Classe para SELECT (DQL).
- Classe para INSERT/UPDATE/DELETE (DML).

## Contribuição
O projeto evolui junto com os meus estudos. Sugestões e melhorias são bem-vindas. E o projeto é livre para o uso e modificação