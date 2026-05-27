INSERT INTO trabalhador (nome, cargo) VALUES ('Ana Silva',    'DESENVOLVEDOR');
INSERT INTO trabalhador (nome, cargo) VALUES ('Bruno Costa',  'GERENTE');
INSERT INTO trabalhador (nome, cargo) VALUES ('Carla Mendes', 'DESENVOLVEDOR');
INSERT INTO trabalhador (nome, cargo) VALUES ('Diego Rocha',  'VENDEDOR');
INSERT INTO trabalhador (nome, cargo) VALUES ('Elisa Torres', 'ADMINISTRADOR');

INSERT INTO habilidade (trabalhador_id, nome) VALUES (1, 'Java');
INSERT INTO habilidade (trabalhador_id, nome) VALUES (1, 'SQL');
INSERT INTO habilidade (trabalhador_id, nome) VALUES (2, 'Gestão de Equipes');
INSERT INTO habilidade (trabalhador_id, nome) VALUES (3, 'Java');
INSERT INTO habilidade (trabalhador_id, nome) VALUES (3, 'React');
INSERT INTO habilidade (trabalhador_id, nome) VALUES (4, 'Vendas');
INSERT INTO habilidade (trabalhador_id, nome) VALUES (4, 'CRM');
INSERT INTO habilidade (trabalhador_id, nome) VALUES (5, 'Excel');
INSERT INTO habilidade (trabalhador_id, nome) VALUES (5, 'Financeiro');

INSERT INTO escala (trabalhador_id, dia_semana, hora_inicio, hora_fim) VALUES (1, 'SEGUNDA', 8.0, 12.0);
INSERT INTO escala (trabalhador_id, dia_semana, hora_inicio, hora_fim) VALUES (1, 'TERCA',   8.0, 12.0);
INSERT INTO escala (trabalhador_id, dia_semana, hora_inicio, hora_fim) VALUES (2, 'SEGUNDA', 13.0, 18.0);
INSERT INTO escala (trabalhador_id, dia_semana, hora_inicio, hora_fim) VALUES (3, 'QUARTA',  8.0, 12.0);
INSERT INTO escala (trabalhador_id, dia_semana, hora_inicio, hora_fim) VALUES (4, 'SEXTA',   13.0, 18.0);
INSERT INTO escala (trabalhador_id, dia_semana, hora_inicio, hora_fim) VALUES (5, 'QUINTA',  8.0, 18.0);