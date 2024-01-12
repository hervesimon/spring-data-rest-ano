set mode Oracle;
INSERT INTO PROGRAMME (ID, NAME, DESCRIPTION) VALUES (programme_seq.NEXTVAL, 'Programme 1', 'This is the first programme');
INSERT INTO PARTICIPANT (ID, first_name, last_name, email, phone, PROGRAMME_ID) VALUES (participant_seq.NEXTVAL, 'arthur', 'martin', 'arthur@test.fr', '123456789', 1);
INSERT INTO PARTICIPANT (ID, first_name, last_name, email, phone, PROGRAMME_ID) VALUES (participant_seq.NEXTVAL, 'françoise', 'hardy', 'françoise@test.fr', '123456788', 1);