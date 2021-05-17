#!/bin/sh

VERSION='version43'
cd mo4093/
mvn clean install
cd ..
rm -rf *.java 
rm -rf *.class
rm -rf $VERSION
mkdir $VERSION
java -cp "randoop-all-4.2.6.jar:lib/commons-collections4-4.3.jar:mo4093/target/mo409-3-1.0-SNAPSHOT.jar" randoop.main.Main gentests --classlist=classes-bridge.txt  --usethreads=true --log=command-bridge.log --junit-output-dir=$VERSION --specifications=specification-43.json --input-selection=SMALL_TESTS --side-effect-free-methods=free-methods-43.txt --methodlist=methodlist-43.txt --omit-methods=.*getClass.*