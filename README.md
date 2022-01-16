[![Maven Artifact](https://img.shields.io/nexus/r/io.github.yogonza524/kim?server=https%3A%2F%2Foss.sonatype.org)](https://mvnrepository.com/artifact/io.github.yogonza524/kim)
![Test all](https://github.com/yogonza524/kim/workflows/test/badge.svg)
![Test all](https://github.com/yogonza524/kim/workflows/mutation-test/badge.svg)
[![Coverage](https://codecov.io/gh/yogonza524/kim/branch/master/graph/badge.svg)](https://codecov.io/gh/yogonza524/kim)
![Code size](https://img.shields.io/github/languages/code-size/yogonza524/kim)

# Kim
Finder of next bus arrivals for Argentine citizens

## Add to your project
To add as dependency using Maven, you should have at ```pom.xml```:
```xml
<dependency>
  <groupId>io.github.yogonza524</groupId>
  <artifactId>kim</artifactId>
  <version>0.0.1</version>
</dependency>
```

To add as dependency using Gradle, you should have at ```build.gradle```:
```groovy
repositories {
    mavenCentral()
    maven { url 'https://oss.sonatype.org/content/repositories/ksoap2-android-releases/' }
}

dependencies {
    implementation "io.github.yogonza524:kim:0.0.1"
}
```

## Pre requirements
- Valid credentials

## Requirements
- Java 11+
- Gradle 6+

## Do it yourself
- Instance the service first
```java
KimService kimService = new KimService(Credentials.builder()
        .username(System.getenv("KIM_USERNAME"))
        .password(System.getenv("KIM_PASSWORD"))
    .build());
```

- List all bus lines
```java
kimService.linesBy(Place.CORRIENTES())
    .getLines()
    .forEach(System.out::println);
```

- List a route (list of GPS points) for a given line
```java
kimService.routes(line)
    .getPoints()
    .stream()
    .forEach(System.out::println);
```

- List streets for a given line
```java
kimService.streetsByLine(line)
    .getStreets()
    .forEach(System.out::println);
```

- List streets intersection for a given line and street
```java
kimService.intersectionPerLineAndStreet(line, street)
    .getStreets()
    .forEach(System.out::println);
```

- List stop bus for a given line and streets intersections
```java
kimService.stopByLineAndStreetAndIntersection(line, street, intersection)
    .getStopList()
    .forEach(System.out::println);
```

- List next arrivals for a given stop, line and place
```java
ArrivalResponse nextArrivals = kimService
    .nextArrivals(stop, line, Place.CORRIENTES());
    
    if (nextArrivals.getCode() == 0) {
      nextArrivals
          .getArrivals()
          .forEach(System.out::println); 
    }
```

## Sube (Recharge point)
![SUBE System](https://moni.com.ar/static/img/cargasube/sube-img-02.svg)
- List all recharge points in Argentina
```java
new SubeService()
    .list()
    .getFeatures()
    .forEach(System.out::println);
```

- List the 10 charging points closest to a geographical position
```java
new SubeService()
    .nearbyPoint(
        GPS.builder()
            .latitude("-27.5456")
            .longitude("-56.54654")
        .build())
    .stream()
    .limit(10)
    .forEach(System.out::println);
```