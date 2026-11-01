# Using Data Persistences

# H2
* H2 is the in-memory database where the application stores within the memory

# sql
* mysql-connector-java to connect the things

# Custom configuration
we can use DataSource bean to custom configure the database 

# JDBC client
JDBC client is the one of the tools we used to call the database persistence


# Spring Data 
* Spring Data is the group pf things in Spring ecosystem for reducing boiler plate code

* Repository is the marker interface
* CrudRepository contains basic  crud operations
* PagiantionAndSortedRepository : it extends CrudRepository it has pagination and sorted available
* @Query annotation is used to provide queries
* @Param annotation to provide paramters


# Transactions
use @Transactional annotation when you want atomicity

Atomicity : Group of methods either complete or not all
