## Descrição
Implemente um sistema para monitorar o uso de crédito em ligações telefônicas. Cada ligação consome uma quantidade de crédito de acordo com a sua duração e o tipo da ligação (local, nacional ou internacional). Desenvolva uma função que calcule o consumo de crédito de um cliente baseado nas suas ligações.

Cada ligação é representada por um triplo de valores: a duração da ligação (em minutos), o tipo da ligação e o valor do crédito por minuto de acordo com o tipo de ligação.

## Entrada
A entrada deverá receber:

Um número inteiro n, representando o número de ligações.
Para cada ligação, uma linha contendo os valores a seguir separados por vírgula:
Um número inteiro representando a duração da ligação em minutos.
Uma string representando o tipo da ligação (local, nacional, ou internacional).
Um número decimal representando o valor do crédito por minuto para aquele tipo de ligação.
Saída
A função deverá retornar o consumo total de crédito em uma única linha. O resultado deve ser um número decimal com duas casas decimais.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
