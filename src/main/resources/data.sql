USE `lesFormulixV1`;

DELETE FROM leagues_disciplines;
ALTER TABLE leagues_disciplines AUTO_INCREMENT = 1;

DELETE FROM leagues_users;
ALTER TABLE leagues_users AUTO_INCREMENT = 1;

DELETE FROM team_members;
ALTER TABLE team_members AUTO_INCREMENT = 1;

DELETE FROM drivers;
ALTER TABLE drivers AUTO_INCREMENT = 1;

DELETE FROM leagues;
ALTER TABLE leagues AUTO_INCREMENT = 1;

DELETE FROM teams;
ALTER TABLE teams AUTO_INCREMENT = 1;

DELETE FROM disciplines;
ALTER TABLE disciplines AUTO_INCREMENT = 1;

DELETE FROM locations;
ALTER TABLE locations AUTO_INCREMENT = 1;

DELETE FROM users;
ALTER TABLE users AUTO_INCREMENT = 1;

DELETE FROM countries;
ALTER TABLE countries AUTO_INCREMENT = 1;

DELETE FROM continents;
ALTER TABLE continents AUTO_INCREMENT = 1;




INSERT INTO `users` (`active`, `admin`, `email`, `firstname`, `lastname`, `password`, `username`) VALUES
(1, 1, 'tixolf@gmail.com', 'Florian', 'Dorizon', '$2y$10$88/L0vKTYFFcvGmxBT4yx.FO.v4hIZ6ypfyvW5FIhJwqlj9s/HG.6', 'mcdoritz'),
(NULL, NULL, 'jeanbloguin@gmail.com', NULL, NULL, '$2a$10$Ugy25c5abnlAVTwJld5FZuM/VMAJAiVumlNKXnl9MAXxulk0LGiK6', 'jbloguin');



INSERT INTO `disciplines` (`name`) VALUES ('Formule 1');
INSERT INTO `disciplines` (`name`) VALUES ('NASCAR');
INSERT INTO `disciplines` (`name`) VALUES ('IndyCar');
INSERT INTO `disciplines` (`name`) VALUES ('Rallye');
INSERT INTO `disciplines` (`name`) VALUES ('Endurance');
INSERT INTO `disciplines` (`name`) VALUES ('Touring Car');
INSERT INTO `disciplines` (`name`) VALUES ('Drag Racing');
INSERT INTO `disciplines` (`name`) VALUES ('MotoGP');
INSERT INTO `disciplines` (`name`) VALUES ('Superbike');
INSERT INTO `disciplines` (`name`) VALUES ('Motocross');
INSERT INTO `disciplines` (`name`) VALUES ('Supercross');
INSERT INTO `disciplines` (`name`) VALUES ('Corgis Racing');


INSERT INTO `teams` (`id`, `creation_date`, `name`, `shortname`, `titles`) VALUES
(1, '2004-01-01', 'Oracle Red Bull Racing', 'Red Bull', 4),
(2, '1929-01-01', 'Scuderia Ferrari', 'Ferrari', 16),
(3, '2010-01-01', 'Mercedes-AMG PETRONAS F1 Team', 'Mercedes', 7),
(4, '1977-01-01', 'BWT Alpine F1 Team', 'Alpine', 2),
(5, '1966-01-01', 'McLaren Formula 1 Team', 'McLaren', 8),
(6, '1993-01-01', 'Stake F1 Team Kick Sauber', 'Kick Sauber', 0),
(7, '2021-01-01', 'Aston Martin Aramco F1 Team', 'Aston Martin', 0),
(8, '2016-01-01', 'MoneyGram Haas F1 Team', 'Haas', 0),
(9, '2024-01-01', 'Visa Cash App RB Formula One Team', 'RB', 0),
(10, '1977-01-01', 'Williams Racing', 'Williams', 9);



