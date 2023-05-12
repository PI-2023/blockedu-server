# Microsserviço da Blockchain

Este é o microsserviço responsável pela implementação da blockchain utilizada no sistema de emissão de certificados das instituições de ensino. Ele é responsável por gerenciar a criação de blocos, validar a cadeia, verificar o consenso e garantir a segurança das transações.

## Funcionalidades

- **Criação de Blocos**: O microsserviço é responsável por criar blocos que contêm as transações de certificados emitidos pelas instituições de ensino. Cada bloco possui um hash que o identifica unicamente e é vinculado ao bloco anterior.
- **Validação da Cadeia**: O microsserviço valida a cadeia de blocos, verificando se cada bloco está corretamente encadeado com o bloco anterior, garantindo a integridade e imutabilidade dos certificados registrados.
- **Verificação de Consenso**: O microsserviço verifica o consenso da blockchain, garantindo que todos os participantes tenham uma cópia consistente da cadeia de blocos e concordem com sua validade.
- **Segurança das Transações**: O microsserviço utiliza técnicas criptográficas para proteger as transações de certificados, garantindo a confidencialidade, integridade e autenticidade dos dados registrados na blockchain.

## Configuração e Execução

Para executar o microsserviço da Blockchain, siga as instruções abaixo:

### Pré-requisitos

- Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.
- Verifique se todas as dependências necessárias estão instaladas corretamente.

### Configuração

- Configure as informações de conexão com o banco de dados no arquivo de configuração correspondente.
- Defina as configurações de segurança, como algoritmos de criptografia e chaves de assinatura.

### Execução

- Execute o microsserviço de acordo com o ambiente de desenvolvimento escolhido.
- Certifique-se de que o serviço está sendo executado na porta correta.

### Testes

- Execute os testes unitários disponíveis para garantir o funcionamento correto das funcionalidades da blockchain.
- Verifique se a criação de blocos, validação da cadeia e verificação de consenso estão operacionais.

## Atenção

Nota: Certifique-se de ter os microsserviços de Emissão de Certificados e de Blockchain configurados e em execução corretamente para garantir o funcionamento adequado do sistema como um todo.
