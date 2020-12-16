# DesafioWeb

Mantis + Java + Selenium + cucumber + bdd + azure

Projeto com o intuito de praticar e aperfeiçoar no desenvolvimento de uma automação web. Desenvolvido em java.

Metas deste projeto:
1. Preparação do ambiente: utilizar Mantis para execução de automação de testes;

2. 50 Scripts: Implementar 50 scripts de testes que manipulem uma aplicação web Mantis 

3. Data Driven Testing: Alguns scripts devem ler dados de um Scenario Outline.

4. Selenium Grid: Os casos de testes precisam ser executados em no mínimo três navegadores.

5. Screenshots: Gravar screenshots ou vídeo automaticamente dos casos de testes.

6. Report de execução: O projeto deverá gerar um relatório de testes automaticamente com screenshots ou vídeos embutidos. Serenity report

7. Conexão banco de dados: A massa de testes deve ser preparada neste projeto, seja com scripts carregando massa nova no BD ou com restore de banco de dados.

8. Javascript em uso: Um dos scripts deve injetar Javascript para executar alguma operação na tela. O objetivo aqui é exercitar a injeção de Javascript dentro do código do Selenium.

9. Integração Contínua: Testes deverão ser agendados pelo Jenkins, CircleCI, TFS, Azure ou outra ferramenta de CI que preferir.

###################################################################################################################

1.Preparação do ambiente:

Seguir o seguinte tutorial para instalar o xampp e o mantis.

https://www.tutorialspoint.com/mantis/mantis_installation.htm


2. 50 Scripts

Foram criados 50 Scripts de testes validando funcionalidades do sistema relacionadas a:
Criar tarefas
Gerenciar campos personalizados
Gerenciar Categorias globais
Gerenciar Marcadores
GerenciarPerfis Globais
Gerenciar Projetos
Gerenciar Usuarios
Login
Menus


3. Data Driven
Foi utilizado o bdd e o scenario outline

https://lh3.googleusercontent.com/5cCrYDm5fQFELpnkkjZulhFpnyYEF9O8o2WiOfzgeK-AI7X0Fh4e7aq-ZHOi2ZLXPvnU4UEH7yP3-uFfN-K43sEFPpUPRsh8kZArctm7VncWjgRLU3jk5GKVAouKAjQ6TgOAVo5x


4. Selenium grid

Configurado no serenity.properties para executar nos navegadores crhome, mozilla e ie

https://lh4.googleusercontent.com/9OuRTCd93zeOlC2YxW00IhGOvUoz0g9P7_16HichB4XcxBN7fQAk13B4INtaoF9CR9Xczh0YRo6sZPQhKNGCJt1guw9nSA0jun-_MaEkkVpVnBaKfzR1GC3azCtqImOHKMXnWCEr

5. Screenshots

Foi configurado no relatorio do serenity prints para cada passo.

https://lh6.googleusercontent.com/EQswkQ_MzKyiPdBDn9qoXsU0I3Ep2omvPzjC2_086isgBu9gaCiPJ1he8wG1HC-BDlJHGF-prILet1QBcozzSJJmcDz_jnuCDG1rm_PrORxrKvCBqGRpNQOkEZcgOZsj8bsGv2gV

6. Report de execução

Relatorio do Serenity disponivel

https://lh3.googleusercontent.com/RioCBxcTBpXKxoXHruALkA-MhcUI0AU78-DmCN0zrIioy1_XsevWZR6wv_3Hz3BOI_iKXWZUDfVFekRz6WS1Vx6jOj9pQFGJ4cXHuy6J

7. Conexao com o banco de dados.

Configurado script para zerar a base mysql


8. Java Script em uso
Criado script para login utilizando insersao no campo e clique no botao atraves de javascript


9. Integração contínua

Foi utilizado neste projeto o azure como repositório dos testes e agendador das tarefas e relatorios.


Para configurar o agendamento no azure
Subir o repositorio:

https://lh4.googleusercontent.com/TrsUiuXipjLe_Q1ZRkWBQqw4OcYpuK_HARGdQn5MJng1L9ar6tNl7XJtdContOq8Om7cwKyiUNSDcXppLMr0mPLadWK2i5nq8xQAy3Ho-WSFZh8UN86sUOPmz3XOG9WEnY7qYq88

https://lh5.googleusercontent.com/qivYLezG1U6IaUwCM43LYSr8Ukg2zI5gBjXCN9VAmacPYDD7tKR_MkX2pDXWbvUHa0z6b3P27RKh-wJJlmpj0SIy2wi3Uf8Jc6NoIauivaBAQq8Uj4vY_dYEqIimt1TUXGgnoccm

Add pool

https://lh6.googleusercontent.com/eppKqAcsIUQ2mWSsHXMWuEre7Ny-q-px2zbP2Lofym5LPPf7EewliuSmFuNUGYrWENlYFTOYrPEDV26j6ZUIbpxnSuPGR2xOB40fGIQgN72Y5I_rQNvolx617txjQph26jpv2mwp

Clicar em New Agent e fazer o download do agent.

https://lh5.googleusercontent.com/QhRsPX0Uc0tJ401GCI-R4VqgfgkLPgN8ugBSZtg6pW6-k_JgDcjUds15YZ7sI8dsVN4I4w9UrTk5nZCW-uZ9hyk7FaewC0RD_OU7pfKp

Criar um token e anotar o codigo passado

https://lh6.googleusercontent.com/u9CBq69d9CaQien06cPgxRDavdkGlw9r1KHDDn7GBTzPQ7EylB0QFxWNtdzXulxublQCtpYRl5Bl69hw9crqNdir3oHlzGp7qG25bkFRVlPKxtgYGGgPu5c6_YdQ3tkTlykbYW8i

Acessar o powershell, e executar o config.cmd do arquivo baixado.
Informar os dados solicitados 

https://lh4.googleusercontent.com/rnYkCXRX1d1jsHVJ3CtNbFuU85wmlzakIqX_NhML0iF4EdueMxYcF5Ex4MpRQyfn-NdUkuPmUQmcJDNkZxQLELh8oDWPgtblytJ3sA7tMBD7DqbAX302otzpIG58MGtIMGv-QSMc

Apos configuração executar o run.cmd para startar o agent local.


Criar um pipeline com as tasks de execução e informar o agent 

https://lh4.googleusercontent.com/VaJZbIbjHqC11RY1liVvIuFeORy91jY3UA7-aqrKfsQBnDdtGjMs0NfLTmkOYqR4SPsSiZO0VST7bjs5Kou556u8-tx5ldA6TMDl69b1bYSz8CRJyLzsaih3UHejQsbmv3wig0aA

https://lh4.googleusercontent.com/CoqWOPDExxnSLpU647cXJ1hwfj-WBMC7wVKxqdcSzDBhOWHiBxPqL3uqu_oAz-dd0Gl9YC4c641Hd_k6XUsHYuV2U54Ttw3c3QJfZJBp
