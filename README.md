# EmployeeSpringMvcRest
Employee management using spring mvc, spring data jpa, ehcache, jsp, javascript and apache tomcat.

Description:
It's an employee management system, exposed to users as both web and rest service, with which users can perform basic crud operations and also search employees filtered using fields. This code can be used to understand how spring modules can be used to create an web application with client to backend and vice 
versa dataflow.

Technologies Used:
1. Persistence - Spring data jpa with hibernate, c3po for conection pooling, mysql.
2. Spring mvc - It provides model-view-controller architecture and ready components that can be used to develop flexible and 
loosely coupled web applications and also expose rest services.
3. Caching - ehcache
4. Web Technologies - jsp, javascript
5. Server - Apache Tomcat
6. Logging - slf4j, logback-classic


Build Configuration: clean package
Run Configuration: tomcat:run -Dmaven.tomcat.port=8081

How To Run:
1. Create required database. Either use employee_database.sql or create them manually or change hibernate.hbm2ddl.auto property in application-config to create and again change it back to validate after first run.
2. Change the database properties in jdbc.properties according to your mysql.

TO-DO List: 
1. Integrate the rest api with swagger.
