CREATE TABLE candidato(
   candidato_id   INT    NOT NULL AUTO_INCREMENT,
   candidato_nome VARCHAR (20)     NOT NULL,
   candidato_email VARCHAR (20)     NOT NULL,
   candidato_telefone VARCHAR (15)     NOT NULL,
   candidato_experiencia VARCHAR (100)     NOT NULL,     
   PRIMARY KEY (candidato_id)
);
