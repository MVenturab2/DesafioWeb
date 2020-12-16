Feature: Criar nova tarefa


  Background: acessar criação de tarefas
    Given que estou logado como administrador no sistema
    When clico em Criar Tarefa

  Scenario: Crio uma nova tarefa
    And preencho os detalhes do relatorio
    | Categoria     | Frequencia | Gravidade | Prioridade | Selecionar Perfil | Plataforma | SO  | Versao SO | Atribuir      | Resumo          | Descricao                                 | Passos Reproduzir  | informacoes Adicionais | Aplicar Marcadores | Anexo | Visibilidade |
    | categ inicial | sempre     | pequeno   | normal     | Sim               | plat teste | win | 10        | administrator | resumo de teste | Descricao de tarefa de teste automatizado | clicar e preencher | outro teste            | .                  | Nao   | publico      |
    Then sistema retorna mensagem de tarefa criada com 'Operação realizada com sucesso.'

  Scenario: Apagar tarefa criada
    And preencho os detalhes do relatorio
      | Categoria     | Frequencia | Gravidade | Prioridade | Selecionar Perfil | Plataforma | SO  | Versao SO | Atribuir      | Resumo                      | Descricao                                 | Passos Reproduzir  | informacoes Adicionais | Aplicar Marcadores | Anexo | Visibilidade |
      | categ inicial | sempre     | pequeno   | normal     | Sim               | plat teste | win | 10        | administrator | Tarefa de teste para apagar | Descricao de tarefa de teste automatizado | clicar e preencher | outro teste            | .                  | Nao   | publico      |
    Then sistema retorna mensagem de tarefa criada com 'Operação realizada com sucesso.'
    And apago a tarefa
    Then situação da tarefa se encontra 'false' na tela de ver tarefas

  Scenario: adicionar relacionamento entre tarefas
    And preencho os detalhes do relatorio
      | Categoria     | Frequencia | Gravidade | Prioridade | Selecionar Perfil | Plataforma | SO  | Versao SO | Atribuir      | Resumo                      | Descricao                                 | Passos Reproduzir  | informacoes Adicionais | Aplicar Marcadores | Anexo | Visibilidade |
      | categ inicial | sempre     | pequeno   | normal     | Sim               | plat teste | win | 10        | administrator | Tarefa de teste para apagar | Descricao de tarefa de teste automatizado | clicar e preencher | outro teste            | .                  | Nao   | publico      |
    Then sistema retorna mensagem de tarefa criada com 'Operação realizada com sucesso.'
    When clico em Criar Tarefa
    And preencho os detalhes do relatorio
      | Categoria     | Frequencia | Gravidade | Prioridade | Selecionar Perfil | Plataforma | SO  | Versao SO | Atribuir      | Resumo                      | Descricao                                 | Passos Reproduzir  | informacoes Adicionais | Aplicar Marcadores | Anexo | Visibilidade |
      | categ inicial | sempre     | pequeno   | normal     | Sim               | plat teste | win | 10        | administrator | Tarefa de teste para apagar | Descricao de tarefa de teste automatizado | clicar e preencher | outro teste            | .                  | Nao   | publico      |
    And defino relação de 'é filho de' para outra tarefa
    Then situação da tarefa se encontra 'true' na tela de ver tarefas


  Scenario: clonar tarefa
    And preencho os detalhes do relatorio
      | Categoria     | Frequencia | Gravidade | Prioridade | Selecionar Perfil | Plataforma | SO  | Versao SO | Atribuir      | Resumo                      | Descricao                                 | Passos Reproduzir  | informacoes Adicionais | Aplicar Marcadores | Anexo | Visibilidade |
      | categ inicial | sempre     | pequeno   | normal     | Sim               | plat teste | win | 10        | administrator | Tarefa de teste para apagar | Descricao de tarefa de teste automatizado | clicar e preencher | outro teste            | .                  | Nao   | publico      |
    Then sistema retorna mensagem de tarefa criada com 'Operação realizada com sucesso.'
    When crio um clone da tarefa
    Then sistema retorna mensagem de tarefa criada com 'Operação realizada com sucesso.'


  Scenario: fechar tarefa
    And preencho os detalhes do relatorio
      | Categoria     | Frequencia | Gravidade | Prioridade | Selecionar Perfil | Plataforma | SO  | Versao SO | Atribuir      | Resumo                      | Descricao                                 | Passos Reproduzir  | informacoes Adicionais | Aplicar Marcadores | Anexo | Visibilidade |
      | categ inicial | sempre     | pequeno   | normal     | Sim               | plat teste | win | 10        | administrator | Tarefa de teste para apagar | Descricao de tarefa de teste automatizado | clicar e preencher | outro teste            | .                  | Nao   | publico      |
    Then sistema retorna mensagem de tarefa criada com 'Operação realizada com sucesso.'
    When clico em fechar tarefa
    And prencho os detalhes para fechar tarefa:
    | Resolução | Núm Duplicado | Atribuído     | Visibilidade | Adicionar Anotação               |
    | corrigido |               | administrator | publico      | comentarios de teste para anotar |
    Then sistema apresenta o estado da tarefa como 'fechado'
