# Heroes Manager 

[![License: FDL 1.3](https://img.shields.io/badge/License-FDL%20v1.3-blue.svg)](https://www.gnu.org/licenses/fdl-1.3)

A bunch of nerds want to manager posts about heroes. It must to possible to create, update, delete and view all heroes registered, but for the user must just be possible to view all heroes i.e posts about heroes. The user cannot create, update, delete the heroes. 

## Features

- Create a hero.
- Get all heroes created.

### To - Do

- [ ] Delete hero using  its Id.
- [ ] Find a hero using its id.
- [ ] Update a hero.

## Usage

Firstly, clone this repository: 

```bash
git clone https://github.com/LeiteSS/APIGerenciadorDeHerois.git
```

With everything cloned, navigate to the folder with projects `cd APIGerenciadorDeHerois`. Inside, you can run the **API** using the command `./mvnw spring-boot:run`. After the installation of the dependencies and build, the application must start in `http://localhost:8080`. If you have **Postman** use the [api's collection](https://documenter.getpostman.com/view/14979428/TzCFhWDf).  Howeverm navigate to the **front-end** using `cd heroes-app` and run `ng serve` for a dev server. In the browser, navigate to `http://localhost:4200` and the front-end it is ready to communicate with the back-end.

But, before to start the **API**, up and build the mongo database using the command: `make up-db-local`. Inside the folder `docker/mongo_seed` there are a file called `init.js`. There are in this file some heroes, feel free to change, if want to `make all`, first, cut and paste the **front-end** folder in `src/main`. The **Makefile** up-build the database, and containerize the **API** plus the **front-end** in the port 8080, without this the **API** and the **front-end** will be initialize in different ports.

***The commands are for operational systems using Linux, but in Windows the commands for Maven are the same*

### Attribution

This projects uses [**Docker**](https://docs.docker.com/), [**Makefile**](https://www.gnu.org/software/make/manual/make.html), [**Maven**](https://maven.apache.org/what-is-maven.html), [**Lombok**](https://projectlombok.org/), **Spring WebFlux**, **Spring MongoDb Reactive**, [**springdoc-openapi v1.5.8**](https://springdoc.org/), [**Node Js**](https://nodejs.org/en/docs/), **Angular** e [**Angular Material**](https://material.angular.io/) and [**Tailwind CSS**](https://tailwindcss.com/).

## Credits

SANTOS, Kamilah. "[**Demo sobre live coding da digital innovation one - spring webflux - criando seu gerenciador de herois**](https://github.com/Kamilahsantos/Heroes-SpringWebflux-API)". **Digital Innovation One**, 2020.

SANTOS, Kamilah. "[**Live Coding - Crie seu gerenciador de salas de reuniões com Java e Angular**](https://github.com/Kamilahsantos/Client-Angular-Live-Coding-Dio)". **Digital Innovation One**, 2020.

TACKE, Adrienne. "[**Using MongoDB Atlas on Heroku**](https://developer.mongodb.com/how-to/use-atlas-on-heroku/)". **:seedling: mongoDB**, 2020.

KHAN, Zoaib. "[**Create a responsive card grid with TailwindCSS and Angular**](https://zoaibkhan.com/blog/create-a-responsive-card-grid-with-tailwindcss-and-angular/)". **Zoaib Khan**, 2021.

JONES, Tim. "[**Reactive Programming With the J.A.M. Stack (Java-Angular-Mongo)**](https://medium.com/cloud-native-the-gathering/reactive-programming-with-the-j-a-m-stack-java-angular-mongo-4a392d57a61b)". **Medium**, 2019

MAGALHÃES, Eder. "[**Programação Reativa com Spring Boot, WebFlux e MongoDB: chega de sofrer!**](https://medium.com/nstech/programa%C3%A7%C3%A3o-reativa-com-spring-boot-webflux-e-mongodb-chega-de-sofrer-f92fb64517c3)". **Medium**, 2018.

## License

Copyright (C)  2021  Silas Leite. Permission is granted to copy, distribute and/or modify this document  under the terms of the GNU Free Documentation License, Version 1.3 or  any later version published by the Free Software Foundation; with no  Invariant Sections, no Front-Cover Texts, and no Back-Cover Texts. A  copy of the license is included in the section entitled "GNU Free  Documentation License".