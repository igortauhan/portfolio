## Portfolio

### Arquivos

#### Backend

```
|           # Source code
|__src/main/java/.../portfolio
|
|           # Profiles
|__src/main/resources
|
|           # Migrations
|__src/main/resources/db/migration
```

### Configuração do Backend

- Deve ser criado uma variável de ambiente com o nome **FRONTEND_URL** com o valor da URL do frontend. É necessário pois por padrão o CORS está configurado para permitir requests do domínio do frontend.
- Deve ser criado uma variável de ambiente com o nome **SECURITY_USER** e **SECURITY_PASS** para configuração do user default do projeto. Como o projeto possui apenas endpoints de GET para o portfolio, e que não requer autenticação, a utilização do user default está opcional.
- Ajuste no backend dentro do diretório `src/main/resources/db/migration` os dados que a migration irá inserir. As mudanças devem ser feitas desde o primeiro *insert* na linha 58 do Script.

### Configuração do Frontend

- Deve ser ajustado o valor dos campos **backendUrl** dentro do diretório `src/environment` nos dois arquivos de environment.
