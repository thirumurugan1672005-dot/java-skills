# Local Dates and time 

# Timeline

* Fundamental unit of time is second
* one day has 86400 seconds
* In 1967 Precise defintion is made from caesium and then official atomic clocks born

* 1972 leap seconds was found (leap second : second might need be removed once in a while)
* But most computers just slow down or speed up on before reaching leap second


# Instant 
* Instant represents the instant of class
* it was calculated from epoch 1 jan 1970
* Instant.min : billion years past
* Instant.max : 1 jan 1billion
* it is immutable

```java
package simple;

import java.time.Instant;

public class Main {
	
	public static void main(String... args)  {
		
	     Instant instant = Instant.now();
	     System.out.println(instant.EPOCH);
	     System.out.println(instant);
	     
	     Instant ins1 = instant.plusMillis(100);
	     System.out.println(ins1);
	     
	     Instant ins2 = instant.minusMillis(100);
	     System.out.println(ins2);
	     
	     
	     Instant ins3 = instant.plusNanos(10);
	     Instant ins4 = instant.minusNanos(10);
	     
	     System.out.println(ins3+" "+ins4);
	     
	     Instant ins5 = instant.plusSeconds(10);
	     Instant ins6 = instant.minusSeconds(10);
	     
	     System.out.println(ins5+" "+ins6);
	     
	     
	}
}

```

# Duration
* Amount of time between two intervals

```java
 
	    Instant i1 = Instant.now();
	    Instant i2 = i1.plusSeconds(10);
	    i2 = i2.plusNanos(100);
	    Duration d1 = Duration.between(i1, i2);
	    
	    System.out.println(d1.getSeconds());
	    System.out.println(d1.getNano());
	    System.out.print(d1);
```



