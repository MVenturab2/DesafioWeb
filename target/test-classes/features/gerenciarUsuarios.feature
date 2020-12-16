Feature: Criar novo usuario

  Background: estar logado
    Given que estou logado como administrador no sistema

    Scenario: Crio um novo usuario pelo gerenciar usuarios
    When clico em gerenciar
    And acesso gerenciar Usuários
    And clico em criar nova conta
    And preencho os detalhes da nova conta:
      | Nome do usuario | nome verdadeiro    | email                      | nivel de acesso | habilitado | Protegido |
      | autobot 4       | outro automatizado | matheusventura@outlook.com | gerente         | Sim        | Nao       |
    Then sistema apresenta mensagem de usuario criado 'Usuário autobot 4 criado com um nível de acesso de gerente'
    When apago o usuario criado
  Then sistema retorna mensagem 'Operação realizada com sucesso.' para excluir conta


  Scenario: Crio um novo usuario pelo botao convidar usuario
    When clico em Convidar Usuários
    And preencho os detalhes da nova conta:
    | Nome do usuario | nome verdadeiro      | email                        | nivel de acesso | habilitado | Protegido |
    | autobot 5       | usuario automatizado | matheus.ventura@base2.com.br | gerente         | Sim        | Nao       |
    Then sistema apresenta mensagem de usuario criado 'Usuário autobot 5 criado com um nível de acesso de gerente'
    When apago o usuario criado
    Then sistema retorna mensagem 'Operação realizada com sucesso.' para excluir conta

