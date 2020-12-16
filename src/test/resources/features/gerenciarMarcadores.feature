Feature: Gerenciar Marcadores

  Background: acessar gerenciamento de marcadores
    Given que estou logado como administrador no sistema
    When clico em gerenciar
    And acesso gerenciar Marcadores


  Scenario: Crio um novo Marcador
    And preencho os detalhes de criar marcador:
    | Nome      | descrição          |
    | Aleatorio | prim marcador auto |
    Then sistema retorna 'true' para existencia do marcador

  Scenario: Apago um novo Marcador criado
    And preencho os detalhes de criar marcador:
      | Nome      | descrição          |
      | Aleatorio | prim marcador auto |
    Then sistema retorna 'true' para existencia do marcador
    When acesso o marcador criado
    And apago o marcador
    Then sistema retorna 'false' para existencia do marcador

  Scenario: atualizar um Marcador
    And preencho os detalhes de criar marcador:
      | Nome      | descrição          |
      | Aleatorio | prim marcador auto |
    Then sistema retorna 'true' para existencia do marcador
    When acesso o marcador criado
    And atualizo o marcador
    And preencho os detalhes para editar o marcador:
      | Nome | descrição         |
      | edit | descricao editada |
    When clico em gerenciar
    And acesso gerenciar Marcadores
    Then sistema retorna 'true' para existencia do marcador