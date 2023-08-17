## Controllers

This module is called controllers because it contains the controllers of the application.
Even though this is not necessarily the best naming it was chosen to better explain the purpose of this module.
Probably a better naming would've been `web` or `http`.

At the same layer with controllers you can have modules for other protocols like `cli` or `rpc`.
This can be viewed as a way to separate the application in different interfaces in a similar way to how hexagonal architecture works.

**_IMPORTANT_**:  The controllers module is:
- responsible for the data transformation between the external world and the application.
- responsible for the input validation and for the output formatting.
- does not contain any business logic.
- is owner of the data transfer objects (DTOs) used to communicate with the external world.
- is owner of the conversion between lower layers data type and DTOs.

