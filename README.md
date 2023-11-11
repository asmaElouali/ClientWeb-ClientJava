#🚀  Projet avec l'architecture de Serveur Jboss WildFly et client web et client java 🚀

📋 Presentation de projet 📋 
 
     💡 Ce projet est un état d'avancement de la gestion des étudiants et des filières. Il présente l'architecture entre le serveur JBoss WildFly et les clients Java et Web qui 
    communiquent entre eux par les protocoles de communication RMI et HTTP. RMI est utilisé pour la communication entre le serveur et le client Java, tandis que HTTP est utilisé
    pour la communication entre le serveur et le client Web  💡

💻Technologies de projet 💻

   📡 Java RMI (Remote Method Invocation) :
    
        Utilisé pour la communication entre le client Java et le serveur Java.
        Permet d'appeler des méthodes sur des objets distants.
     
   🔄 Servlets :

         Utilisés pour développer des composants côté serveur dans une application Java.
         Souvent utilisés pour traiter des requêtes HTTP dans le contexte de serveurs web Java comme Apache Tomcat.

   🧑‍💻JavaServer Pages (JSP) :

        Une technologie qui simplifie le développement des interfaces utilisateur côté serveur en Java.
        Permet d'intégrer du code Java directement dans des pages HTML.


   🌐 Enterprise JavaBeans (EJB) :

        Une technologie Java pour le développement de composants côté serveur.
        Fournit une architecture pour le développement distribué et la gestion des transactions.


   🛢️ Bases de données :

         MySQL : Bases de données relationnelles couramment utilisées.
         Jdbc : une API (Interface de Programmation d'Application) Java qui permet aux programmes Java d'interagir avec des bases de données relationnelles.

   💬 Protocoles de communication :

        HTTP: Protocoles fondamentaux pour la communication web.
        RMI : Protocole pour la communication distancielle.

  ☕🚀Langage de programation :
        
        Java :  un langage de programmation de haut niveau et une plateforme informatique qui a été développée par Sun Microsystems (maintenant propriété d'Oracle Corporation).

🛠️L'architecture de projet 🛠️

   ![Architecture](https://github.com/asmaElouali/ClientWeb-ClientJava/assets/127212498/e94cf1a8-9299-4c1a-841e-af1a61978e35)




🧐 Description de l'architecture 🧐🤖

    🖥️ Cette architecture est basée sur les technologies J2EE et utilise un serveur d'application JBoss Wildfly. L'application est composée de trois couches : Web Container, EJB 
     Container et JPA Container.🖥️

     🌐Web Container : Cette couche gère les interactions avec les clients via le protocole HTTP. Les servlets et les JSPs sont utilisés pour gérer les requêtes HTTP et les 
       réponses respectives. Les servlets sont utilisés pour gérer les demandes du client, tandis que les JSPs sont utilisés pour créer des pages HTML dynamiques.

     🌐EJB Container : Cette couche gère la logique métier de l'application. Les beans d'entreprise sont utilisés pour implémenter la logique métier et sont accessibles par le 
     client via les interfaces du bean d'entreprise. Les beans d'entreprise peuvent être stateless, stateful ou singleton.🌐

     JPA Container : Cette couche est utilisée pour la persistance des données. La JPA (Java Persistence API) est utilisée pour interagir avec la base de données. La configuration 
     de la persistance est définie dans le fichier persistence.xml. L'implémentation JPA utilisée est Hibernate.

     Le client web communique avec le serveur d'application en utilisant des services web RESTful ou SOAP. Le serveur d'application gère les transactions en utilisant le JTA (Java 
     Transaction API). Les connexions aux bases de données sont gérées par le JTA Data Source.

     Le client web et le serveur d'application communiquent également via JNDI (Java Naming and Directory Interface) pour accéder aux beans d'entreprise.

     📑En résumé, cette architecture permet de séparer la logique métier, la logique de présentation et la persistance des données. Les couches sont indépendantes et peuvent être 
     développées, testées et déployées séparément. Les services web sont utilisés pour communiquer avec le serveur d'application et le protocole HTTP est utilisé pour les 
     interactions entre le client et le serveur.📑



  🎥Demo 🎥 Client Web


[Screen Recording - Made with FlexClip (1).webm](https://github.com/asmaElouali/ClientWeb-ClientJava/assets/127212498/9d8267d1-4691-460b-99a0-35edd47e94c9)



 🎥Demo 🎥 Client Java



[Screen Recording - Made with FlexClip (2).webm](https://github.com/asmaElouali/ClientWeb-ClientJava/assets/127212498/a46ef4db-1839-44ea-9462-7f01d0e9c703)
































  

    
   
      
    
    
