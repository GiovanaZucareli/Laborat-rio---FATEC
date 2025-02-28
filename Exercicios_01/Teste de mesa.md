# Exercicio01

## Entrada de dados  

| Entrada (anos) | Entrada (meses) | Entrada (dias) | Cálculo (anos * 365) + (meses * 30) + dias | Saída      |
|----------------|-----------------|----------------|------------------------------------------|------------|
| 2000           | 5               | 15             | (2000 * 365) + (5 * 30) + 15            | 730015     |
| 2025           | 2               | 27             | (2025 * 365) + (2 * 30) + 27            | 739077     |
|                |                 |                | 739077 - 730015                         | 9062       |

---

# Exercicio02

## Entrada de dados  

| Entrada (quantidade de eleitores) | Entrada (quantidade de votos brancos) | Entrada (quantidade de votos nulos) | Entrada (quantidade de votos válidos) | Cálculo (percentual)                | Saída  |
|------------------------------------|--------------------------------------|--------------------------------------|----------------------------------------|------------------------------------|--------|
| 1000                               | 150                                  | 100                                  | 750                                    | (150 * 100.0) / 1000 = 15.0        | 15.0   |
| 1000                               | 150                                  | 100                                  | 750                                    | (100 * 100.0) / 1000 = 10.0        | 10.0   |
| 1000                               | 150                                  | 100                                  | 750                                    | (750 * 100.0) / 1000 = 75.0        | 75.0   |

---

# Exercicio03

## Entrada de dados  

| Entrada (salário mensal) | Entrada (percentual de reajuste) | Cálculo (aumento) | Cálculo (novo salário) | Saída        |
|--------------------------|----------------------------------|-------------------|------------------------|--------------|
| 2000                     | 10                               | (2000 / 100) * 10 = 200 | 2000 + 200 = 2200      | 2200.0       |
| 3000                     | 5                                | (3000 / 100) * 5 = 150  | 3000 + 150 = 3150      | 3150.0       |
| 1500                     | 8                                | (1500 / 100) * 8 = 120  | 1500 + 120 = 1620      | 1620.0       |

---

# Exercicio04

## Entrada de dados  

| Entrada (custo de fábrica) | Cálculo (valor do distribuidor - 28%) | Cálculo (valor dos impostos - 45%) | Cálculo (custo final)       | Saída      |
|----------------------------|--------------------------------------|-----------------------------------|----------------------------|------------|
| 20000                      | (20000 / 100) * 28 = 5600            | (20000 / 100) * 45 = 9000         | 20000 + 5600 + 9000 = 34600 | 34600.0    |
| 30000                      | (30000 / 100) * 28 = 8400            | (30000 / 100) * 45 = 13500        | 30000 + 8400 + 13500 = 51900 | 51900.0    |
| 15000                      | (15000 / 100) * 28 = 4200            | (15000 / 100) * 45 = 6750         | 15000 + 4200 + 6750 = 25950 | 25950.0    |

---

# Exercicio05

## Entrada de dados  

| Entrada (quantidade de carros vendidos) | Entrada (valor total das vendas) | Entrada (salário fixo) | Entrada (valor por carro vendido) | Cálculo (comissão por carro) | Cálculo (percentual de comissão) | Cálculo (salário final) | Saída      |
|------------------------------------------|----------------------------------|-------------------------|-----------------------------------|-----------------------------|----------------------------------|--------------------------|------------|
| 10                                       | 100000                           | 1500                    | 500                               | (500 * 10) = 5000            | 5000 * 0.05 = 250               | 250 + 5000 + 1500 = 6750 | 6750.0     |
| 5                                        | 50000                            | 1200                    | 400                               | (400 * 5) = 2000             | 2000 * 0.05 = 100               | 100 + 2000 + 1200 = 3300 | 3300.0     |
| 15                                       | 150000                           | 2000                    | 600                               | (600 * 15) = 9000            | 9000 * 0.05 = 450               | 450 + 9000 + 2000 = 11450 | 11450.0    |

---

# Exercicio06

## Entrada de dados  

| Entrada (temperatura em Celsius) | Cálculo (Fahrenheit)         | Saída          |
|----------------------------------|------------------------------|----------------|
| 0                                | (0 * 1.8) + 32 = 32          | 32.0           |
| 25                               | (25 * 1.8) + 32 = 77         | 77.0           |
| 100                              | (100 * 1.8) + 32 = 212       | 212.0          |

---

# Exercicio07

## Entrada de dados  

| Entrada (número) | Condição (número > 10?)         | Saída                     |
|------------------|---------------------------------|---------------------------|
| 5                | 5 > 10? Falso                   | NÃO É MAIOR QUE 10!       |
| 15               | 15 > 10? Verdadeiro             | É MAIOR QUE 10!          |
| 10               | 10 > 10? Falso                  | NÃO É MAIOR QUE 10!       |

---

# Exercicio08

## Entrada de dados  

| Entrada (número) | Condição (número >= 0?)         | Saída                   |
|------------------|---------------------------------|-------------------------|
| 5                | 5 >= 0? Verdadeiro              | Positivo                |
| -3               | -3 >= 0? Falso                  | Negativo                |
| 0                | 0 >= 0? Verdadeiro              | Positivo                |

---

# Exercicio09

## Entrada de dados  

| Entrada (quantidade de maçãs) | Condição (quantidade < 12?) | Cálculo (valorTotal)                  | Saída           |
|--------------------------------|-----------------------------|---------------------------------------|-----------------|
| 10                             | 10 < 12? Verdadeiro         | 10 * 1.30 = 13.0                      | Valor total: 13.0 |
| 12                             | 12 < 12? Falso              | 12 * 1 = 12.0                         | Valor total: 12.0 |
| 5                              | 5 < 12? Verdadeiro          | 5 * 1.30 = 6.5                        | Valor total: 6.5  |

---

# Exercicio10

## Entrada de dados  

| Entrada (nota 1) | Entrada (nota 2) | Cálculo (média)       | Condição (média >= 6?) | Saída                                  |
|------------------|------------------|-----------------------|------------------------|----------------------------------------|
| 7                | 6                | (7 + 6) / 2 = 6.5      | 6.5 >= 6? Verdadeiro    | O aluno foi aprovado com media: 6.5    |
| 4                | 5                | (4 + 5) / 2 = 4.5      | 4.5 >= 6? Falso         | O aluno foi reprovado com media: 4.5   |
| 6                | 6                | (6 + 6) / 2 = 6.0      | 6.0 >= 6? Verdadeiro    | O aluno foi aprovado com media: 6.0    |

---

# Exercicio11

## Entrada de dados  

| Entrada (ano atual) | Entrada (ano de nascimento) | Cálculo (idade)            | Condição (idade >= 16?) | Saída                |
|---------------------|-----------------------------|---------------------------|-------------------------|----------------------|
| 2025                | 2000                        | 2025 - 2000 = 25           | 25 >= 16? Verdadeiro     | Poderá votar         |
| 2025                | 2010                        | 2025 - 2010 = 15           | 15 >= 16? Falso          | Não poderá votar     |
| 2025                | 2008                        | 2025 - 2008 = 17           | 17 >= 16? Verdadeiro     | Poderá votar         |

---

# Exercicio12

## Entrada de dados  

| Entrada (primeiro número) | Entrada (segundo número) | Condição (primeiroNum != segundoNum?) | Sub-condição (primeiroNum > segundoNum?) | Saída                                  |
|---------------------------|--------------------------|---------------------------------------|-----------------------------------------|----------------------------------------|
| 7                         | 5                        | 7 != 5? Verdadeiro                    | 7 > 5? Verdadeiro                      | O primeiro número é maior: 7          |
| 3                         | 9                        | 3 != 9? Verdadeiro                    | 3 > 9? Falso                           | O segundo número é maior: 9           |
| 4                         | 4                        | 4 != 4? Falso                         | -                                       | Os números são iguais                 |

---

# Exercicio13

## Entrada de dados  

