[![Github Actions Status for osmarbraz/figuras_teste](https://github.com/osmarbraz/figuras_teste/workflows/Integra%C3%A7%C3%A3o%20continua%20de%20Java%20com%20Maven/badge.svg)](https://github.com/osmarbraz/figuras_teste/actions) 
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=calculadora_teste&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=calculadora_teste)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=calculadora_teste&metric=coverage)](https://sonarcloud.io/component_measures?id=calculadora_teste&metric=coverage)

# Exemplo de Pipeline de CI.

Utiliza 3 ambientes:
- dev - Desenvolvimento
- hmg - Homologação
- prd - Produção

Pipeline 
- dev - Compilação 
- hmg - Compilação, Testes, Análise Código, Cobertura Código
- prd - Empacotamento
