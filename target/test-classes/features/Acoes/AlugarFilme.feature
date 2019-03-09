#language: pt
Funcionalidade: Alugar Filme 

	Cenário: Deve Alugar filme com sucesso
  
    Dado um filme com estoque 2
    E que o preco do aluguel é R$ 3
    Quando alugar
    Entao o valor do alguel será R$ 3
    E a data de entrega será no dia seguinte
    E o estoque será 1