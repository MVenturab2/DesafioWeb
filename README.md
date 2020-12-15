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


Preparação do ambiente:

Seguir o seguinte tutorial para instalar o xampp e o mantis.

https://www.tutorialspoint.com/mantis/mantis_installation.htm


50 Scripts

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


Data Driven
Foi utilizado o bdd e o scenario outline



Selenium grid

Configurado no serenity.properties para executar nos navegadores crhome, mozilla e ie



Screenshots

Foi configurado no relatorio do serenity prints para cada passo.



Report de execução

Relatorio do Serenity disponivel



Conexao com o banco de dados.



Java Script em uso
Criado script para login utilizando insersao no campo e clique no botao atraves de javascript


Integração contínua

Foi utilizado neste projeto o azure como repositório dos testes e agendador das tarefas e relatorios.


Para configurar o agendamento no azure
Subir o repositorio:



Add pool



Clicar em New Agent e fazer o download do agent.



Criar um token e anotar o codigo passado



Acessar o powershell, e executar o config.cmd do arquivo baixado.
Informar os dados solicitados 

Apos configuração executar o run.cmd para startar o agent local.


Criar um pipeline com as tasks de execução e informar o agent 


