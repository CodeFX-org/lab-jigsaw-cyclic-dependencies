#!/bin/bash

echo " > creating clean directories"
rm -r classes
mkdir classes
rm -r mods
mkdir mods

echo " > compiling and packaging cycle \"pair\""
$JIGSAW_BIN/javac -d mods -modulesourcepath src $(find src -path "*pair*.java")

echo " > compiling and packaging cycle \"triple\""
$JIGSAW_BIN/javac -d mods -modulesourcepath src $(find src -path "*triple*.java")
