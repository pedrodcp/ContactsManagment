CREATE TABLE contact (
	id INT NOT NULL,
	companyName VARCHAR(40),
	created_by VARCHAR(40),
	email VARCHAR(40),
	information VARCHAR(40),
	name VARCHAR(40),
	phone VARCHAR(12),
	updated_by VARCHAR(40)
) ENGINE=MyISAM;
ALTER TABLE contact ADD CONSTRAINT PK_contact PRIMARY KEY(id);
CREATE TABLE contact_interacao (
	Contact_id INT NOT NULL,
	interacao_id INT NOT NULL
) ENGINE=MyISAM;
ALTER TABLE contact_interacao ADD CONSTRAINT PK_contact_interacao PRIMARY KEY(Contact_id,interacao_id);
CREATE UNIQUE INDEX UK_oym0agsm3mmtpcid48ncw4vo6 ON contact_interacao (interacao_id);
CREATE TABLE interacao (
	id INT NOT NULL,
	assunto VARCHAR(100),
	created_by VARCHAR(100),
	data DATETIME,
	departamento VARCHAR(100),
	idContacto VARCHAR(100),
	resultado VARCHAR(100),
	tipo VARCHAR(40),
	updated_by VARCHAR(100)
) ENGINE=MyISAM;
ALTER TABLE interacao ADD CONSTRAINT PK_interacao PRIMARY KEY(id);
ALTER TABLE contact_interacao ADD CONSTRAINT FK_k881yf1bq3ni6t23j3waxr4a6 FOREIGN KEY (Contact_id) REFERENCES contact(id) ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE contact_interacao ADD CONSTRAINT FK_oym0agsm3mmtpcid48ncw4vo6 FOREIGN KEY (interacao_id) REFERENCES interacao(id) ON DELETE NO ACTION ON UPDATE NO ACTION;
