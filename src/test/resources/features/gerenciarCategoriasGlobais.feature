Feature: Criar Categorias Globais


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


  Scenario: Apagar categoria global
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And preencho o nome da categoria global 'Aleatorio'
    And clico em adicionar e Editar Categoria Global
    Then Sistema vai para tela de alteração da Categoria Global


  Scenario: Crio uma nova categoria global
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And preencho o nome da categoria global 'Aleatorio'
    And clico em adicionar Categoria Global


  Scenario: Crio uma  categoria global repetida
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And preencho o nome da categoria global 'Repetido'
    And clico em adicionar Categoria Global
    Then Sistema apresenta mensagem de erro ao criar Categoria devido 'Uma categoria com este nome já existe.'


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


