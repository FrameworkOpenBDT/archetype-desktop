Feature: Analise de criptomoedas

@usrum
Scenario Outline: Verificar cotacao de uma criptomoeda
  Given estou na tela inicial
  And busco pelo item "<cryptocurrency>" na lista
  And clico no item
  And verificar cotacao da criptomoeda
  Then clico em adicionar

Examples:
   | cryptocurrency |
   | nano |