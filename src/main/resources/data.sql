insert into card(id, card_rank, suit)
values (1, 'TWO', 'HEARTS'),
       (2, 'THREE', 'HEARTS'),
       (3, 'FOUR', 'HEARTS'),
       (4, 'FIVE', 'HEARTS'),
       (5, 'SIX', 'HEARTS'),
       (6, 'SEVEN', 'HEARTS'),
       (7, 'EIGHT', 'HEARTS'),
       (8, 'NINE', 'HEARTS'),
       (9, 'TEN', 'HEARTS'),
       (10, 'JACK', 'HEARTS'),
       (11, 'QUEEN', 'HEARTS'),
       (12, 'KING', 'HEARTS'),
       (13, 'ACE', 'HEARTS'),
       (14, 'TWO', 'DIAMONDS'),
       (15, 'THREE', 'DIAMONDS'),
       (16, 'FOUR', 'DIAMONDS'),
       (17, 'FIVE', 'DIAMONDS'),
       (18, 'SIX', 'DIAMONDS'),
       (19, 'SEVEN', 'DIAMONDS'),
       (20, 'EIGHT', 'DIAMONDS'),
       (21, 'NINE', 'DIAMONDS'),
       (22, 'TEN', 'DIAMONDS'),
       (23, 'JACK', 'DIAMONDS'),
       (24, 'QUEEN', 'DIAMONDS'),
       (25, 'KING', 'DIAMONDS'),
       (26, 'ACE', 'DIAMONDS'),
       (27, 'TWO', 'CLUBS'),
       (28, 'THREE', 'CLUBS'),
       (29, 'FOUR', 'CLUBS'),
       (30, 'FIVE', 'CLUBS'),
       (31, 'SIX', 'CLUBS'),
       (32, 'SEVEN', 'CLUBS'),
       (33, 'EIGHT', 'CLUBS'),
       (34, 'NINE', 'CLUBS'),
       (35, 'TEN', 'CLUBS'),
       (36, 'JACK', 'CLUBS'),
       (37, 'QUEEN', 'CLUBS'),
       (38, 'KING', 'CLUBS'),
       (39, 'ACE', 'CLUBS'),
       (40, 'TWO', 'SPADES'),
       (41, 'THREE', 'SPADES'),
       (42, 'FOUR', 'SPADES'),
       (43, 'FIVE', 'SPADES'),
       (44, 'SIX', 'SPADES'),
       (45, 'SEVEN', 'SPADES'),
       (46, 'EIGHT', 'SPADES'),
       (47, 'NINE', 'SPADES'),
       (48, 'TEN', 'SPADES'),
       (49, 'JACK', 'SPADES'),
       (50, 'QUEEN', 'SPADES'),
       (51, 'KING', 'SPADES'),
       (52, 'ACE', 'SPADES');

-- this is temp. should be deleted after developing player api

insert into player(id, username, password)
values (1, 'user', '1234');

insert into credit(id, player_id, credit)
values (1, 1, 100);


