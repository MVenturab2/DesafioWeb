Feature: ver tarefas


  @menus
  Scenario: Imprimir tarefas
    Given que estou logado como administrador no sistema
    When clico em 'Ver Tarefas'
    Then O sistema retorna a tela com 'Filtros'
    When Clico em 'Imprimir Tarefas' no campo Visualizando Tarefas

  @menus
  Scenario: Exportar para arquivo csv
    Given que estou logado como administrador no sistema
    When clico em 'Ver Tarefas'
    Then O sistema retorna a tela com 'Filtros'
    When Clico em 'Exportar para Arquivo CSV' no campo Visualizando Tarefas

  @menus
  Scenario: Exportar para Excel
    Given que estou logado como administrador no sistema
    When clico em 'Ver Tarefas'
    Then O sistema retorna a tela com 'Filtros'
    When Clico em 'Exportação para Excel' no campo Visualizando Tarefas

  @menus
  Scenario: Clicar em resumo das tarefas na tela de tarefas
    Given que estou logado como administrador no sistema
    When clico em 'Ver Tarefas'
    Then O sistema retorna a tela com 'Filtros'
    When Clico em 'Resumo' no campo Visualizando Tarefas


