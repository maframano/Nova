# language: pt
Funcionalidade: Alugar Filme
  Como usu�rio
  Eu quero cadastrar aluguel de filmes
  Para controlar pre�o e data de entregas
  
  Cen�rio: Deve alugar um filme com sucesso
  Dado um filme com estoque de 2 unidades
  E que o pre�o do alugue seja R$ 3
  Quando alugar
  Ent�o o pre�o do alugue ser� R$3
  E a data de entrega ser� no dia seguinte
  E o estoque do filme ser� 1 unidade