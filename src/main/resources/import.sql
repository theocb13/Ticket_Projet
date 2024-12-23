INSERT INTO tickets (id, titre, description, date_creation, date_maj, Impact, Etat, Utilisateur_createur, Poste_informatique, type_de_demande) VALUES
('John', 'probleme demarrage', 'ben il demarre pas', '2024-12-12 09:00:00', '2024-12-12 09:00:00', 'bloquant', 'Ouvert', 'John', 'poste3', 'Incident'),
('Alice', 'erreur application', 'l application se ferme toute seule', '2024-12-12 10:15:00', '2024-12-12 10:20:00', 'majeur', 'En cours', 'Alice', 'poste1', 'Bug'),
('Bob', 'probleme connexion wifi', 'impossible de se connecter au wifi', '2024-12-12 11:00:00', '2024-12-12 11:05:00', 'mineur', 'Ouvert', 'Bob', 'poste2', 'Support'),
('Eve', 'ecran noir', 'l ordinateur affiche un écran noir au démarrage', '2024-12-12 12:00:00', '2024-12-12 12:10:00', 'bloquant', 'Ouvert', 'Eve', 'poste5', 'Incident'),
('Tom', 'clavier ne fonctionne pas', 'certaines touches du clavier ne répondent pas', '2024-12-12 13:30:00', '2024-12-12 13:35:00', 'mineur', 'Résolu', 'Tom', 'poste4', 'Maintenance');

INSERT INTO utilisateurs (id, nom, email, mot_de_passe, date_derniere_connexion, statut, utilisateur, intervenant) VALUES
('U001', 'John Doe', 'johndoe@example.com', 'hashed_password123', '2024-12-12 08:45:00', 'Oui', '1', '0'),
('U002', 'Alice Smith', 'alicesmith@example.com', 'hashed_password456', '2024-12-11 15:30:00', 'Non', '0', '1'),
('U003', 'Bob Johnson', 'bobjohnson@example.com', 'hashed_password789', '2024-12-10 12:20:00', 'Oui', '1', '0'),
('U004', 'Eve Carter', 'evecarter@example.com', 'hashed_password101', '2024-12-12 09:00:00', 'Oui', '0', '1'),
('U005', 'Tom Wilson', 'tomwilson@example.com', 'hashed_password202', '2024-12-11 17:45:00', 'Non', '1', '0');

INSERT INTO postes_informatiques (id, utilisateur_affecte, etat, configuration) VALUES
('Poste1', 'Alice', 'en fonction', 'Processeur Intel i7, 16GB RAM, 512GB SSD, écran 15 pouces'),
('Poste2', 'Bob', 'en maintenance', 'Processeur AMD Ryzen 5, 8GB RAM, 1TB HDD, écran 17 pouces'),
('Poste3', 'John', 'en fonction', 'Processeur Intel i3, 4GB RAM, 128GB SSD, écran 13 pouces'),
('Poste4', 'Tom', 'en fonction', 'Processeur Apple M1, 16GB RAM, 256GB SSD, écran Retina 13 pouces'),
('Poste5', 'Eve', 'en commande', 'Processeur Intel i9, 32GB RAM, 1TB SSD, écran 27 pouces');
