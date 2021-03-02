CREATE TABLE Authentification_System (
LoginID NUMBER(4),
Password VARCHAR(50),
PRIMARY KEY(LoginID));

CREATE TABLE Librarian(
AdminID NUMBER(4) PRIMARY KEY,
Password VARCHAR(50) NOT NULL,
FirstName VARCHAR(50) NOT NULL,
LastName VARCHAR(50) NOT NULL,
Address VARCHAR(50),
PhoneNo NUMBER(12),
CONSTRAINT fk_Librarian_AuthSys FOREIGN KEY (AdminID) REFERENCES Authentification_System(LoginID)
);

CREATE TABLE Member(
UserID NUMBER(4) PRIMARY KEY,
Password VARCHAR(50) NOT NULL,
Address VARCHAR(50),
Firstname VARCHAR(25),
Lastname VARCHAR(25),
PhoneNo VARCHAR(15),
Profession VARCHAR(20),
CONSTRAINT fk_Member_AuthSys FOREIGN KEY (UserID) REFERENCES Authentification_System(LoginID)
);

CREATE TABLE Items(
ISBN NUMBER(10) PRIMARY KEY,
AuthNo NUMBER(4),
Title VARCHAR(50),
Edition VARCHAR(50),
Category VARCHAR(50),
Price NUMBER(4),
CONSTRAINT fk_Items_Author FOREIGN KEY (AuthNo) REFERENCES Author(AuthorID)
);

CREATE TABLE Reservations(
ReservationNo NUMBER(4) PRIMARY KEY,
ReserveDate DATE,
ReturnDate DATE,
Duration NUMBER(2),
Fees NUMBER(2),
ISBN NUMBER(4),
UserID NUMBER(4),
AdminID NUMBER(4),
CONSTRAINT fk_Reservations_Member FOREIGN KEY (UserID) REFERENCES Member(UserID),
CONSTRAINT fk_Reservations_Items FOREIGN KEY (ISBN) REFERENCES Items(ISBN),
CONSTRAINT fk_Reservations_Librarian FOREIGN KEY (AdminID) REFERENCES Librarian(AdminID)
);

CREATE TABLE Author(
AuthorID NUMBER(4) PRIMARY KEY,
YearOfPub NUMBER(4),
Name VARCHAR(25)
);


/*
CREATE TABLE Reports(
ReportNo NUMBER(4) PRIMARY KEY,
UserID NUMBER(4),
ISBN NUMBER(10),
ReturnDate DATE NOT NULL,
IssueDate DATE NOT NULL,
Duration NUMBER(2),
Fees NUMBER(2),
CONSTRAINT fk_Readers_Reports FOREIGN KEY (UserID) REFERENCES Readers(UserID),
CONSTRAINT fk_Books_Reports FOREIGN KEY (BookNo) REFERENCES Books(ISBN),
CONSTRAINT fk_Staff_Reports FOREIGN KEY (StaffID) REFERENCES Staff(StaffID)
);*/


DROP TABLE Authentification_System;
DROP TABLE Librarian;
DROP TABLE Member;
DROP TABLE Items;
DROP TABLE Author;
DROP TABLE Reservations;





