Feature: Gerenciar Perfis Globais

  Scenario: Crio um novo Perfil Global
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'Perfís Globais'
    And preencho os detalhes de criar Perfil Global:
    | Plataforma | SO        | Versão SO | Descrição Adicional    |
    | Aleatorio  | Aleatorio | Aleatorio | teste de perfil global |
    Then Sistema retorna a situação do perfil como 'true'

  Scenario: Apagar Perfil Global
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'Perfís Globais'
    And preencho os detalhes de criar Perfil Global:
      | Plataforma | SO        | Versão SO | Descrição Adicional    |
      | Aleatorio  | Aleatorio | Aleatorio | teste de perfil global |
    Then Sistema retorna a situação do perfil como 'true'
    When seleciono perfil global
    And envio comando para apagar o perfil
    Then Sistema retorna a situação do perfil como 'false'