# language: pt
Funcionalidade: Alugar Filme
  Como usuario
  Eu quero cadastrar aluguel de filmes
  Para controlar preco e data de entregas
  
  Cenário: Deve alugar um filme com sucesso
  Dado um filme com estoque de 2 unidades
  E que o preco do alugue seja R$ 3
  Quando alugar
  Então o preço do alugue será R$3
  E a data de entrega será no dia seguinte
  E o estoque do filme sera 1 unidade