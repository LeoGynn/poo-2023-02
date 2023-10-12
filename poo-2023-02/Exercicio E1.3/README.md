Objetivo
Crie o código correspondente aos seguintes itens/restrições. Execute o programa e observe os resultados.

Itens/Restrições

Crie a classe Livro. Esta classe deve possuir os atributos titulo, autor, ano e editora. O titulo é o nome da obra (sequência de caracteres). O segundo desses atributos deve ser uma sequência de caracteres correspondente ao autor da obra em questão. O ano deve ser um inteiro representando o ano de publicação do livro e editora uma sequência de caracteres correspondente ao nome da editora.

Crie métodos set/get que permitam definir um valor e obtê-lo, para cada atributo/propriedade desta classe. Estes métodos seguem regras de formação bem definidas. Por exemplo, para a propriedade autor, os métodos correspondentes devem ser identificados por setAutor e getAutor.

Crie a classe TestaLivro. Esta classe deverá criar uma instância para cada um dos três livros mais vendidos pela Amazon. Posteriormente, o estado de cada instância deverá ser exibido na saída padrão. Em tempo, Amazon é uma das principais livrarias virtuais do planeta. Os bestsellers desta livraria podem ser obtidos em www.amazon.com.

Uma abordagem frequente para exibir o estado de uma instância, ou seja, os valores das propriedades da instância, usa o método String toString(). Este método é herdado da classe Object e, por conseguinte, o uso dele exige que a classe derivada faça uma sobreposição. Convém ressaltar que, em Java, toda classe herda de Object, inclusive arrays.

No momento em que este texto foi feito o número um da lista era The Da Vince Code, Dan Brown, publicado pela editora Doubleday em 2003. Para esta instância a saída correspondente a ser produzida deve se assemelhar ao que se vê abaixo:

The Da Vince Code
Dan Brown
Doubleday, 2003