create database HotelsDB;
 use HotelsDB;
 
 Create table Cities
 (
 cityID int primary key not null auto_increment,
 cityName varchar (20)
 );
 
 create table Hotels
 (
 hotelID int primary key not null auto_increment,
 hotelName varchar(20),
 startCounts int not null,
 creationData date,
 cityID int,
 foreign key (cityID) references Cities(cityID)
 );
 
 create table Rooms
 (
 roomID int primary key not null auto_increment,
 comfortLevel varchar(20),
 hotelID int,
 foreign key (hotelID) references Hotels(hotelID)
 );
 
 create table Clients
 (
 clientID int primary key not null auto_increment,
 clientName varchar (20),
 clientNumber long
 );
 
 create table Ordersrooms
 (
 orderID int primary key not null auto_increment,
 clientID int,
 roomID int,
 foreign key (clientID) references Clients(clientID),
 foreign key (roomID) references Rooms(roomID)
 );