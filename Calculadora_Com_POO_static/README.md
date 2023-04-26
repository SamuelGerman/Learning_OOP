Nessa versão da calculadora, as responsabildiades do programa foram distribuidas de maneira mais correta.
Uma calculadora deve fazer contas, é isso que o objeto da classe calculadora faz, sendo assim, os métodos de entrada e saída que
outrora estavão na classe calculadora, foram redirecionados para suas respectvias classes, Entrada.class e Saida.class.

Vale lembrar que como praticamente todos os métodos de todas as classes são "static", a memória utilizada pelo programa na hora da execução
é a mesma da última versçao do programa.

Para fazer com que o programa utilize apenas a memória necessária para realizar sua função, é necessário definir métodos dinâmicos, uma ideia seria fazer com que cada operação fosse um método dinâmico, sendo assim, se o programa executar sem fazer nenhuma operação de soma,nao será alocada memória para executar a soma.