Feature: Operação básica

@usrum
 Scenario Outline: Acessar o Notepad
  Given estou com a aplicacao aberta
  When digito o texto "<text>"
  And clico em 'Ajuda'
  And clico em 'Sobre o bloco de notas'
  And e exibido a versao
  Then clico em ok
Examples:
	| text				|
	|	Hello world		| 