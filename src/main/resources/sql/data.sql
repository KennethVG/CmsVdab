INSERT INTO cms.opleiding VALUES(1,'Als Java ontwikkelaar ontwerp en onderhoud je computerprogrammas voor bedrijfstoepassingen en eindgebruikers,'
 ' in een platformonafhankelijke omgeving. Je onderzoekt de wensen van de gebruikers. Je ontwerpt en onderhoudt het programma, test het resultaat en je voorziet de nodige documentatie.'
  ' Kenmerkend voor de Java-omgeving is de enorme keuze uit softwarebibliotheken en ontwikkelingsomgevingen, waarbij in de meeste projecten meestal verschillende bibliotheken samen gebruikt worden.'
   'Javatoepassingen omvatten onder meer bedrijfstoepassingen die alle aspecten van de bedrijfsprocessen, zowel de administratieve als productiegerichte processen, kunnen behelzen. '
    'Ook e-commercetoepassingen, toepassingen voor het beheer van managements- en bedrijfsinformatie, embedded softwaretoepassingen (bvb. in mobiele telefoons, digitale televisie) '
     'kunnen met Java ontwikkeld worden. Vaak betreft het gedistribueerde applicaties, desktop- of webapplicaties die op verschillende computers draaien en via een netwerk of het internet '
      'onderling communiceren.'
      ,'Java Ontwikkelaar'
      ,'JPF;UML;Design Patterns;JDBC;HTML/CSS;XML;Maven;JUnit;Spring Fundamentals;JPA/ Hibernate;Spring Web');


INSERT INTO cms.User VALUES (1, 'Van Gijsel','kenneth.vangijsel@vdab.be','hashed_password','INSTRUCTEUR','Kenneth');
INSERT INTO cms.module (duurtijd, naam, verplicht, opleiding_id) VALUES ('25d', 'JPF', b'1', b'1');

INSERT INTO cms.opleiding_users VALUES(1,1);
INSERT INTO cms.module_verantwoordelijke_instructeurs VALUES(1,1);

INSERT INTO cms.module_doelstellingen VALUES(1,'een eigen class schrijven');