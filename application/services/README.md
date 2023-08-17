## Services

This directory contains the services that are used by the application. 
These services are used to interact with the database and perform business logic.

It's important to notice the split inside of the service component between the service interface (api) and the service implementation (internal).
This allows us to have a clear separation between the contract that we expose to the outside world and the implementation details.

**_IMPORTANT_**: Given the way that the application is build, the services api is mandatory to be defined in the service component.

**_IMPORTANT_**: The services will not depend on any other higher level components (like controllers or container).

**_IMPORTANT_**: The services component will depend on other lower level components (like database - entities) 
and will make use of it in order to fully implement the domain business logic.

One thing that I usually do is have the service api data as immutable data structures. This is not mandatory, but it's a good practice to have.