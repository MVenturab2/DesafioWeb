Feature: Criar nova tarefa

  Scenario: Crio uma nova tarefa
    Given que estou logado como administrador no sistema
    When clico em 'Criar Tarefa'
    And preencho os detalhes do relatorio
    | Categoria     | Frequencia | Gravidade | Prioridade | Selecionar Perfil | Plataforma | SO  | Versao SO | Atribuir      | Resumo          | Descricao                                 | Passos Reproduzir  | informacoes Adicionais | Aplicar Marcadores | Anexo | Visibilidade |
    | categ inicial | sempre     | pequeno   | normal     | Sim               | plat teste | win | 10        | administrator | resumo de teste | Descricao de tarefa de teste automatizado | clicar e preencher | outro teste            | .                  | Nao   | publico      |
    Then Sistema retorna mensagem de tarefa criada com 'Operação realizada com sucesso.'

  Scenario: Apagar tarefa criada
    Given que estou logado como administrador no sistema
    When clico em 'Criar Tarefa'
    And preencho os detalhes do relatorio
      | Categoria     | Frequencia | Gravidade | Prioridade | Selecionar Perfil | Plataforma | SO  | Versao SO | Atribuir      | Resumo                      | Descricao                                 | Passos Reproduzir  | informacoes Adicionais | Aplicar Marcadores | Anexo | Visibilidade |
      | categ inicial | sempre     | pequeno   | normal     | Sim               | plat teste | win | 10        | administrator | Tarefa de teste para apagar | Descricao de tarefa de teste automatizado | clicar e preencher | outro teste            | .                  | Nao   | publico      |
    Then Sistema retorna mensagem de tarefa criada com 'Operação realizada com sucesso.'
    And apago a tarefa
    Then A situação da tarefa se encontra 'false' na tela de ver tarefas

  Scenario: adicionar relacionamento entre tarefas
    Given que estou logado como administrador no sistema
    When clico em 'Criar Tarefa'
    And preencho os detalhes do relatorio
      | Categoria     | Frequencia | Gravidade | Prioridade | Selecionar Perfil | Plataforma | SO  | Versao SO | Atribuir      | Resumo                      | Descricao                                 | Passos Reproduzir  | informacoes Adicionais | Aplicar Marcadores | Anexo | Visibilidade |
      | categ inicial | sempre     | pequeno   | normal     | Sim               | plat teste | win | 10        | administrator | Tarefa de teste para apagar | Descricao de tarefa de teste automatizado | clicar e preencher | outro teste            | .                  | Nao   | publico      |
    Then Sistema retorna mensagem de tarefa criada com 'Operação realizada com sucesso.'
    When clico em 'Criar Tarefa'
    And preencho os detalhes do relatorio
      | Categoria     | Frequencia | Gravidade | Prioridade | Selecionar Perfil | Plataforma | SO  | Versao SO | Atribuir      | Resumo                      | Descricao                                 | Passos Reproduzir  | informacoes Adicionais | Aplicar Marcadores | Anexo | Visibilidade |
      | categ inicial | sempre     | pequeno   | normal     | Sim               | plat teste | win | 10        | administrator | Tarefa de teste para apagar | Descricao de tarefa de teste automatizado | clicar e preencher | outro teste            | .                  | Nao   | publico      |
    And defino relação de 'é filho de' para outra tarefa
    Then A situação da tarefa se encontra 'true' na tela de ver tarefas


  Scenario: clonar tarefa
    Given que estou logado como administrador no sistema
    When clico em 'Criar Tarefa'
    And preencho os detalhes do relatorio
      | Categoria     | Frequencia | Gravidade | Prioridade | Selecionar Perfil | Plataforma | SO  | Versao SO | Atribuir      | Resumo                      | Descricao                                 | Passos Reproduzir  | informacoes Adicionais | Aplicar Marcadores | Anexo | Visibilidade |
      | categ inicial | sempre     | pequeno   | normal     | Sim               | plat teste | win | 10        | administrator | Tarefa de teste para apagar | Descricao de tarefa de teste automatizado | clicar e preencher | outro teste            | .                  | Nao   | publico      |
    Then Sistema retorna mensagem de tarefa criada com 'Operação realizada com sucesso.'
    When crio um clone da tarefa
    Then Sistema retorna mensagem de tarefa criada com 'Operação realizada com sucesso.'


  Scenario: fechar tarefa
    Given que estou logado como administrador no sistema
    When clico em 'Criar Tarefa'
    And preencho os detalhes do relatorio
      | Categoria     | Frequencia | Gravidade | Prioridade | Selecionar Perfil | Plataforma | SO  | Versao SO | Atribuir      | Resumo                      | Descricao                                 | Passos Reproduzir  | informacoes Adicionais | Aplicar Marcadores | Anexo | Visibilidade |
      | categ inicial | sempre     | pequeno   | normal     | Sim               | plat teste | win | 10        | administrator | Tarefa de teste para apagar | Descricao de tarefa de teste automatizado | clicar e preencher | outro teste            | .                  | Nao   | publico      |
    Then Sistema retorna mensagem de tarefa criada com 'Operação realizada com sucesso.'
    When clico em fechar tarefa
