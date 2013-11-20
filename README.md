DWSlib OWL
======

This module of the DWSlib contains commonly used functionality for working with OWL ontologies. It has
been moved into an own module to prevent the main library from depending on OWLAPI and its dependencies.
This module and the whole DWSlib is maintained by the
[Data and Web Science Research Group](http://dws.informatik.uni-mannheim.de), University of Mannheim.

## Usage

If you use Maven for building your project, just add

```
<dependency>
  <groupId>de.uni_mannheim.informatik.dws</groupId>
  <artifactId>dwslib-owl</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```

to your pom.xml. Remember that your project has to be configured for using the DWS Maven repository. This
is done by adding

```
<repositories>
  <repository>
    <id>lski</id>
    <url>https://breda.informatik.uni-mannheim.de/nexus/content/groups/public/</url>
  </repository>
</repositories>
```

to the respective POM.

If your are not using Maven for managing dependencies, just grab it from
[this page](https://breda.informatik.uni-mannheim.de/nexus/index.html#nexus-search;gav~de.uni_mannheim.informatik.dws~dwslib~~~)
and include it in your project's dependencies.