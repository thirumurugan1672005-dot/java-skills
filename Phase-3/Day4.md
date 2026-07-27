# Predefined Class - 2

# Why Date class not a data type like other languages?
 * There are different representation in different parts of world
 * Date represents the point of time
 * For Each Representation we need seperate class it is good idea.
 * There so many Calendars used around the world Georgian Calendar is common own.
 * Some Represent MM/DD/YYYY while some represent DD/MM/YYYY and few YYYY/MM/DD
# LocalDate

There is also another way to crate objects using utility methods

```java
LocaleDate date1 = LocaleDate.now(); //  today's date
LocaleDate date2 = LocaleDate.of(2001,12,31); // date of paritcular day
```

```java

int year = date2.getYear();
int month = date2.getMonthValue();
int day = date2.getDayOfMonth();
```

# Mutator and Accessor Methods

Accessor Methods : Accessor Methods used to Access values 

For example : getMonthValue() access and not mutate

Mutator Methods : Mutator Methods mutate methods which change state.

For example : GeorgianCalendar calendar class 

```java
GregorianCalendar someDay = new GregorianCalendar(1999, 11, 
31);
someday.add(Calendar.DAY_OF_MONTH,1000);  // mutate methods
```

Non Mutator Methods : These Methods does not mutate it

```java
LocalDate date = LocalDate.now();
LocalDate dayAfterThousand = date.plusDays(1000); 
```
It return LocalDate object but  not mutate existing object.

```java
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Main{
    public static void main(String[] args){
        
        int year = 2027;
        for(int month = 1;month<=12;month++){

            LocalDate localDate = LocalDate.of(year,month,1);

            System.out.println(localDate.getMonth().toString().toUpperCase());
            
            int value = localDate.getDayOfWeek().getValue();
            for(int i=1;i<value;i++){
                 System.out.print("   ");
            }
            while(localDate.getMonthValue() == month){
                 System.out.printf("%3d",localDate.getDayOfMonth());
                 localDate = localDate.plusDays(1);
                 if(localDate.getDayOfWeek().getValue() == 1){
                    System.out.println();
                 }
            }
            System.out.println("\n");
        }
    }
}```
