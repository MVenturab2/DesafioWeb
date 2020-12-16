Feature: Carga inicial

  @login @cargaInicial
  Scenario: Efetuar login com sucesso inicial alterando primeira senha
    Given informo o usuario 'administrator' na tela de login
    When clico em entrar
    And informo a senha 'root'
    And clico em entrar
    And preencho a senha antiga 'root' e a nova senha 'vent' se for solicitado
    And informo o usuario novamente caso tenha mudado a senha 'administrator'
    And informo a senha 'vent'
    And clico em entrar
    Then o usuário deve ser autenticado com sucesso

    @projeto @cargaInicial
  Scenario: Crio um projeto inicial
    Given que estou logado como administrador no sistema
    When clico em gerenciar
    And acesso gerenciar projetos
    And verifico a necessidade de excluir projeto 'Projeto Inicial'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
    | Nome Projeto    | Estado          | Herdar Globais | Visibilidade | Descricao               |
    | Projeto Inicial | desenvolvimento | Sim            | público      | Projeto para dar inicio |
    Then sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'
    And acesso o projeto criado
    And preencho o nome da categoria global 'categ inicial' no campo da edição do projeto
    And clico em adicionar e Editar Categoria Global
    Then sistema vai para tela de alteração da Categoria Global
    When seleciono o usuario 'administrator' na atribuição da Categoria Global
    And atualizo a Categoria Global
    Then sistema retorna mensagem 'Operação realizada com sucesso.' para excluir conta

  @projeto @cargaInicial
  Scenario: Tornar projeto inicial o padrao
    Given que estou logado como administrador no sistema
    When clico em gerenciar
    And acesso gerenciar projetos
    And verifico a necessidade de excluir projeto 'Projeto secundario'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto       | Estado          | Herdar Globais | Visibilidade | Descricao               |
      | Projeto secundario | desenvolvimento | Sim            | público      | Projeto para dar inicio |
    Then sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'
    And seleciono o usuario 'administrator' na tela de Gerenciar Usuarios
    And defino Projeto 'Projeto Inicial' como padrao
    Then sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'

  @projeto @cargaInicial
  Scenario: Crio um projeto extra
    Given que estou logado como administrador no sistema
    When clico em gerenciar
    And acesso gerenciar projetos
    And verifico a necessidade de excluir projeto 'Projeto extra'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto  | Estado          | Herdar Globais | Visibilidade | Descricao               |
      | Projeto extra | desenvolvimento | Sim            | público      | Projeto para dar inicio |
    Then sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'


