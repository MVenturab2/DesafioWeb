Feature: Criar Categorias Globais


  Scenario: Crio uma nova categoria global
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And preencho o nome da categoria global 'Aleatorio'
    And clico em adicionar Categoria Global
    Then O sistema retorna a tela de gerenciar 'Projetos'


  Scenario: Crio e edito uma nova categoria global em um projeto em edição
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto | Estado          | Herdar Globais | Visibilidade | Descricao                                  |
      | Aleatorio    | desenvolvimento | Sim            | público      | Projeto preenchido pelo teste de automação |
    And acesso o projeto criado
    And preencho o nome da categoria global 'Aleatorio' no campo da edição do projeto
    And clico em adicionar e Editar Categoria Global
    Then Sistema vai para tela de alteração da Categoria Global
    When seleciono o usuario 'administrator' na atribuição da Categoria Global
    And Atualizo a Categoria Global
    Then sistema retorna mensagem 'Operação realizada com sucesso.' para excluir conta


  Scenario: crio categoria global pelo botao adicionar e editar
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And preencho o nome da categoria global 'Aleatorio'
    And clico em adicionar e Editar Categoria Global
    Then Sistema vai para tela de alteração da Categoria Global


  Scenario: Apagar categoria global
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And preencho o nome da categoria global 'Aleatorio'
    And clico em adicionar e Editar Categoria Global
    Then Sistema vai para tela de alteração da Categoria Global
    When Apago a categoria global criada
    Then sistema retorna mensagem 'Operação realizada com sucesso.' para excluir conta

  Scenario: Atribuir usuario a categoria global
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And preencho o nome da categoria global 'Aleatorio'
    And clico em adicionar e Editar Categoria Global
    Then Sistema vai para tela de alteração da Categoria Global
    When seleciono o usuario 'administrator' na atribuição da Categoria Global
    And Atualizo a Categoria Global
    Then sistema retorna mensagem 'Operação realizada com sucesso.' para excluir conta


