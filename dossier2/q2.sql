create table client(
numero_identification number, 
nom varchar2(50),
prenom varchar2(50),
code_secret varchar2(50),
solde_en_compte number, 
constraint pk_client primary key(numero_identification)
);