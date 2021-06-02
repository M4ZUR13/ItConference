# ItConference
Uruchomienie projektu:program startowany jest poprzez SIIZadanieApplication. Dostęp do bazy h2: localhost:8080/h2-console. Login to "sa", hasło to "password". Zapytania REST api wykonywałem w programie Postman. Przykładowe URL:

POST http://localhost:8080/users po wpisaniu w body wartości paramterów login, email, sciezka i idPrelekcji użytkownik zostaje dodany do bazy

GET http://localhost:8080/users wyświetla wszystkich użytkowników

DELETE http://localhost:8080/users/{id} po wpisaniu id użytkownika, zostaje on usunięty z bazy

GET http://localhost:8080/users/{login} po wpisaniu loginu użytkownika, wyświetlone zostają prelekcje, na które się zapisał
