# Desafio

## Bases de dados

Para resolver o problema de armazenamento das bases de dados A, B e C, segui a sequinte questão:

### Base A

A *Base A* tendo uma grande sensibilidade e necessitando de muita segurança, optei pelo OracleDB. Utilizando o serviço Amazon RDS, mantenho a segurança com o controle de acesso do IAM(Identity and Access Management), liberando somente o IP(DNS)/security group do(s) micro-serviço(s) que o acessaram;

### Base B

A *Base B* tendo um acesso mais rápido que a Base A, optei pelo DynamoDB. Utilizando o serviço Amazon, mantenho a segurança com o controle de acesso do IAM(Identity and Access Management), liberando somente o IP(DNS)/security group do(s) micro-serviço(s) que o acessaram;


### Base C

A *Base C* necessitando de acesso extremamente rápido e não tendo dados críticos, optei pelo ElasticSearch. Utilizando o Amazon Elasticsearch e com controle de acesso através do IAM(Identity and Access Management), mas com menos restrições comparado com a *Base A* e a *Base B*.

## Diagrama

Para melhor visualização da solução, desenvolvi um diagrama ilustrando melhor, pode ser acessado no link a seguir ou na pasta /img.
link: https://cloudcraft.co/view/856a9a1f-1b8b-45b6-8665-aa27828a9081?key=q_EKgyu1oNgiYLm4Ohfw4g

## API's

Elaborei no swagger o design e model das API's, estão disponíveis na pasta /swagger.