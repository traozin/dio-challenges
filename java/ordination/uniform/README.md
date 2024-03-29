# Uniforms

## Desafio
O professor Girafales organizou a confecção de um uniforme para as turmas da escola para comemorar o final do ano. Após algumas conversas, ficou decidido com os alunos que eles poderiam escolher a cor do uniforme entre branco ou vermelho. Assim sendo, Girafales precisa de sua ajuda para organizar as listas de quem quer o uniforme em cada uma das turmas, relacionando estas camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.

## Entrada
Cada caso de teste inicia com um valor N, (1 ≤ N ≤ 60) inteiro e positivo, que indica a quantidade de uniformes a serem feitas para aquela turma. As próximas N*2 linhas contém informações de cada um dos uniformes (serão duas linhas de informação para cada uniforme). A primeira linha irá conter o nome do estudante e a segunda linha irá conter a cor do uniforme ("branco" ou "vermelho") seguido por um espaço e pelo tamanho do uniforme "P" "M" ou "G". A entrada termina quando o valor de N for igual a zero (0) e esta valor não deverá ser processado.

## Saída
Para cada caso de entrada deverão ser impressas as informações ordenadas pela cor em ordem ascendente, seguido pelos tamanhos em ordem descendente e por último por ordem ascendente de nome, conforme o exemplo abaixo.

## Teste

<table>
  <caption><h3 style="align-content: center;">Bateria de Testes</h3></caption>  
  <tr>
    <td> Teste 1 </td>
    <td> Teste 2 </td>
  </tr>
  <tr>
    <td> 
      <table>
        <tr>
          <td> Exemplo de entradas  </td>
          <td> Exemplo de saída </td>
        </tr>
        <tr>
          <td>9 <br> Maria Jose <br> branco P <br> Mangojata Mancuda <br> vermelho P <br> Cezar Torres Mo <br> branco P <br> Baka Lhau <br> vermelho P <br> JuJu Mentina <br> branco M <br> Amaro Dinha <br> vermelho P <br> Adabi Finho <br> branco G <br> Severina Rigudinha <br> branco G <br> Carlos Chade Losna <br> vermelho P <br> 0 </td>
          <td> branco P Cezar Torres Mo <br> branco P Maria Jose <br> branco M JuJu Mentina <br> branco G Adabi Finho <br> branco G Severina Rigudinha <br>vermelho P Amaro Dinha <br> vermelho P Baka Lhau <br> vermelho P Carlos Chade Losna <br> vermelho P Mangojata Mancuda </td>
        </tr>
      </table>
    </td>
    <td> 
      <table>
        <tr>
          <td> Exemplo de entradas </td>
          <td> Exemplo de saída </td>
        </tr>
        <tr>
          <td> 3 <br> Maria Joao <br> branco P <br> Marcio Guess <br> vermelho P <br> Maria Jose <br> branco P </td>
          <td> branco P Maria Joao <br> branco P Maria Jose <br> vermelho P Marcio Guess </td>
        </tr>
      </table>
    </td>
  </tr>
</table>

