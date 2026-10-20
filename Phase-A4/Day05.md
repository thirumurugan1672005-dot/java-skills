# Daemon Threads 

Daemon Threads are threads which helps to other threads 

setDaemon(true) to set thread as daemon before start() method call 

This threads are not important so when all the user threads dies jvm simply ignores and terminates it


# Thread Name

Thread Names are useful for locating which thread is running.

setName() set the name of thread 
getName() get the name of thread 

# Thread Priorties

* Priority is just machine dependent . Thread takes priority of its parent
* But Linux based operating systems just ignore it
* Priorities are not used nowDays
* setPriority() is used to set the priority of thread
