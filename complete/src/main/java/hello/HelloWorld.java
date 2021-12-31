package hello;

import org.joda.time.LocalTime;

import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

// log.debug("Hello this is a debug message");

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    //System.out.println("The current local time is: " + currentTime);
    log.debug("The current local time is: " + currentTime);

    Greeter greeter = new Greeter();
    //System.out.println(greeter.sayHello());
    log.debug(greeter.sayHello());
  }
}
