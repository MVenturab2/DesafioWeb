Feature: Navegar pelas abas no menu pricipal


  @menus
  Scenario: verificar aba minha visão
    Given que estou logado como administrador no sistema
    When clico em 'Minha Visão'
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: verificar aba ver tarefas
    Given que estou logado como administrador no sistema
    When clico em 'Ver Tarefas'
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: verificar aba criar tarefa
    Given que estou logado como administrador no sistema
    When clico em 'Criar Tarefa'
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: verificar aba registro de mudancas
    Given que estou logado como administrador no sistema
    When clico em 'Registro de Mudanças'
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: verificar aba planejamento
    Given que estou logado como administrador no sistema
    When clico em 'planejamento'
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: verificar aba resumo
    Given que estou logado como administrador no sistema
    When clico em 'resumo'
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: verificar aba gerenciar
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: Navegar por abas
    Given que estou logado como administrador no sistema
    When clico em 'Minha Visão'
    Then O sistema retorna a tela solicitada
    When clico em 'Ver Tarefas'
    Then O sistema retorna a tela solicitada
    When clico em 'Criar Tarefa'
    Then O sistema retorna a tela solicitada
    When clico em 'Registro de Mudanças'
    Then O sistema retorna a tela solicitada
    When clico em 'planejamento'
    Then O sistema retorna a tela solicitada
    When clico em 'resumo'
    Then O sistema retorna a tela solicitada
    When clico em 'gerenciar'
    Then O sistema retorna a tela solicitada


  @menus
  Scenario: Navegar por abas apos diminuir a bandeja
    Given que estou logado como administrador no sistema
    When clico em 'minimizar'
    When clico em 'gerenciar'
    Then O sistema retorna a tela solicitada
    When clico em 'resumo'
    Then O sistema retorna a tela solicitada
    When clico em 'planejamento'
    Then O sistema retorna a tela solicitada
    When clico em 'Registro de Mudanças'
    Then O sistema retorna a tela solicitada
    When clico em 'Criar Tarefa'
    Then O sistema retorna a tela solicitada
    When clico em 'Ver Tarefas'
    Then O sistema retorna a tela solicitada
    When clico em 'Minha Visão'
    Then O sistema retorna a tela solicitada
    When clico em 'minimizar'


  @menus
  Scenario: verificar aba Usuários da tela de gerenciar
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    Then O sistema retorna a tela solicitada
    When clico em gerenciar 'Usuários'
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba projetos da tela de gerenciar
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    Then O sistema retorna a tela solicitada
    When clico em gerenciar 'projetos'
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba Marcadores da tela de gerenciar
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    Then O sistema retorna a tela solicitada
    When clico em gerenciar 'Marcadores'
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba Campos Personalizados da tela de gerenciar
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    Then O sistema retorna a tela solicitada
    When clico em gerenciar 'Campos Personalizados'
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba Perfís Globais da tela de gerenciar
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    Then O sistema retorna a tela solicitada
    When clico em gerenciar 'Perfís Globais'
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba Plugins da tela de gerenciar
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    Then O sistema retorna a tela solicitada
    When clico em gerenciar 'Plugins'
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba Configuração da tela de gerenciar
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    Then O sistema retorna a tela solicitada
    When clico em gerenciar 'Configuração'
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba Informação do Site da tela de gerenciar
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    Then O sistema retorna a tela solicitada
    When clico em gerenciar 'Info Do Site'
    Then O sistema retorna a tela de gerenciar solicitada


  @menus
  Scenario: Navegar por abas da tela de gerenciar
    Given que estou logado como administrador no sistema
    When clico em 'gerenciar'
    Then O sistema retorna a tela solicitada
    When clico em gerenciar 'Usuários'
    Then O sistema retorna a tela de gerenciar solicitada
    When clico em gerenciar 'projetos'
    Then O sistema retorna a tela de gerenciar solicitada
    When clico em gerenciar 'Marcadores'
    Then O sistema retorna a tela de gerenciar solicitada
    When clico em gerenciar 'Campos Personalizados'
    Then O sistema retorna a tela de gerenciar solicitada
    When clico em gerenciar 'Perfís Globais'
    Then O sistema retorna a tela de gerenciar solicitada
    When clico em gerenciar 'Plugins'
    Then O sistema retorna a tela de gerenciar solicitada
    When clico em gerenciar 'Configuração'
    Then O sistema retorna a tela de gerenciar solicitada
    When clico em gerenciar 'Info Do Site'
    Then O sistema retorna a tela de gerenciar solicitada






