drop table mycontacts;

create table mycontacts(
name VARCHAR(20),
phoneno INTEGER NOT NULL UNIQUE,
emailid VARCHAR(40),
city VARCHAR(15)
);


insert into mycontacts values('sri', 9700481481, 'sricharan245@gmail.com', 'jagtial');
insert into mycontacts values('charan', 9160345841, 'bsricharan305@gmail.com', 'jagtial');
insert into mycontacts values('jeevan', 1234567890, 'jeevanjio@gmail.com', 'nsrpt');
insert into mycontacts values('sairam', 0987654321, 'sairamt@gmail.com', 'tenali');