INSERT INTO `team_members` (`role`, `team_id`, `firstname`, `lastname`) VALUES
(1, 1, 'Christian', 'Horner'),  -- Oracle Red Bull Racing
(1, 2, 'Frédéric', 'Vasseur'),  -- Scuderia Ferrari
(1, 3, 'Toto', 'Wolff'),        -- Mercedes-AMG PETRONAS F1 Team
(1, 4, 'Bruno', 'Famin'),   -- BWT Alpine F1 Team
(1, 5, 'Andrea', 'Stella'),     -- McLaren Formula 1 Team
(1, 6, 'Alessandro', 'Alunni Bravi'), -- Stake F1 Team Kick Sauber
(1, 7, 'Mike', 'Krack'),        -- Aston Martin Aramco F1 Team
(1, 8, 'Guenther', 'Steiner'),  -- MoneyGram Haas F1 Team
(1, 9, 'Laurent', 'Mékiès'),           -- Visa Cash App RB Formula One Team (placeholder as no information is available)
(1, 10, 'James', 'Vowles');     -- Williams Racing

INSERT INTO continents (id, name) VALUES (1, 'Afrique');
INSERT INTO continents (id, name) VALUES (2, 'Amérique du Nord');
INSERT INTO continents (id, name) VALUES (3, 'Amérique du Sud');
INSERT INTO continents (id, name) VALUES (4, 'Asie');
INSERT INTO continents (id, name) VALUES (5, 'Europe');
INSERT INTO continents (id, name) VALUES (6, 'Océanie');
INSERT INTO continents (id, name) VALUES (7, 'Antarctique');

