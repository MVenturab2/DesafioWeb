Feature: Gerenciar Marcadores

  Scenario: Crio um novo Marcador
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'Marcadores'
    And preencho os detalhes de criar marcador:
    | Nome      | descrição          |
    | Aleatorio | prim marcador auto |
    Then Sistema retorna 'true' para existencia do marcador

  Scenario: Apago um novo Marcador criado
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'Marcadores'
    And preencho os detalhes de criar marcador:
      | Nome      | descrição          |
      | Aleatorio | prim marcador auto |
    Then Sistema retorna 'true' para existencia do marcador
    When acesso o marcador criado
    And apago o marcador
    Then Sistema retorna 'false' para existencia do marcador


  Scenario: atualizar um Marcador
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'Marcadores'
    And preencho os detalhes de criar marcador:
      | Nome      | descrição          |
      | Aleatorio | prim marcador auto |
    Then Sistema retorna 'true' para existencia do marcador
    When acesso o marcador criado
    And atualizo o marcador
    And preencho os detalhes para editar o marcador:
      | Nome | descrição         |
      | edit | descricao editada |
    When clico em 'gerenciar'
    And clico em gerenciar 'Marcadores'
    Then Sistema retorna 'true' para existencia do marcador