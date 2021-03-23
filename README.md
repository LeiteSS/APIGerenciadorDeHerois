# Gerenciador de Super Heróis da Marvel e da DC em uma API Reativa com Spring Boot

Objetivo: Desenvolver uma aplicação para gerenciar herois da **Marvel** e da **DC *Comics***. Fazer uso do ***Project Reactor***, ***Spring WebFlux***, **AWS CLI**, **Amazon DynamoDB**. 

**Ferramentas Usadas:** IntelliJ e Postman, DynamoDB e aws.

---

22 de março de 2021 - 12:11

- Baixar o projeto na [Spring Initializ](https://start.spring.io/). Adicionar as dependências iniciais: **Lombok** e ***Spring Reactive Web***.

-  No arquivo **pom.xml** adicionar as dependências: `springdoc-openapi-webflux-ui`, `dynamodb`, `jUnit` e `spring-data-dynamodb`.

  ```xml
  <dependency>
  			<groupId>org.springdoc</groupId>
  			<artifactId>springdoc-openapi-webflux-ui</artifactId>
  			<version>1.5.5</version>
  		</dependency>
  		<dependency>
  			<groupId>software.amazon.awssdk</groupId>
  			<artifactId>dynamodb</artifactId>
  			<version>2.16.3</version>
  		</dependency>
  		<dependency>
  			<groupId>com.github.derjust</groupId>
  			<artifactId>spring-data-dynamodb</artifactId>
  			<version>5.1.0</version>
  		</dependency>
  		<dependency>
  			<groupId>junit</groupId>
  			<artifactId>junit</artifactId>
  			<version>4.12</version>
  			<scope>test</scope>
  		</dependency>
  ```

- Baixar e instalar o [**AWS CLI** versão 2](https://docs.aws.amazon.com/cli/latest/userguide/cli-chap-install.html).

- Para aqueles que usam linux é uma boa ideia editar o `~/.bashrc` para criar alias para o comando `aws`, pois normalmente, será preciso escrever no terminal todo o caminho (a onde o aws foi instalado) e a "*flag*", por exemplo:`/usr/local/bin/aws --version`. 

  ```bash
  #AWS
  aws() { sudo /usr/local/bin/aws "$@" ;} 
  ```
  
- Baixar o **DynamoDB** (versão local) e deixar o server rodando.
- Seguir o passo-a-passo do [*live coding*](https://www.youtube.com/watch?v=1VllPZYn6RI&t=3257s). 

- Publicar a documentação da [**API**](https://documenter.getpostman.com/view/14979428/TzCFhWDf) usando o **Postman**. 