INSERT INTO `countries` (`id`, `name`, `continent_id`) VALUES
(1, 'Afghanistan', 5),
(2, 'Afrique du Sud', 1),
(3, 'Albanie', 6),
(4, 'Algérie', 1),
(5, 'Allemagne', 6),
(6, 'Andorre', 6),
(7, 'Angola', 1),
(8, 'Antigua-et-Barbuda', 2),
(9, 'Arabie saoudite', 5),
(10, 'Argentine', 3),
(11, 'Arménie', 5),
(12, 'Australie', 7),
(13, 'Autriche', 6),
(14, 'Azerbaïdjan', 5),
(15, 'Bahamas', 2),
(16, 'Bahreïn', 5),
(17, 'Bangladesh', 5),
(18, 'Barbade', 2),
(19, 'Belgique', 6),
(20, 'Belize', 2),
(21, 'Bénin', 1),
(22, 'Bhoutan', 5),
(23, 'Biélorussie', 6),
(24, 'Birmanie (Myanmar)', 5),
(25, 'Bolivie', 3),
(26, 'Bosnie-Herzégovine', 6),
(27, 'Botswana', 1),
(28, 'Brésil', 3),
(29, 'Brunei', 5),
(30, 'Bulgarie', 6),
(31, 'Burkina Faso', 1),
(32, 'Burundi', 1),
(33, 'Cambodge', 5),
(34, 'Cameroun', 1),
(35, 'Canada', 2),
(36, 'Cap-Vert', 1),
(37, 'Centrafrique', 1),
(38, 'Chili', 3),
(39, 'Chine', 5),
(40, 'Chypre', 6),
(41, 'Colombie', 3),
(42, 'Comores', 1),
(43, 'Congo (Brazzaville)', 1),
(44, 'Congo (Kinshasa)', 1),
(45, 'Corée du Nord', 5),
(46, 'Corée du Sud', 5),
(47, 'Costa Rica', 2),
(48, 'Côte d\'Ivoire', 1),
(49, 'Croatie', 6),
(50, 'Cuba', 2),
(51, 'Danemark', 6),
(52, 'Djibouti', 1),
(53, 'Dominique', 2),
(54, 'Égypte', 1),
(55, 'Émirats arabes unis', 5),
(56, 'Équateur', 3),
(57, 'Érythrée', 1),
(58, 'Espagne', 6),
(59, 'Estonie', 6),
(60, 'Eswatini', 1),
(61, 'États-Unis', 2),
(62, 'Éthiopie', 1),
(63, 'Fidji', 7),
(64, 'Finlande', 6),
(65, 'France', 6),
(66, 'Gabon', 1),
(67, 'Gambie', 1),
(68, 'Géorgie', 6),
(69, 'Ghana', 1),
(70, 'Grèce', 6),
(71, 'Grenade', 2),
(72, 'Guatemala', 2),
(73, 'Guinée', 1),
(74, 'Guinée équatoriale', 1),
(75, 'Guinée-Bissau', 1),
(76, 'Guyana', 3),
(77, 'Haïti', 2),
(78, 'Honduras', 2),
(79, 'Hongrie', 6),
(80, 'Îles Cook', 7),
(81, 'Îles Marshall', 7),
(82, 'Îles Salomon', 7),
(83, 'Inde', 5),
(84, 'Indonésie', 5),
(85, 'Irak', 5),
(86, 'Iran', 5),
(87, 'Irlande', 6),
(88, 'Islande', 6),
(89, 'Israël', 5),
(90, 'Italie', 6),
(91, 'Jamaïque', 2),
(92, 'Japon', 5),
(93, 'Jordanie', 5),
(94, 'Kazakhstan', 5),
(95, 'Kenya', 1),
(96, 'Kirghizistan', 5),
(97, 'Kiribati', 7),
(98, 'Koweït', 5),
(99, 'Laos', 5),
(100, 'Lesotho', 1),
(101, 'Lettonie', 6),
(102, 'Liban', 5),
(103, 'Libéria', 1),
(104, 'Libye', 1),
(105, 'Liechtenstein', 6),
(106, 'Lituanie', 6),
(107, 'Luxembourg', 6),
(108, 'Macédoine du Nord', 6),
(109, 'Madagascar', 1),
(110, 'Malaisie', 5),
(111, 'Malawi', 1),
(112, 'Maldives', 5),
(113, 'Mali', 1),
(114, 'Malte', 6),
(115, 'Maroc', 1),
(116, 'Îles Marshall', 7),
(117, 'Maurice', 1),
(118, 'Mauritanie', 1),
(119, 'Mexique', 2),
(120, 'Micronésie', 7),
(121, 'Moldavie', 6),
(122, 'Monaco', 6),
(123, 'Mongolie', 5),
(124, 'Monténégro', 6),
(125, 'Mozambique', 1),
(126, 'Namibie', 1),
(127, 'Nauru', 7),
(128, 'Népal', 5),
(129, 'Nicaragua', 2),
(130, 'Niger', 1),
(131, 'Nigéria', 1),
(132, 'Niue', 7),
(133, 'Norvège', 6),
(134, 'Nouvelle-Zélande', 7),
(135, 'Oman', 5),
(136, 'Ouganda', 1),
(137, 'Ouzbékistan', 5),
(138, 'Pakistan', 5),
(139, 'Palaos', 7),
(140, 'Panama', 2),
(141, 'Papouasie-Nouvelle-Guinée', 7),
(142, 'Paraguay', 3),
(143, 'Pays-Bas', 6),
(144, 'Pérou', 3),
(145, 'Philippines', 5),
(146, 'Pologne', 6),
(147, 'Portugal', 6),
(148, 'Qatar', 5),
(149, 'République centrafricaine', 1),
(150, 'République dominicaine', 2),
(151, 'République tchèque', 6),
(152, 'Roumanie', 6),
(153, 'Royaume-Uni', 6),
(154, 'Russie', 6),
(155, 'Rwanda', 1),
(156, 'Saint-Christophe-et-Niévès', 2),
(157, 'Saint-Marin', 6),
(158, 'Saint-Vincent-et-les-Grenadines', 2),
(159, 'Sainte-Lucie', 2),
(160, 'Salvador', 2),
(161, 'Samoa', 7),
(162, 'Sao Tomé-et-Principe', 1),
(163, 'Sénégal', 1),
(164, 'Serbie', 6),
(165, 'Seychelles', 1),
(166, 'Sierra Leone', 1),
(167, 'Singapour', 5),
(168, 'Slovaquie', 6),
(169, 'Slovénie', 6),
(170, 'Somalie', 1),
(171, 'Soudan', 1),
(172, 'Soudan du Sud', 1),
(173, 'Sri Lanka', 5),
(174, 'Suède', 6),
(175, 'Suisse', 6),
(176, 'Suriname', 3),
(177, 'Syrie', 5),
(178, 'Tadjikistan', 5),
(179, 'Tanzanie', 1),
(180, 'Tchad', 1),
(181, 'Thaïlande', 5),
(182, 'Timor oriental', 5),
(183, 'Togo', 1),
(184, 'Tonga', 7),
(185, 'Trinité-et-Tobago', 2),
(186, 'Tunisie', 1),
(187, 'Turkménistan', 5),
(188, 'Turquie', 5),
(189, 'Tuvalu', 7),
(190, 'Ukraine', 6),
(191, 'Uruguay', 3),
(192, 'Vanuatu', 7),
(193, 'Vatican', 6),
(194, 'Venezuela', 3),
(195, 'Viêt Nam', 5),
(196, 'Yémen', 5),
(197, 'Zambie', 1),
(198, 'Zimbabwe', 1),
(199, 'Écosse', 6),
(200, 'Irlande-du-Nord', 6),
(201, 'Pays-de-Galles', 6),
(202, 'Angleterre', 6);

