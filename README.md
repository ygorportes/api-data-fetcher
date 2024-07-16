# API Explorer 🔎

## Descrição

Este projeto é uma aplicação Java projetada para consumir várias APIs. Ele é construído usando Spring Boot e inclui o uso do Jackson para processamento de JSON.

## Funcionalidades Atuais

- Recuperar e exibir dados de uma API de CEP.
- Recuperar e exibir dados de uma API de CNPJ.
- Design modular para adicionar mais integrações de API facilmente.

## Primeiros Passos

### Pré-requisitos

- Java 17 ou superior
- Maven
- Um token de API válido para a [API Invertexto](https://invertexto.com/).

### Instalação

1. Clone o repositório:

```bash
git clone https://github.com/ygorportes/api-explorer.git
```
```bash
cd api-data-fetcher
```
2. Configure suas variáveis de ambiente. Adicione seu token de API às variáveis de ambiente:

Para Linux ou macOS:
```bash
export API_TOKEN="?token=SEU_API_TOKEN"
```

Para Windows:
```bash
set API_TOKEN="?token=SEU_API_TOKEN"
```


3. Construa o projeto usando Maven:
```bash
mvn clean install
```

4. Execute a Aplicação.

### Contribuição
Sinta-se à vontade para contribuir com o projeto. Para isso, siga os passos abaixo:

1. Faça um fork do projeto.
2. Crie uma nova branch (git checkout -b feature-nova-funcionalidade).
3. Faça suas alterações e commit (git commit -m 'Adiciona nova funcionalidade').
4. Envie para o seu fork (git push origin feature-nova-funcionalidade).
5. Abra um Pull Request.

### Licença

Este projeto está licenciado sob os termos da licença MIT. Veja o arquivo [LICENSE](LICENSE.md) para mais detalhes.
