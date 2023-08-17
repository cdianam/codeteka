# codeteka-chat

this repository will serve as a starting point for next codeteka java projects.

The structure of the project is based on module oriented layered architecture. This mean that each classic layer from the layered architecture is a module.
The main advantage that this brings is that it will force us into keeping good engineering practices and it will make it a little bit easier to split work between multiple people. 

# Structure

Each layer is splitted into 2 moudules, api and internal, where the api layer is the public interface that can be consumed by other layers or applications while the internal module 
represents the implementation of the api and should remain private. The only other module that should have dependency to the internal modules is the **container**. 

## Application

The core is the application folder. Here we can find the 3 layers that compose this application and the container that glues everything togheter. 

### Controllers

Is the classic controller layer. It's role is to respond to Rest requests. This layer is composed out of 2 modules, api and internal.

The **api module** represents the contract that we put out to the world, in this specific case the rest endpoints that can be consumed. 
We've chosen to do the api module using [open api](https://www.openapis.org/) so that we can generate sdk for clients if that's the case.

The internal layer is nothing more than the implementation of the api using spring web module. 

### Services

In this layer we should contain most of the application business logic. Similar to controllers this layer is splited into 2 modules (api, internal)

The api module is that contract that is used by the controllers layer in order to implement the desired functionality. 
Here we should find the domain objects and the validations imposed by the business.

The internal module is the actual implementation of the contracts(interfaces) declared in the api module. Here we should be able to coordinate the with the entities layer 
in order to implement the full functionality requeired by the app. 

### Entities

This represents the data access layer of our application. The modules and logic is the same as the layer above where the api module declares the methods that we can call 
while the internal layer lavreges spring data and hibernate in order to communicate with our database. Because this layer is in charge of communication with the DB here we can 
also find the liquibase scripts that will make changes to our DB schema and potentialy insert default data if it's needed. 


## buildSrc

buildSrc serves as a dependencie configuration repository. This will allow us to easily increase version in multiple modules by making updates into a single place. 

## Miscellaneous

Besides the folders that make up the application we can also find a compose file that delcares the infra that we need in order to run the app. The containers are automatically started when the application is started.
Settings.gradle is the place where all the modules that compose the application are declared so that the IDE and gradle knows what it should index and build. 