INSERT INTO `locations` (`id`, `name`, `country_id`) VALUES
(1, 'Adélaïde', 12),
(2, 'Casablanca', 115),
(3, 'Bakou', 14),
(4, 'Liverpool', 153),
(5, 'Melbourne', 12),
(6, 'Austin', 61),
(7, 'Berlin-Ouest', 5),
(8, 'Sakhir', 16),
(9, 'Porto', 147),
(10, 'Longfield', 153),
(11, 'Albert Park', 12),
(12, 'Le Mans', 65),
(13, 'Greater Noida', 83),
(14, 'Las Vegas', 61),
(15, 'Montmeló', 58),
(16, 'Saint-Genès-Champanelle', 65),
(17, 'Djeddah', 9),
(18, 'Détroit', 61),
(19, 'Prenois', 65),
(20, 'Castle Donington', 153),
(21, 'Imola', 90),
(22, 'Estoril', 147),
(23, 'Dallas', 61),
(24, 'Oyama', 92),
(25, 'Montréal', 35),
(26, 'Mexico', 119),
(27, 'Hockenheim', 5),
(28, 'Mogyoród', 79),
(29, 'Indianapolis', 61),
(30, 'Tuzla', 188),
(31, 'Rio de Janeiro', 28),
(32, 'San Sebastián de los Reyes', 58),
(33, 'Jerez de la Frontera', 58),
(34, 'São Paulo', 28),
(35, 'Kyalami', 2),
(36, 'Long Beach', 61),
(37, 'Losail', 148),
(38, 'Magny-Cours', 65),
(39, 'Miami Gardens', 61),
(40, 'Lisbonne', 147),
(41, 'Monte-Carlo', 122),
(42, 'Barcelone', 58),
(43, 'Mont Tremblant', 35),
(44, 'Monza', 90),
(45, 'Mugello', 90),
(46, 'Bowmanville', 35),
(47, 'Nivelles', 19),
(48, 'Nürburg', 5),
(49, 'Buenos Aires', 10),
(50, 'Spielberg', 13),
(51, 'Le Castellet', 65),
(52, 'Pescara', 90),
(53, 'Phoenix', 61),
(54, 'Portimão', 147),
(55, 'East London', 2),
(56, 'Gueux', 65),
(57, 'Riverside', 61),
(58, 'Grand-Couronne', 65),
(59, 'Jönköping', 174),
(60, 'Sebring', 61),
(61, 'Sepang', 110),
(62, 'Shanghai', 39),
(63, 'Singapour', 167),
(64, 'Francorchamps', 19),
(65, 'Sotchi', 154),
(66, 'Suzuka', 92),
(67, 'Mimasaka', 92),
(68, 'Valencia', 58),
(69, 'Watkins Glen', 61),
(70, 'Abou Dabi', 55),
(71, 'Mokpo', 46),
(72, 'Zandvoort', 143),
(73, 'Zeltweg', 13),
(74, 'Zolder', 19),
(75, 'Hasselt', 19),
(76, 'Guadalajara', 119),
(77, 'King\'s Lynn', 202),
(78, 'Stevenage', 202),
(79, 'Madrid', 58),
(80, 'Bristol', 202),
(81, 'Oviedo', 58),
(82, 'Évreux', 65),
(83, 'Rouen', 65),
(84, 'Londres', 202),
(85, 'Fort-Lauderdale', 61),
(86, 'Perth', 12),
(87, 'Sagamihara', 92),
(88, 'Emmerich am Rhein', 5),
(89, 'Roskilde', 51),
(90, 'Nastola', 64),
(91, 'Brackley', 202),
(92, 'Enstone', 202),
(93, 'Kannapolis', 61),
(94, 'Milton Keynes', 202),
(95, 'Silverstone', 202),
(96, 'Faenza', 90),
(97, 'Maranello', 90),
(98, 'Grove', 202),
(99, 'Hinwil', 175),
(100, 'Woking', 202),
(101, 'Bremgarten bei Bern', 175),
(102, 'Ballon-Saint-Mars', 65);

