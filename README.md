# Behavioral Design Patterns for Java

This repository will be introduced the structural GOF design patterns for Java. The patterns are:

- Chain of Responsibility - Create a chain, where each object decides whether to process or transmit to another element of the chain.  Usage Examples: When you need to execute different requests differently, whereas such possibilities are not known in advance.
- Command - Allows you to create commands to queued for transaction flow control and enable rollback. Usage Examples: When you need this object to be used to encapsulate all the information necessary to perform the action or trigger the event.
- Iterator - This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation. Usage examples: When you have to go through a collection of objects without knowing their data structure.
- Mediator is a behavioral design pattern that reduces coupling between components of program by making them communicate indirectly, through a special mediator object.
- Observer - Allows one objects to notify other objects about changes in their state. **Usage examples** when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically.