Feature: Criar novo usuario



  Scenario: Crio um usuario repetido pelo gerenciar usuarios
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'Usuários'
    And clico em criar nova conta
    And preencho os detalhes da nova conta:
      | Nome do usuario | nome verdadeiro    | email                            | nivel de acesso | habilitado | Protegido |
      | autobot 2       | outro automatizado | matheus.ventura@prestador.com.br | gerente         | Sim        | Nao       |
    Then Sistema apresenta mensagem de usuario criado com erro devido 'Este nome de usuário já está sendo usado. Por favor, volte e selecione um outro.'


  Scenario: Crio um usuario com email repetido pelo gerenciar usuarios
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'Usuários'
    And clico em criar nova conta
    And preencho os detalhes da nova conta:
      | Nome do usuario | nome verdadeiro    | email                            | nivel de acesso | habilitado | Protegido |
      | autobot 3       | outro automatizado | matheus.ventura@prestador.com.br | gerente         | Sim        | Nao       |
    Then Sistema apresenta mensagem de usuario criado com erro devido 'Este e-mail já está sendo usado. Por favor, volte e selecione outro.'

    Scenario: Crio um novo usuario pelo gerenciar usuarios
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    And clico em gerenciar 'Usuários'
    And clico em criar nova conta
    And preencho os detalhes da nova conta:
      | Nome do usuario | nome verdadeiro    | email                      | nivel de acesso | habilitado | Protegido |
      | autobot 4       | outro automatizado | matheusventura@outlook.com | gerente         | Sim        | Nao       |
    Then Sistema apresenta mensagem de usuario criado 'Usuário autobot 4 criado com um nível de acesso de gerente'
    When Apago o usuario criado
  Then sistema retorna mensagem 'Operação realizada com sucesso.' para excluir conta


  Scenario: Crio um novo usuario pelo botao convidar usuario
    Given que estou logado como administrador no sistema
    When clico em 'Convidar Usuários'
    And preencho os detalhes da nova conta:
    | Nome do usuario | nome verdadeiro      | email                        | nivel de acesso | habilitado | Protegido |
    | autobot 5       | usuario automatizado | matheus.ventura@base2.com.br | gerente         | Sim        | Nao       |
    Then Sistema apresenta mensagem de usuario criado 'Usuário autobot 5 criado com um nível de acesso de gerente'
    When Apago o usuario criado
    Then sistema retorna mensagem 'Operação realizada com sucesso.' para excluir conta

#  @login
#  Scenario: Efetuar login com sucesso
#    Given clico em criar nova conta
#    When informo o usuario 'testecria'
#    And informo a senha '1234'
#    When clico em entrar
#    Then o usuário deve ser autenticado com sucesso