INSERT INTO `drivers` (`id`, `firstname`, `lastname`, `birthdate`, `driving`, `end_of_contract`, `nicknames`, `notes`, `seasons`, `birthplace_id`, `nationality_id`, `team_id`) VALUES
(1, 'Max', 'Verstappen', '1997-09-30', 1, NULL, 'Mad Max', NULL, 1, 75, 143, 1),
(2, 'Sergio', 'Perez', '1990-01-26', 1, NULL, 'Checo', NULL, 1, 76, 119, 1),
(3, 'Charles', 'Leclerc', '1997-10-16', 1, NULL, 'Leclerc, Leclercinho, Chico', NULL, 1, 41, 122, 2),
(4, 'Carlos', 'Sainz', '1994-09-01', 1, NULL, 'The Smooth Operator, Chili', NULL, 1, 79, 58, 2),
(5, 'Lewis', 'Hamilton', '1985-01-07', 1, NULL, 'King Lewis', NULL, 1, 78, 202, 3),
(6, 'George', 'Russell', '1998-02-15', 1, NULL, 'Mr Consistency', NULL, 1, 77, 202, 3),
(7, 'Esteban', 'Ocon', '1996-09-17', 1, NULL, NULL, NULL, 1, 82, 65, 4),
(8, 'Pierre', 'Gasly', '1996-02-07', 1, NULL, NULL, NULL, 1, 83, 65, 4),
(9, 'Lando', 'Norris', '1999-11-13', 1, NULL, NULL, NULL, 1, 80, 202, 5),
(10, 'Oscar', 'Piastri', '2001-04-06', 1, NULL, NULL, NULL, 1, 5, 12, 5),
(11, 'Valtteri', 'Bottas', '1989-08-28', 1, NULL, NULL, NULL, 1, 90, 64, 6),
(12, 'Guanyu', 'Zhou', '2000-05-30', 1, NULL, NULL, NULL, 1, 62, 39, 6),
(13, 'Lance', 'Stroll', '1998-10-29', 1, NULL, NULL, NULL, 1, 25, 35, 7),
(14, 'Fernando', 'Alonso', '1981-07-29', 1, NULL, NULL, NULL, 1, 81, 58, 7),
(15, 'Kevin', 'Magnussen', '1992-10-05', 1, NULL, NULL, NULL, 1, 89, 51, 8),
(16, 'Nico', 'Hülkenberg', '1987-08-19', 1, NULL, NULL, NULL, 1, 88, 5, 8),
(17, 'Yuki', 'Tsunoda', '2000-05-11', 1, NULL, NULL, NULL, 1, 87, 92, 9),
(18, 'Daniel', 'Ricciardo', '1989-07-01', 1, NULL, NULL, NULL, 1, 86, 12, 9),
(19, 'Alex', 'Albon', '1996-03-23', 1, NULL, NULL, NULL, 1, 84, 181, 10),
(20, 'Logan', 'Sargeant', '2000-12-31', 1, NULL, NULL, NULL, 1, 85, 61, 10),
(21, 'Oliver', 'Bearman', '2005-05-08', 0, NULL, NULL, NULL, 1, 85, 5, 2);