| Entrada (primeiro número) | Entrada (segundo número) | Condição (primeiroNum != segundoNum?) | Sub-condição (primeiroNum < segundoNum?) | Saída                        |
|---------------------------|--------------------------|---------------------------------------|-----------------------------------------|------------------------------|
| 5                         | 10                       | 5 != 10? Verdadeiro                   | 5 < 10? Verdadeiro                     | 5-10                         |
| 12                        | 7                        | 12 != 7? Verdadeiro                   | 12 < 7? Falso                          | 7-12                         |
| 8                         | 8                        | 8 != 8? Falso                        | -                                       | Os números são iguais        |

---

# Exercicio14

## Entrada de dados  

| Entrada (hora de início) | Entrada (hora do fim) | Condição (hrFim >= hrInicio?) | Cálculo do tempo total                              | Saída                  |
|--------------------------|-----------------------|-------------------------------|----------------------------------------------------|------------------------|
| 9                        | 15                     | 15 >= 9? Verdadeiro           | tempoTotal = 15 - 9                                 | Duração do jogo: 6hrs  |
| 22                       | 5                      | 5 >= 22? Falso                | tempoTotal = (24 - 22) + 5 = 2 + 5                 | Duração do jogo: 7hrs  |
| 18                       | 18                     | 18 >= 18? Verdadeiro          | tempoTotal = 18 - 18                                | Duração do jogo: 0hrs  |

---

# Exercicio15

## Entrada de dados  

| Entrada (horas trabalhadas) | Entrada (salário por hora) | Condição (hrsTrabalhadas > horasNormais?) | Cálculo das horas extras | Cálculo do salário total                             | Saída                  |
|-----------------------------|----------------------------|-------------------------------------------|--------------------------|-----------------------------------------------------|------------------------|
| 170                         | 20                         | 170 > 160? Verdadeiro                     | 170 - 160 = 10 horas extras | (160 * 20) + (10 * 30)                             | Salário total: 3400.0  |
| 150                         | 25                         | 150 > 160? Falso                          | -                        | 150 * 25                                           | Salário total: 3750.0  |
| 160                         | 15                         | 160 > 160? Falso                          | -                        | 160 * 15                                           | Salário total: 2400.0  |

---

# Exercicio16

## Entrada de dados  

| Entrada (Janeiro) | Entrada (Fevereiro) | Entrada (Março) | Cálculo da despesa total (Janeiro + Fevereiro + Março) | Cálculo da média (despesaTotal / 3) | Saída              |
|-------------------|---------------------|------------------|-------------------------------------------------------|-------------------------------------|--------------------|
| 15000             | 23000               | 17000            | 15000 + 23000 + 17000 = 55000                        | 55000 / 3 = 18333.33               | Despesa total: 55000<br>Média mensal: 18333.33 |

---

# Exercicio17

## Entrada de dados  

| Entrada (Nota Prova) | Entrada (Nota Exercicio 1) | Entrada (Nota Exercicio 2) | Entrada (Pontos Extras) | Cálculo da média parcial | Cálculo do fator de ajuste | Saída              |
|----------------------|----------------------------|----------------------------|-------------------------|--------------------------|---------------------------|--------------------|
| 7.5                  | 8.0                        | 6.5                        | 1.0                     | (((7.5 * 0.6) + ((8.0 + 6.5) / 2) * 0.4)) * 0.5 | valorMaximo / (valor)    | Media parcial: 5.4<br>Fator de ajuste: 1<br>Nota final: 7.9 |
| 8.0                  | 7.5                        | 6.0                        | 1.5                     | (((8.0 * 0.6) + ((7.5 + 6.0) / 2) * 0.4)) * 0.5 | valorMaximo / (valor)    | Media parcial: 5.7<br>Fator de ajuste: 1<br>Nota final: 8.2 |
| 9.0                  | 9.5                        | 8.0                        | 2.0                     | (((9.0 * 0.6) + ((9.5 + 8.0) / 2) * 0.4)) * 0.5 | valorMaximo / (valor)    | Media parcial: 6.8<br>Fator de ajuste: 1<br>Nota final: 9.3 |

