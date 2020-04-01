Feature: ConsultaHome
Como cliente		
Eu quero procurar por um produto nas categorias da home page
Para verificar informações sobre um produto especifico

Scenario: Deve encontrar um produto pelas categorias disponiveis
Given que abri o site "https://advantageonlineshopping.com/#/"
When clicar na categoria speakers da pagina home 
And clicar no produto HP ROAR MINI WIRELESS SPEAKER 
Then codigo devera abrir a pagina do produto onde contem suas especificações.

Scenario: Consultar pela tela principal(home) algum produto
Given Eu abri o site "https://advantageonlineshopping.com/#/"
When  Eu procurar pela categoria banana da pagina home 
Then  nenhuma outra pagina devera ser aberta.