INSERT INTO `leagues` (`id`, `acronym`, `active`, `max_users`, `name`, `owner_id`) VALUES (NULL, 'BACAF', '1', '10', 'Le Bac à Fumiers', '1');
INSERT INTO `leagues` (`id`, `acronym`, `active`, `max_users`, `name`, `owner_id`) VALUES (NULL, 'XYZLM', '1', '100', 'Ligue des Vainqueurs Francophones', '1');
INSERT INTO `leagues` (`id`, `acronym`, `active`, `max_users`, `name`, `owner_id`) VALUES (NULL, 'RSVPQ', '1', '20', 'Rassemblement des Sportifs Vaillants et Passionnés du Quotidien', '1');
INSERT INTO `leagues` (`id`, `acronym`, `active`, `max_users`, `name`, `owner_id`) VALUES (NULL, 'FROGC', '1', '50', 'Fédération des Rois et des Guerriers de la Conduite', '1');
INSERT INTO `leagues` (`id`, `acronym`, `active`, `max_users`, `name`, `owner_id`) VALUES (NULL, 'WOWIE', '1', '10', 'Week-end Olympique de la Wombat Internationale et Extraordinaire', '1');
INSERT INTO `leagues` (`id`, `acronym`, `active`, `max_users`, `name`, `owner_id`) VALUES (NULL, 'JPTSD', '1', '10', 'Joie et Plaisir des Tournois Sportifs Détendus', '1');
INSERT INTO `leagues` (`id`, `acronym`, `active`, `max_users`, `name`, `owner_id`) VALUES (NULL, 'CWLAD', '1', '10', 'Compétition des Winners et des Leaders Athlétiques et Déterminés', '1');
INSERT INTO `leagues` (`id`, `acronym`, `active`, `max_users`, `name`, `owner_id`) VALUES (NULL, 'UNQRT', '1', '10', 'Union des Navigateurs Qui Recherchent des Trésors', '1');
INSERT INTO `leagues` (`id`, `acronym`, `active`, `max_users`, `name`, `owner_id`) VALUES (NULL, 'MOCHA', '1', '10', 'Mouvement des Coureurs Habiles et Audacieux', '1');
INSERT INTO `leagues` (`id`, `acronym`, `active`, `max_users`, `name`, `owner_id`) VALUES (NULL, 'LMPAL', '1', '10', 'Ligue des Merveilles Pour les Amateurs de Loisirs', '1');
INSERT INTO `leagues` (`id`, `acronym`, `active`, `max_users`, `name`, `owner_id`) VALUES (NULL, 'SBOMB', '1', '10', 'Société des Brillants Ornithorynques Malins et Batailleurs', '1');

INSERT INTO `leagues_disciplines` (`league_id`, `disciplines_id`) VALUES ('1', '1');
INSERT INTO `leagues_disciplines` (`league_id`, `disciplines_id`) VALUES ('2', '3');
INSERT INTO `leagues_disciplines` (`league_id`, `disciplines_id`) VALUES ('2', '2');
INSERT INTO `leagues_disciplines` (`league_id`, `disciplines_id`) VALUES ('2', '7');
INSERT INTO `leagues_disciplines` (`league_id`, `disciplines_id`) VALUES ('3', '5');
INSERT INTO `leagues_disciplines` (`league_id`, `disciplines_id`) VALUES ('4', '7');
INSERT INTO `leagues_disciplines` (`league_id`, `disciplines_id`) VALUES ('5', '9');
INSERT INTO `leagues_disciplines` (`league_id`, `disciplines_id`) VALUES ('6', '2');
INSERT INTO `leagues_disciplines` (`league_id`, `disciplines_id`) VALUES ('7', '4');
INSERT INTO `leagues_disciplines` (`league_id`, `disciplines_id`) VALUES ('8', '6');
INSERT INTO `leagues_disciplines` (`league_id`, `disciplines_id`) VALUES ('9', '8');
INSERT INTO `leagues_disciplines` (`league_id`, `disciplines_id`) VALUES ('10', '10');


INSERT INTO `leagues_users` (`admin`, `score`, `league_id`, `user_id`) VALUES 
(true, 110, 1, 1);
