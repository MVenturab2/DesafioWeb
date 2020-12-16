Feature: Gerenciar Marcadores

  Background: acessar campos personalizados
    Given que estou logado como administrador no sistema
    When clico em gerenciar
    And acesso gerenciar Campos Personalizados

  Scenario: Crio um novo Campo Personalizado
    And crio um novo campo personalizado 'Aleatorio'
    And preencho os detalhes do campo personalizado:
    | Tipo   | Valores Possíveis  | Valor Padrão | Expressão Regular | Acesso de Leitura | Acesso de Escrita | Comprimento Mínimo | Comprimento Máximo | Adicionar ao Filtro | Mostrar ao criar tarefas | Mostrar ao atualizar tarefas | Mostrar ao resolver tarefas | Mostrar ao fechar tarefas | Requerido no relato | Requerido na atualização | Requerido na resolução | Requerido no fechamento | Projetos | Sequência |
    | String | abc                | x            | x                 | visualizador      | visualizador      | 0                  | 9                  | sim                 | nao                      | sim                          | nao                         |  nao                      | nao                 | nao                      |  nao                   | nao                     | nao      | nao       |
    Then sistema retorna mensagem 'Operação realizada com sucesso.' para excluir conta

  Scenario: Apago um Campo Personalizado criado
    And crio um novo campo personalizado 'Aleatorio'
    And apago o campo personalizado
    Then sistema retorna mensagem 'Operação realizada com sucesso.' para excluir conta

  Scenario: Crio Campo Personalizado Repetido
    And crio um novo campo personalizado 'Repetido'
    Then sistema apresenta mensagem de erro ao criar Categoria devido 'Este é um nome duplicado.'

