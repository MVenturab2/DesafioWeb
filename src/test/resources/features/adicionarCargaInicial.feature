Feature: Adicionar projeto inicial

  @login
  Scenario: Efetuar login com sucesso inicial alterando primeira senha
    Given informo o usuario 'administrator'
    And clico em entrar
    And informo a senha 'root'
    When clico em entrar
    And preencho a senha antiga 'root' e a nova senha 'vent' se for solicitado
    And informo a senha 'vent'
    When clico em entrar
    Then o usuário deve ser autenticado com sucesso

  Scenario: Crio um projeto inicial
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And Verifico a necessidade de excluir projeto 'Projeto Inicial'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
    | Nome Projeto    | Estado          | Herdar Globais | Visibilidade | Descricao               |
    | Projeto Inicial | desenvolvimento | Sim            | público      | Projeto para dar inicio |
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'
    And acesso o projeto criado
    And preencho o nome da categoria global 'categ inicial' no campo da edição do projeto
    And clico em adicionar e Editar Categoria Global
    Then Sistema vai para tela de alteração da Categoria Global
    When seleciono o usuario 'administrator' na atribuição da Categoria Global
    And Atualizo a Categoria Global
    Then sistema retorna mensagem 'Operação realizada com sucesso.' para excluir conta



  Scenario: Tornar projeto inicial o padrao
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And Verifico a necessidade de excluir projeto 'Projeto secundario'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto       | Estado          | Herdar Globais | Visibilidade | Descricao               |
      | Projeto secundario | desenvolvimento | Sim            | público      | Projeto para dar inicio |
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'
#    When clico em gerenciar 'Usuários'
    And seleciono o usuario 'administrator' na tela de Gerenciar Usuarios
    And Defino Projeto 'Projeto Inicial' como padrao
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'


  Scenario: Crio um projeto extra
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And Verifico a necessidade de excluir projeto 'Projeto extra'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto  | Estado          | Herdar Globais | Visibilidade | Descricao               |
      | Projeto extra | desenvolvimento | Sim            | público      | Projeto para dar inicio |
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'


