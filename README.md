O Projeto foi inicializado com as seguintes dependências do start.spring.io
Spring Data MongoDB NoSQL
 -Store data in flexible, JSON-like documents, meaning fields can vary from document to document and data structure can be changed over time.
Lombok Developer Tools
 -Java annotation library which helps to reduce boilerplate code.
Spring Web Web
 -Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

 Após o download foi aberto o projeto com InteliJJ

 Nas propriedades contidas no arquivo application.properties foi adicionado o link para o banco do MongoDB

 Em seguida passamos a codar com base no MVC.
 Foi criado o primeiro Medelo de Shows, bem como o reposotory e o controller contendo o mapeamento para acesso a api.

 A aplicação indicou o caminho /mongo com a inserção no caminhao /insert e a listagem no caminho /listar.

 Foi testado usando o Postman criando um post com o seguinte endereço "http://localhost:8080/mongo/insert" e os dados conforme abaixo

      {
         "show_id": 1,
         "location": "Sampa",
         "date": "2026-11-15",
         "available_tickets": 16000
     }
O teste para listar foi utilizado o seguinte endereço "http://localhost:8080/mongo/listar"


 
