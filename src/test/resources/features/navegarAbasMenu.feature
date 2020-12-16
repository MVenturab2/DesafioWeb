Feature: Navegar pelas abas no menu pricipal


  Background: estar logado
    Given que estou logado como administrador no sistema


  @menus
  Scenario: verificar aba minha visão
    When clico em Minha Visão
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: verificar aba ver tarefas
    When clico em Ver Tarefas
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: verificar aba criar tarefa
    When clico em Criar Tarefa
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: verificar aba registro de mudancas
    When clico em Registro de Mudanças
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: verificar aba planejamento
    When clico em planejamento
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: verificar aba resumo
    When clico em resumo
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: verificar aba gerenciar
    When clico em gerenciar
    Then O sistema retorna a tela solicitada

  @menus
  Scenario: Navegar por abas
    When clico em Minha Visão
    Then O sistema retorna a tela solicitada
    When clico em Ver Tarefas
    Then O sistema retorna a tela solicitada
    When clico em Criar Tarefa
    Then O sistema retorna a tela solicitada
    When clico em Registro de Mudanças
    Then O sistema retorna a tela solicitada
    When clico em planejamento
    Then O sistema retorna a tela solicitada
    When clico em resumo
    Then O sistema retorna a tela solicitada
    When clico em gerenciar
    Then O sistema retorna a tela solicitada


  @menus
  Scenario: Navegar por abas apos diminuir a bandeja
    When clico em minimizar
    When clico em gerenciar
    Then O sistema retorna a tela solicitada
    When clico em resumo
    Then O sistema retorna a tela solicitada
    When clico em planejamento
    Then O sistema retorna a tela solicitada
    When clico em Registro de Mudanças
    Then O sistema retorna a tela solicitada
    When clico em Criar Tarefa
    Then O sistema retorna a tela solicitada
    When clico em Ver Tarefas
    Then O sistema retorna a tela solicitada
    When clico em Minha Visão
    Then O sistema retorna a tela solicitada
    When clico em minimizar


  @menus
  Scenario: verificar aba Usuários da tela de gerenciar
    When clico em gerenciar
    Then O sistema retorna a tela solicitada
    When acesso gerenciar Usuários
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba projetos da tela de gerenciar
    When clico em gerenciar
    Then O sistema retorna a tela solicitada
    When acesso gerenciar projetos
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba Marcadores da tela de gerenciar
    When clico em gerenciar
    Then O sistema retorna a tela solicitada
    When acesso gerenciar Marcadores
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba Campos Personalizados da tela de gerenciar
    When clico em gerenciar
    Then O sistema retorna a tela solicitada
    When acesso gerenciar Campos Personalizados
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba Perfís Globais da tela de gerenciar
    When clico em gerenciar
    Then O sistema retorna a tela solicitada
    When acesso gerenciar Perfís Globais
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba Plugins da tela de gerenciar
    When clico em gerenciar
    Then O sistema retorna a tela solicitada
    When acesso gerenciar Plugins
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba Configuração da tela de gerenciar
    When clico em gerenciar
    Then O sistema retorna a tela solicitada
    When acesso gerenciar Configuração
    Then O sistema retorna a tela de gerenciar solicitada

  @menus
  Scenario: verificar aba Informação do Site da tela de gerenciar
    When clico em gerenciar
    Then O sistema retorna a tela solicitada
    When acesso gerenciar Info Do Site
    Then O sistema retorna a tela de gerenciar solicitada


  @menus
  Scenario: Navegar por abas da tela de gerenciar
    When clico em gerenciar
    Then O sistema retorna a tela solicitada
    When acesso gerenciar Usuários
    Then O sistema retorna a tela de gerenciar solicitada
    When acesso gerenciar projetos
    Then O sistema retorna a tela de gerenciar solicitada
    When acesso gerenciar Marcadores
    Then O sistema retorna a tela de gerenciar solicitada
    When acesso gerenciar Campos Personalizados
    Then O sistema retorna a tela de gerenciar solicitada
    When acesso gerenciar Perfís Globais
    Then O sistema retorna a tela de gerenciar solicitada
    When acesso gerenciar Plugins
    Then O sistema retorna a tela de gerenciar solicitada
    When acesso gerenciar Configuração
    Then O sistema retorna a tela de gerenciar solicitada
    When acesso gerenciar Info Do Site
    Then O sistema retorna a tela de gerenciar solicitada






