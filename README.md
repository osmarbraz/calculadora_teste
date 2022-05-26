[![Github Actions Status for osmarbraz/calculadora_teste](https://github.com/osmarbraz/calculadora_teste/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/osmarbraz/calculadora_teste/actions) 
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=calculadora_teste&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=calculadora_teste)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=calculadora_teste&metric=coverage)](https://sonarcloud.io/component_measures?id=calculadora_teste&metric=coverage)

# Exemplo de Pipeline de CI.

Utiliza 3 ambientes:
- dev - Desenvolvimento
- hmg - Homologação
- prd - Produção

Pipeline 
- dev - Compilação e testes.
- hmg - Análise e cobertura de código.
- prd - Empacotamento.

<br>
- O projeto foi desenvolvido no NetBeans deve ser chamado calculadora_teste.<br>
- Utiliza o Apache Maven para a automatização da construção.<br>
- A pasta test contêm os testes unitários do projeto utilizando JUnit 4.<br>
- A cobertura do código é realizada através do JaCoCo.<br>