CREATE TABLE IF NOT EXISTS test_log (id INT PRIMARY KEY, message VARCHAR(255));
INSERT INTO test_log VALUES (1, 'Import script executed successfully!');

INSERT INTO tickets (id, titre, description, date_creation, date_maj, Impact, Etat, Utilisateur_createur, Poste_informatique, type_de_demande) VALUES
('John', 'probleme demarrage', 'ben il demarre pas', '2024-12-12 09:00:00', '2024-12-12 09:00:00', 'bloquant', 'Ouvert', 'John', 'poste3', 'Incident'),
('Alice', 'erreur application', 'l application se ferme toute seule', '2024-12-12 10:15:00', '2024-12-12 10:20:00', 'majeur', 'En cours', 'Alice', 'poste1', 'Bug'),
('Bob', 'probleme connexion wifi', 'impossible de se connecter au wifi', '2024-12-12 11:00:00', '2024-12-12 11:05:00', 'mineur', 'Ouvert', 'Bob', 'poste2', 'Support'),
('Eve', 'ecran noir', 'l ordinateur affiche un écran noir au démarrage', '2024-12-12 12:00:00', '2024-12-12 12:10:00', 'bloquant', 'Ouvert', 'Eve', 'poste5', 'Incident'),
('Tom', 'clavier ne fonctionne pas', 'certaines touches du clavier ne répondent pas', '2024-12-12 13:30:00', '2024-12-12 13:35:00', 'mineur', 'Résolu', 'Tom', 'poste4', 'Maintenance');