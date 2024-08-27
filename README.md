
# Heranca e Polimorfismo - Solutis Dev Trail

## Descrição do Projeto

Este projeto implementa uma hierarquia de classes em Java para simular animais, veterinários e um zoológico, bem como uma empresa com diferentes níveis de funcionários (Gerentes, Supervisores e Vendedores). O projeto foi desenvolvido como parte de uma série de exercícios que exploram conceitos de herança, polimorfismo, sobrescrita de métodos e encapsulamento.

## Estrutura do Projeto

### Pacote `animais`

Este pacote contém classes relacionadas aos animais e suas interações com veterinários e zoológicos.

- **Animal (classe abstrata)**: Classe base para todos os animais. Define métodos abstratos `emitirSom()` e `correr()` que são implementados nas subclasses.
- **Cachorro**: Representa um cachorro, herda de `Animal`. Implementa os métodos `emitirSom()` e `correr()`.
- **Cavalo**: Representa um cavalo, herda de `Animal`. Implementa os métodos `emitirSom()` e `correr()`.
- **Preguica**: Representa uma preguiça, herda de `Animal`. Implementa os métodos `emitirSom()` e `correr()`. A preguiça, ao invés de correr, sobe em árvores.
- - **Zoologico**: Contém um array de 10 jaulas, onde cada jaula pode abrigar um animal. Implementa métodos para adicionar animais às jaulas e para percorrer as jaulas, emitindo os sons dos animais e fazendo-os correr.
- **Veterinario**: Classe que representa um veterinário, com um método `examinar()` que recebe um animal como parâmetro e faz com que o animal emita um som.

### Pacote `funcionarios`

Este pacote contém classes relacionadas aos funcionários de uma empresa, incluindo a estrutura de comissões e cálculos de salários.

- **Funcionario (classe abstrata)**: Classe base para todos os funcionários, com atributos comuns como `nome`, `codigoFuncional`, `salarioBase`, e `comissao`. Define o método abstrato `calcularRenda()`.
- **Gerente**: Representa um gerente, herda de `Funcionario`. Possui uma comissão específica de R$ 1500,00.
- **Supervisor**: Representa um supervisor, herda de `Funcionario`. Possui uma comissão específica de R$ 600,00.
- **Vendedor**: Representa um vendedor, herda de `Funcionario`. Possui uma comissão específica de R$ 250,00.
- **FuncionarioEnsinoBasico**: Herda de `Funcionario`, representa funcionários que concluíram o ensino básico. Implementa o método `calcularRenda()` para adicionar 10% ao salário base.
- **FuncionarioEnsinoMedio**: Herda de `FuncionarioEnsinoBasico`, representa funcionários que concluíram o ensino médio. Implementa o método `calcularRenda()` para adicionar 50% ao salário do ensino básico.
- **FuncionarioGraduado**: Herda de `FuncionarioEnsinoMedio`, representa funcionários que concluíram a graduação. Implementa o método `calcularRenda()` para adicionar 100% ao salário do ensino médio.

- **Zoologico**: Contém um array de 10 jaulas, onde cada jaula pode abrigar um animal. Implementa métodos para adicionar animais às jaulas e para percorrer as jaulas, emitindo os sons dos animais e fazendo-os correr.
- **Veterinario**: Classe que representa um veterinário, com um método `examinar()` que recebe um animal como parâmetro e faz com que o animal emita um som.

## Funcionamento

### Exercício 02: Polimorfismo com Animais

Neste exercício, criamos três tipos de animais: `Cachorro`, `Cavalo`, e `Preguica`. Em seguida, utilizamos o conceito de polimorfismo para invocar o método `emitirSom()` de cada animal, independentemente do tipo.

### Exercício 03: Veterinário

Aqui, foi criada a classe `Veterinario`, que contém um método `examinar()`. Este método recebe um objeto do tipo `Animal` e faz com que o animal emita um som, simulando um exame.

### Exercício 04: Zoológico

Neste exercício, criamos um zoológico com 10 jaulas. Cada jaula pode conter um animal diferente. O zoológico pode percorrer todas as jaulas, fazendo com que cada animal emita seu som característico e execute seu comportamento (como correr ou subir em árvores, no caso da preguiça).

### Exercício 07, 08, 09 e 10: Funcionários e Comissões

Nesses exercícios, implementamos uma hierarquia de funcionários em uma empresa. Foram criadas classes para `Gerente`, `Supervisor`, e `Vendedor`, cada uma com comissões específicas. Além disso, foram criadas classes para representar os diferentes níveis educacionais dos funcionários, com cálculos de salário que incluem incrementos com base na educação.

### Exercício 11: Sobrescrita de `toString`

Finalmente, sobrescrevemos o método `toString()` nas classes de funcionários para exibir o nome do funcionário, sua comissão e o salário total.

