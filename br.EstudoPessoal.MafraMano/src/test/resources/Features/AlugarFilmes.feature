# language: pt
Funcionalidade: Alugar Filme
  Como usuário
  Eu quero cadastrar aluguel de filmes
  Para controlar preço e data de entregas
  
  Cenário: Deve alugar um filme com sucesso
  Dado um filme com estoque de 2 unidades
  E que o preço do alugue seja R$ 3
  Quando alugar
  Então o preço do alugue será R$3
  E a data de entrega será no dia seguinte
  E o estoque do filme será 1 unidade