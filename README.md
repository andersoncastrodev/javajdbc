- Mini curd usando JDBC e java. 
- Banco de dados mysql 8
- Nome do banco de dados: bdjdbc
- Tabela criada:

-- DDL generated by DBeaver
-- WARNING: It may differ from actual native database DDL
CREATE TABLE bdjdbc.cliente (
	codigo BIGINT NOT NULL,
	nome VARCHAR(100) NULL,
	telefone VARCHAR(15) NULL
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

