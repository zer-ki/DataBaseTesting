--
-- Plik wygenerowany przez SQLiteStudio v3.4.4 dnia pon. cze 12 13:18:29 2023
--
-- U¿yte kodowanie tekstu: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Tabela: table1
CREATE TABLE IF NOT EXISTS table1 (id INTEGER PRIMARY KEY, title TEXT, description TEXT);
INSERT INTO table1 (id, title, description) VALUES (1, 'title1', 'desc1');
INSERT INTO table1 (id, title, description) VALUES (2, 'title2', 'desc2');
INSERT INTO table1 (id, title, description) VALUES (3, 'title3', 'desc3');
INSERT INTO table1 (id, title, description) VALUES (4, 'title4', 'desc4');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
