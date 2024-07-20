# DIO - Trilha Java Básico
 www.dio.me

### Autor
- [Kauã Amorim](https://github.com/Kauanqualquercoisa)

## Roteiro do Desafio

  Esse é um desafio proposto de DIO para exercitar os conhecimento depreendidos ao longo do módulo Sintaxe Básica Java.

1. Criar um projeto 'ContaBanco' que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2. Dentro do projeto, criei a classe `ContaTerminal.java` para realizar toda a codificação do programa.

###### Regras de declaração de variáveis no programa.
| Atributo | Tipo  | Exemplo 
|----------|-------|--------
|  Nome    |Texto  | Kaua
|Sobrenome |Texto  | Amorim
| Agencia  |Texto  | 067-9
| Conta    |Inteiro| 1234
| Saldo |Decimal| 254,90 

#### Informei ao usuário sobre quais dados estão sendo solicitados e precisarão ser inseridos via terminal
###### exemplo
* Programa: "Por favor, digite o número da Agência !"
* Usuário :  1021 *(depois ENTER para o próximo campo)*

#### Para a exibição das informações obtidos usei conhecimentos sobre concatenação e classe String com o uso do "+".
* Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

*"Olá [Nome] [Sobrenome], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo é de [Saldo] R$ já está disponível para saque".*

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
