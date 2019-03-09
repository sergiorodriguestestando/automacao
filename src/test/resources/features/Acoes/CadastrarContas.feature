#language: pt
Funcionalidade: Cadastro de contas 

	Como um usuário 
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada






Cenário: Deve inserir uma conta com sucesso
Dado que estou acessando a aplicação
Quando informo o usuário "carolina.livna@gmail.com"
E a senha "123456"
E seleciono entrar
Então visualizo a página inicial
Quando seleciono Contas
E seleciono Adicionar
E informo a conta "Conta de Teste"
E seleciono Salvar
Então a conta é inserida com sucesso


Cenário: Não deve inserir uma conta com nome já existente 
Quando seleciono Contas
E seleciono Adicionar
E informo a conta "Conta de Teste"
E seleciono Salvar
Então sou notificado que já existe uma conta com esse nome


Cenário: Não deve inserir uma conta sem nome
Quando seleciono Contas
E seleciono Adicionar
E seleciono Salvar
Então sou notificar que o nome da conta é obrigatório


Cenário: Excluir uma conta 
Quando seleciono Contas
E seleciono Listar
E seleciono deleto uma conta
Então sou notificado que a conta foi excluida com sucesso

