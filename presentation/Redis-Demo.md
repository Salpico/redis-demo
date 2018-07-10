# Redis Demo

![](http://download.redis.io/logocontest/82.png)

### Von Bengt Claas Rhodgeß und Marc-Niclas Harm

---

# Gliederung

- Von wem kommt das :question:
- Was ist/macht das :question:
- Wozu ist das geeignet :question:
- DEMO :raised_hands:

---

# Von wem kommt das :question:

- **2009** von **Salvatore Sanfilippo** entwickelt 
  - Open Source Software Entwickler aus Italien
- Geschrieben in `C`
- Name kommt von *remote dictionary server*

---

# Was ist/macht das :question:

- **In-Memory-Datenbank** mit **Key-Value-Store**
  - Maximale Größe für Key/Value `512 MB`
  - Laut DB-Engines.com der Verbreitetste
- Gehört zu den **NoSQL-Datenbanken**
- einfache Datenstruktur :arrow_right: dadurch sehr schnell
- Regelmäßiges Abspeichern (Persistenz)
  - **ACID**-konforme Dauerhaftigkeit per Konfiguration möglich
- Einige der unterstützten Datenstrukturen:
  - Strings, Hashes, Lists, Sets, ...

---

# Wozu ist das geeignet :question:

- **Session Cache**
  - Sessions können gespeichert werden (im Gegensatz zu anderen Lösungen)
  - Temporäre Speicherung ist möglich

---

# Wozu ist das geeignet :question:

- **Queues**
  - Als **Message Queue** einsetzbar, da schnell viele Nachrichten gespeichert werden können
 
---

# Wozu ist das geeignet :question:

- **Pub/Sub** *Publish-subscribe* Pattern
  - `SUBSCRIBE` und `PUBLISH` als native Befehle verfügbar

---

# DEMO :boom:

---

# Quellen :copyright:

- [Wikipedia](https://de.wikipedia.org/wiki/Redis)
- [ObjectRocket](https://www.objectrocket.com/blog/how-to/top-5-redis-use-cases/)
- [GitHub](https://github.com/antirez/redis)

---

# Danke für die Aufmerksamkeit :exclamation: