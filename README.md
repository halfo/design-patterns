# Design Patterns In Java

Design patterns are a general solution to commonly occuring problems when designing an application or system. They are the best practices a programmer can use to design a software.

This project contains several small projects focusing different design patterns. It is created solely for learning purpose. Here, [gradle](https://gradle.org/) is used as build automation tool.


## List of Design Patterns

* hello-world (test project)
* Model-View-Controller
* Strategy Pattern
* Singleton Pattern
* (Many more to come!)


## Project Structure

General gradle project structure is followed. Check [this](http://gradle.org/docs/current/userguide/multi_project_builds.html) for more information.

Main class of a project should be named as `Main.java` and should reside in `$project-name/main/src/java/io/github/halfo/` directory (because, that's how `build.grade` is configured!). Add your project name to `settings.gradle`.


## Building Projects

Fire the following command to build the projects:
```
gradle assemble
```

The jars are in `$project-name/build/lib/`directory. To run a jar, type:
```
java -jar $project-name/build/lib/$project-name.jar
```

To create the Eclipse/Idea specific descriptor files, add corresponding plugin and follow it's commands. To clean the project, type:
```
gradle clean
```


## Contribution

All forms of contribution (bug reports, bug fixes, pull requests and simple suggestions) are welcomed. Thanks!
