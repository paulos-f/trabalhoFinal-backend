## Repositório destinado a desenvolvimento do projeto final da disciplina de Backend.
__________________________________________________
### Participantes
[Paulo de Souza Fontanela](https://github.com/paulos-f)

[Kaique Demetrio](https://github.com/kaiquedm12)

[Lucas Cardoso Rodrigues](https://github.com/JogadorZero)

### Instruções do projeto
__________________________________________________

# Avaliação N3 - Projeto Final

## Resumo

A avaliação `N3` consiste no design e implementação de uma API RESTful para processamento de requisições de um cliente HTTP.

A aplicação deverá processar operações de **leitura**, **criação**, **atualização** e **exclusão** de dados para pelo menos **três recursos diferentes**, persistindo os dados em uma base de dados.

O projeto deverá ser desenvolvido em grupo de até 3 pessoas e compartilhado em um repositório público no GitHub ou Gitlab. A apresentação do projeto será realizada em sala de aula.

## Objetivos

* Avaliar a capacidade de desenvolvimento e implantação de uma aplicação de backend;
* Desenvolver a capacidade de autonomia por meio da construção de um projeto com diferentes etapas do processo de desenvolvimento de software;
* Oferecer uma auto-avaliação individual prática para o estudante;
* Avaliar a capacidade de trabalho em grupo e habilidades de comunicação de projetos técnicos;

## Temas

Cada grupo escolhe e desenvolve um projeto dentro do escopo do tema escolhido. Os exemplos de aplicações são apenas ilustrativos.

* `Mudanças Climáticas`: aplicações para visualização de dados ambientais, calculadora de emissões de carbono, monitoramento com sensores;
* `Saúde e Bem-estar`: Gerenciamento de medicamentos, mapeamento de atendimentos médicos, recomendações médicas;
* `Acesso à Educação`: *Math-system* para tutoria, repositórios educacionais, compartilhamento de dados públicos;
* `Agricultura e Segurança Alimentar`: Marktplace para agricultura familiar, monitoramento de plantações, mapeamento de desperdício alimentar;
* `Engajamento Comunitário`: *Match-system* para voluntários, gerenciamento de donativos, mapeamento de abrigos;
* `Indústria e Automação`: fluxos de produção, gerenciamento de máquinas, consumo e demanas, custos de produção.

Quaisquer projetos que tenham relação com os temas acima serão considerados válidos. Para projetos que tenham dificuldade em se encaixar em um dos temas, mas que promovam inovação e criatividade, deverão ser discutidos com o professor em sala de aula ou por e-mail, justificando a escolha.

## Requisitos Obrigatórios

Os requisitos obrigatórios são aqueles que devem ser implementados para que a avaliação seja considerada:

* A aplicação implementa um serviço para processamento de requisições de um cliente HTTP;
* O projeto foi apresentado por todos os integrantes do grupo em sala de aula;
* O código-fonte do projeto está disponível em um repositório público no GitHub ou Gitlab
* O projeto foi desenvolvido inteiramente pelos integrantes do grupo;

Sem estes requisitos, a avaliação será automaticamente reprovada.

## Requisitos Básicos

Os requisitos básicos são aqueles que devem ser implementados integralmente para que a nota máxima seja atribuída:

* **CRUD**: A aplicação implementa rotas para pelo menos três recursos distintos e relacionados entre si, cada um contendo operações de leitura, escrita, atualização e exclusão;
* **Arquitetura de Camadas**: A arquitetura da aplicação é baseada em camadas, possuindo clara distinção e preservando as responsabilidades entre *controllers*, *services*, *repositories* e *models*/*entities*;
* **Repository Pattern**: A aplicação utiliza o padrão [Repository](https://martinfowler.com/eaaCatalog/repository.html) para abstrair o acesso e operações no banco de dados de maneira persistente;
* **DTO**: Todos os dados enviados no corpo de requisições devem ser validados conforme as regras de negócio, usando um DTO (Data Transfer Object) separado do modelo de domínio;
* **Status Code e JSON**: Todas as respostas e erros esperados possuem um código de status HTTP apropriado e um corpo de resposta formatado em JSON;
* **Tratamento de Erros**: Todas as rotas da aplicação retornam erros de maneira clara e amigável, com o código de status HTTP apropriado e um objeto de erro formatado em JSON;
* **Documentação**: O projeto possui um arquivo `README.md` com instruções claras para a execução do projeto, incluindo exemplos de requisições, respostas e erros esperados para todas as rotas da aplicação (pode ser utilizado o [Swagger](https://swagger.io/), desde que esteja especificado seu uso no `README.md`);
* **Variáveis de Ambiente**: Todas as variáveis necessárias para a execução do projeto podem ser configuradas por meio de variáveis de ambiente e/ou arquivos de configuração (**.env**, **.json**, **.yaml**, etc.);
* **Efetividade**: O projeto propõe uma solução viável e efetiva, apresentando regras de negócio condizentes com o tema proposto;

Cada um dos requisitos básicos serão avaliados individualmente e terão uma pontuação máxima de 1,0 ponto, com exceção da **Efetividade**, que terá uma pontuação máxima de 2,0 pontos.

## Requisitos Opcionais

Os requisitos opcionais são aqueles que podem ser implementados para melhorar a qualidade do projeto e a nota da avaliação, especialmente se os requisitos básicos não puderem ser desenvolvidos. Estes requisitos não são obrigatórios para a aprovação.

* **Autenticação**: A maioria das rotas da aplicação é protegida por um mecanismo de autenticação como **JWT** ou **OAuth2**, exigindo um token de acesso válido;
* A aplicação foi implantada em um servidor de produção e está disponível em um servidor de público na Internet;
* **Testes Unitários**: Os métodos implementados na camada de serviço possuem cobertura de pelo menos 80% em testes unitários dos métodos públicos na camada de serviço da aplicação;
* **Integração Externa**: A aplicação está integrado a uma API de terceiros, sendo capaz de reconhecer exceções (quando a API não estiver disponível);
* **CICD**: O projeto possui CICD configurado para a execução de testes, compilação e geração da imagem Docker;
* **Docker**: O projeto pode ser executado de maneira simples usando o comando `docker compose up --build`, incluindo as variáveis de ambiente e todos os demais serviços necessários para a execução do projeto;
* **Implantação Pública**: O projeto foi públicado na Internet e está disponível para acesso com endereço público (pode-se utilizar provedores de núvem como o [Render](render.com)).

## Organização do Repositório

O código-fonte do projeto deve estar organizado da seguinte forma:

* `src`: pasta com o código-fonte da aplicação;
* `Dockerfile`: arquivo de configuração da imagem Docker;
* `docker-compose.yml`: arquivo de configuração do Docker Compose;
* `README.md`: arquivo de instruções de execução do projeto;
* `AUTHORS.md`: arquivo com os nomes completos dos autores do projeto, um por linha;

## Nota Final

O projeto final sera avaliado com a nota de `0,0` a `10,0`, de acordo com os critérios anteriores. Todos os critérios possuem o mesmo peso.

## Entrega

Um dos integrantes da equipe deverá realizar a postagem do endereço online do repositório git no ambiente acadêmico até a data informada pelo professor em sala de aula. O repositório deve estar acessível ao professor.

A postagem deverá ser realizada até as seguintes datas:

| Turma 01 (2ª feira) | Turma 02 (3ª feira) | Turma 03 (4ª feira)| Turma 04 (5ª feira) |
| :---: | :---: | :---: | :---: |
| 25/11 | 26/11 | 27/11 | 28/11 |

Modificações poderão ser realizadas até a data de apresentação do projeto, mas não serão aceitas alterações após a data de apresentação.

## Apresentação

O projeto deverá ser apresentado por **todos os componentes do grupo**, que deverão demonstrar o funcionamento da aplicação e conhecimento da implementação. A apresentação deverá ter até **20 minutos** e deverá levar em consideração as três etapas:

* `Apresentação do Domínio` (*5 min*): apresentação das entidades e dos casos de uso utilizados no projeto. Deve-se deixar claro em quais casos o projeto será útil;

* `Funcionamento da Aplicação` (*10 min*): demonstração do projeto em funcionamento, desde a execução. Deve-se demonstrar pelo menos um tipo de requisição para cada um dos recursos (revisar e preparar requisições com antecedência);

* `Arquitetura` (*5 min*): Deverá ser demonstrada a arquitetura da aplicação, explicando as divisões de responsabilidade no código e o modelo de persistência de dados utilizado (mostrar diretamente no código os requisitos implementados).

De um modo geral, a apresentação deve dar conta de apresentar o desenvolvimento de todos os requisitos implementados pelo grupo (Obrigatórios, Básicos e Opcionais).

### Datas de Apresentação

Cada grupo deverá apresentar o projeto nas datas informadas abaixo de acordo com a sua turma. Equipes que finalizarem a apresentação com antecedência estarão liberadas dos demais encontros.

| Turma 01 (2ª feira) | Turma 02 (3ª feira) | Turma 03 (4ª feira)| Turma 04 (5ª feira) |
| :---: | :---: | :---: | :---: |
| 25/11 e 02/12 | 26/11 e 03/12 | 27/11 | 05/12 |

## Considerações Finais

* Projetos que não atendam aos requisitos obrigatórios não serão avaliados.
* Projetos fora dos critérios relacionados pelo professor em sala de aula serão **descontados** ou **invalidados** automaticamente, incluindo:
  * Projetos postados fora do prazo;
  * Projetos sem relação com o enunciado da atividade;
  * Projetos que não podem ser executados pela falta de dependências e/ou configuração;
* A **cópia comprovada** do projeto resulta em nota zero para o grupo, o que inclui:
  * Projetos com arquivos completos copiados de outros projetos (online ou de colegas);
  * Projetos não realizados pelos integrantes do grupo;
  * Projetos com código-fonte gerado exclusivamente por inteligência artificial.
* Estudantes que não realizarem a apresentação do projeto junto ao grupo não receberão a nota pelo projeto;
