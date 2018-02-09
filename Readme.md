JNetWorksTest

JDK 8, Spring DataJPA, Spring Boot, H2, Maven

timestamp не переводил в "человеческое" время 
(java.util.Date time=new java.util.Date((long)timeStamp*1000); 
либо ручным запросом mysql> SELECT t_create, DATE_FORMAT(t_create,'%Y-%m-%d %T') FROM tsdemo2;)