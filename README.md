### Basic Working Project with 
#### 1. URL ReWrite @Joint annotation.
#### 2. SpringBoot, PrimeFaces
#### 3. http://localhost:8080/product, http://localhost:8080/single?value=2, http://localhost:8080/

<br/>

#### Add this in command line during startup

```
spring-boot:run -f pom.xml
```
#### Add this for stopping at debug point
```
in VM option under 'Runner' configuration
-Dspring-boot.run.fork=false
```

<br/>

###pom.xml
````
This is good for Start/run of SpringBoot project -  Maven plugin

<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
</plugin>
````

```
ReWrite - annotation works as well.
This is not JSF related ReWrite but JavaEE related 

<dependency>
    <groupId>org.ocpsoft.rewrite</groupId>
    <artifactId>rewrite-servlet</artifactId>
    <version>${rewrite-servlet.version}</version>
</dependency>
<dependency>
    <groupId>org.ocpsoft.rewrite</groupId>
    <artifactId>rewrite-integration-faces</artifactId>
    <version>${rewrite-servlet.version}</version>
</dependency>
<dependency>
    <groupId>org.ocpsoft.rewrite</groupId>
    <artifactId>rewrite-config-prettyfaces</artifactId>
    <version>${rewrite-servlet.version}</version>
</dependency>
```
<br/>
<br>

```
mojarra Implementation of JSF

<dependency>
    <groupId>com.sun.faces</groupId>
    <artifactId>jsf-api</artifactId>
    <version>2.2.12</version>
</dependency>
<dependency>
    <groupId>com.sun.faces</groupId>
    <artifactId>jsf-impl</artifactId>
    <version>2.2.12</version>
</dependency>

Note:
Following dependencies are coming as default with 'jsf-impl':
javax.servlet            » javax.servlet-api
javax.servlet.jsp        » javax.servlet.jsp-api
javax.servlet.jsp.jstl   » jstl-api

Note: 
Another imlpementation of JSF is myFaces,
which also needs JavaEE depenendency as well other than jsf-impl.
I decide to use Moharra now since regular jsf-impl is enough.
```

```
From above: javax.servlet » javax.servlet-api

It needs to be 'provided'(meaning we are adding externally on top of our server, which is tomcat)

<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>3.1.0</version>
    <scope>provided</scope>
</dependency>
```
<br/>
<br/>

### application.properties
```
#For Postgres vendor
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

#For Logs enable:
logging.config=classpath:logback.xml
logging.level.org.springframework.web=ALL

#Not sure what it does 
server.error.include-stacktrace=always

#This will show error on web page, and not show whitelable page.
server.error.whitelabel.enabled=false

#this fixed 1 null pointer during startup
spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults=false

#I think this is printing logs twice for queries
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.show-sql=true

#Create DB first in PgAdmin as 'productOAuth0
spring.datasource.url=jdbc:postgresql://localhost:5432/productOAuth0?default_database=productOAuth0


```

###Follow this project for Joint 
/Users/Manjul/IdeaProjects/control-route-optimizer

###Information realted to ReWrite
```
@Join(path="/path", to="toJsf")
Query variable will have @Deferred and @Parameter
SetVariable(variable) will be called first.

@ElResolver, @Scope(""), @Component are required field.
```

###Security 
```
This project may not be enough
/Users/Manjul/Downloads/ProductManagerGoogleLogin 

```




