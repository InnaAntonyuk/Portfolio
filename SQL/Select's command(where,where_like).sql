select * from hotelsdb.clients;
use hotelsdb;
select clientName, clientNumber from clients;
select clientName, clientNumber from clients where clientName = "Maria";
select clientName, clientNumber from clients where clientName like "M%";
select clientName, clientNumber from clients where clientName like "%a";
select clientName, clientNumber from clients where clientName like "%ii%";
select clientName, clientNumber from clients where clientNumber >1;
select clientName, clientNumber from clients where clientNumber >381; 
