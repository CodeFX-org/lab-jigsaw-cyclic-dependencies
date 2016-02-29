# Lab: Cyclic Modular Dependencies With Project Jigsaw

This demo project contains the code for an answer to a Stack Overflow question.
It explores cyclic dependencies With
 [Project Jigsaw](http://openjdk.java.net/projects/jigsaw/).

The code is released into the public domain via
 [CC0](https://creativecommons.org/publicdomain/zero/1.0/) so it can be used without any limitations.


## Cycles

We have two disjunct cycles:

* **pair**: `pair.two` requires `pair.one` requires `pair.two`
* **triple**: `triple.three` requires `triple.two` requires `triple.one` requires `triple.three`

Running `compile.sh` shows how they fail:

```bash
./compile.sh
 > creating clean directories
 > compiling and packaging cycle "pair"
src/org.codefx.demo.cyclic.pair.one/module-info.java:2: error: cyclic dependence involving org.codefx.demo.cyclic.pair.two
        requires org.codefx.demo.cyclic.pair.two;
                                            ^
1 error
 > compiling and packaging cycle "triple"
src/org.codefx.demo.cyclic.triple.three/module-info.java:2: error: cyclic dependence involving org.codefx.demo.cyclic.triple.two
        requires org.codefx.demo.cyclic.triple.two;
                                              ^
1 error
```

## Setup

The code was developed against build 106 of the
 [Jigsaw early access prototype](https://jdk9.java.net/jigsaw/).
For it to work the environment variable `JIGSAW_BIN` has to point
 to the `bin` directory in such a Java 9 install, e.g.:

```
export JIGSAW_HOME=/opt/java/jdk9
export JIGSAW_BIN=/opt/java/jdk9/bin
```
