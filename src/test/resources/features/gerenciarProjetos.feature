Feature: Criar novo projeto


  Scenario: Crio um novo projeto
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
    | Nome Projeto | Estado          | Herdar Globais | Visibilidade | Descricao                                  |
    | Aleatorio    | desenvolvimento | Sim            | público      | Projeto preenchido pelo teste de automação |
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'


    @Apagar
  Scenario: apago um novo projeto criado
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And Verifico a necessidade de excluir projeto 'projeto para apagar'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto        | Estado          | Herdar Globais | Visibilidade | Descricao                                  |
      | projeto para apagar | desenvolvimento | Sim            | público      | Projeto preenchido pelo teste de automação |
    And acesso o projeto criado
    And apago o projeto
    Then A situação do projeto se encontra 'false' na tela de gerenciar projetos


  @SbuProjeto
  Scenario: crio um  novo subprojeto para um projeto criado
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And Verifico a necessidade de excluir projeto 'projetoto master'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto     | Estado          | Herdar Globais | Visibilidade | Descricao                                  |
      | projetoto master | desenvolvimento | Sim            | público      | Projeto preenchido pelo teste de automação |
    And acesso o projeto criado
    And crio novo subProjeto
    And preencho os detalhes do projeto:
      | Nome Projeto | Estado          | Herdar Globais | Visibilidade | Descricao                                  |
      | subprojeto   | desenvolvimento | Sim            | público      | Projeto preenchido pelo teste de automação |


  @SbuProjeto
  Scenario: editar um projeto criado
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And Verifico a necessidade de excluir projeto 'projetoto master'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto | Estado          | Herdar Globais | Visibilidade | Descricao                                  |
      | Aleatorio    | desenvolvimento | Sim            | público      | Projeto preenchido pelo teste de automação |
    And acesso o projeto criado
    And preencho os detalhes do projeto editado:
      | Nome Projeto | Estado          | Herdar Globais | Visibilidade | Descricao |
      | -edit         | desenvolvimento | Sim            | público      | e editado |
    And Atualizo o Projeto
    Then A situação do projeto se encontra 'true' na tela de gerenciar projetos


  @SbuProjeto
  Scenario: adiciono um novo subprojeto
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And Verifico a necessidade de excluir projeto 'projetoto master'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto | Estado          | Herdar Globais | Visibilidade | Descricao                                  |
      | Aleatorio    | desenvolvimento | Sim            | público      | Projeto preenchido pelo teste de automação |
    And acesso o projeto criado
    And adiciono subprojeto ja existente
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'



  @SubProjeto
  Scenario: desvincular um subprojeto
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And Verifico a necessidade de excluir projeto 'projetoto master'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto | Estado          | Herdar Globais | Visibilidade | Descricao                                  |
      | Aleatorio    | desenvolvimento | Sim            | público      | Projeto preenchido pelo teste de automação |
    And acesso o projeto criado
    And adiciono subprojeto ja existente
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'
    When desvinculo subprojeto
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'

  @SubProjeto
  Scenario: apagar projeto que possua um subprojeto
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto | Estado          | Herdar Globais | Visibilidade | Descricao                                  |
      | Aleatorio    | desenvolvimento | Sim            | público      | Projeto preenchido pelo teste de automação |
    And acesso o projeto criado
    And adiciono subprojeto ja existente
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'
    And apago o projeto
    Then A situação do projeto se encontra 'false' na tela de gerenciar projetos
    When verifico o subprojeto
    Then A situação do projeto se encontra 'true' na tela de gerenciar projetos

  @versao
  Scenario: adiciono versao ao projeto
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto | Estado          | Herdar Globais | Visibilidade | Descricao                                  |
      | Aleatorio    | desenvolvimento | Sim            | público      | Projeto preenchido pelo teste de automação |
    And acesso o projeto criado
    And preencho com 'Aleatorio' a versão do projeto
    And adiciono versao ao projeto
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'


  @versao
  Scenario: adiciono e altero a versao do projeto
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto | Estado          | Herdar Globais | Visibilidade | Descricao                                  |
      | Aleatorio    | desenvolvimento | Sim            | público      | Projeto preenchido pelo teste de automação |
    And acesso o projeto criado
    And preencho com 'Aleatorio' a versão do projeto
    And adiciono e altero a versao do projeto
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'
    And preencho os detalhes da versao:
      | versao | Ordem por Data | Descricao          | Liberada | Obsoleto |
      |        |                | detalhes da versao | Sim      | sim      |
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'


  @versao
  Scenario: apago versao do projeto
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'projetos'
    And clico em criar novo projeto
    And preencho os detalhes do projeto:
      | Nome Projeto | Estado          | Herdar Globais | Visibilidade | Descricao                                  |
      | Aleatorio    | desenvolvimento | Sim            | público      | Projeto preenchido pelo teste de automação |
    And acesso o projeto criado
    And preencho com 'Aleatorio' a versão do projeto
    And adiciono e altero a versao do projeto
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'
    When apago a versao ao editar
    Then Sistema retorna mensagem de projeto criado com 'Operação realizada com sucesso.'