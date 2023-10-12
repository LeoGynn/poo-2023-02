Problema
1- Crie a classe Animal. Esta classe deve possuir um único método: som. Este método não recebe nenhum valor como argumento e, quando executado, deverá retornar a sequência de caracteres "Voz produzida pelo animal" (sem as aspas, claro). A classe Animal não é abstrata. Não forneça construtor para a classe Animal. Esta classe também não deve possuir nenhum atributo.

2- Crie a classe Sapo e faça a sobreposição (overriding) do método som, que deve retornar uma sequência de caracteres correspondente ao som produzido por este tipo de animal, no caso, "coaxar". Sobreposição ou overridding refere-se ao cenário onde um método de uma subclasse possui exatamente a mesma assinatura de um método da superclasse e, dessa forma, há uma sobreposição do método da superclasse. Essa classe não possui nenhum atributo próprio.

3- Crie a classe Cachorro que herda da classe Animal. Implemente o método som. O retorno deve ser "latir". O retorno também pode ser "ladrar" ou "ganir". Essa classe não possui nenhum atributo próprio.

4- Crie a classe Boi e implemente o método som, cujo retorno deverá ser "berrar" ou "mugir". Novamente, esta classe também estende a classe Animal. Essa classe não possui nenhum atributo próprio.

5- Crie uma quinta classe: TestaAnimais. Esta classe deverá conter o código que testa as classes identificadas acima. Quando executada, esta classe deverá:

Criar um array de três componentes. Cada componente do array deverá ser uma referência para um objeto da classe Animal. Entenda o objeto da classe Animal como sendo todo e qualquer objeto que pode se comportar como uma instância desta classe. Por exemplo, toda instância de uma subclasse de Animal pode se comportar como um objeto da classe Animal. Veja um exemplo de array em Java:
// Declarando e inicializando um array de cores
        Cor[] cores = new Cor[3];
        cores[0] = new Vermelho();
        cores[1] = new Verde();
        cores[2] = new Azul();
Crie uma instância de cada um dos animais, ou seja, uma instância de Sapo, uma de Cachorro e outra de Boi. Deposite a referência correspondente em uma posição do array criado pelo item anterior. Ou seja, todas as instâncias criadas serão referenciadas, cada uma delas, por um dos componentes do array.
Crie um laço que percorra os elementos do array e para cada um deles envie a mensagem polimórfica som. Ou seja, cada referência armazenada no array designa um objeto para o qual será enviada a mensagem som.
Portanto, a solução deve estar aderente a este modelo:

             //////////////////////////////             
            ///      TestaAnimais      ///
           //////////////////////////////
          ///       main()           ///
         //////////////////////////////                                                 /////////////////////
                        |                                                               ///    Animal    ///
                        |                                                        ______ //////////////////// ___________
                        |                                                        |      ///    som()    ///             |
                        |                                                        |      ////////////////////            |   
                        |                                                        |                  |                   |
                        |                                                        |                  |                   |
                        |                                                /////////////////   /////////////////  ////////////////////
                        |                                                ///    Boi    ///   ///   Sapo    ///  ///   Cachorro   ///
                        |                                                /////////////////   /////////////////  ///////////////////
                        |                                                ///  som()   ////   ////  som()   ///  ///  som()      ///
                        |                                                /////////////////   /////////////////  ///////////////////
                        |
                        |
                        |
                        |
            /////////////////////////////////////////
            /// Cria três instancias de distintas///
            /// classes, deposita em arrays de  ///
           /// Animal e envia a msg som para   ///
           /// cada uma delas                 ///
           //////////////////////////////////////
           ///       main()                 ////
           ////////////////////////////////////

           
Saiba Mais
A classe Object é uma classe que serve de superclasse para todas as classes existentes em Java. Isso significa que ao criar uma classe, se não for especificada nenhuma superclasse após a palavra extends, então a classe Object será assumida automaticamente como superclasse. Portanto toda classe é subclasse de Object, e com isso herda alguns métodos automaticamente. Um método muito interessante presente na classe Object é o equals. Suponha que haja duas instâncias de uma mesma classe e desejamos testar se elas contém a mesma informação. O operador == nos daria o valor true apenas se seus operandos forem precisamente o mesmo objeto. Porém, o operador equals nos diria quando os objetos contém o mesmo estado, através da comparação campo-a-campo. Por exemplo, eu e você podemos ter carro do mesmo modelo. Nesse caso meuCarro == seuCarro seria false pois embora nossos carros sejam do mesmo modelo, são carros diferentes. Entretanto, meuCarro.equals(seuCarro) poderia ser true se os atributos de ambos os carros fossem idênticos, por exemplo, mesmo ano, mesma cor, etc.

Um outro método interessante da classe Object é o método getClass, que retorna uma referência a um objeto contendo informações sobre a classe a que é aplicado.