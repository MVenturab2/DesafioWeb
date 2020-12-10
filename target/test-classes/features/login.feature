Feature: Login



  @login
  Scenario: Efetuar login com sucesso utilizando javascript
    Given informo o usuario utilizando javascript 'administrator'
    And clico utilizando javascript em entrar
    And informo a senha utilizando javascript 'vent'
    When clico utilizando javascript em entrar
    Then o usuário deve ser autenticado com sucesso


  @login
  Scenario: Efetuar login com sucesso
    Given informo o usuario 'administrator'
    And clico em entrar
    And informo a senha 'vent'
    When clico em entrar
    Then o usuário deve ser autenticado com sucesso

    @login
  Scenario: Efetuar login sem preencher usuario
    Given informo o usuario ''
    When clico em entrar
    Then a mensagem de erro ao logar deve ser apresentada

  @login
  Scenario Outline: Efetuar login errado
    Given informo o usuario '<usuario>'
    And clico em entrar
    And informo a senha '<senha>'
    When clico em entrar
    Then a mensagem de erro ao logar deve ser apresentada

    Examples:
    | usuario        | senha  |
    | errado         | root   |
    | administrator  | errado |
    | administrator  |        |
