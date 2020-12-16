Feature: Gerenciar Perfis Globais

  Background: acessar gerenciamento de projetos
    Given que estou logado como administrador no sistema
    When clico em gerenciar
    And acesso gerenciar Perfís Globais

  Scenario: Crio um novo Perfil Global
    And preencho os detalhes de criar Perfil Global:
    | Plataforma | SO        | Versão SO | Descrição Adicional    |
    | Aleatorio  | Aleatorio | Aleatorio | teste de perfil global |
    Then sistema retorna a situação do perfil como 'true'

  Scenario: Apagar Perfil Global
    And preencho os detalhes de criar Perfil Global:
      | Plataforma | SO        | Versão SO | Descrição Adicional    |
      | Aleatorio  | Aleatorio | Aleatorio | teste de perfil global |
    Then sistema retorna a situação do perfil como 'true'
    When seleciono perfil global
    And envio comando para apagar o perfil
    Then sistema retorna a situação do perfil como 'false'