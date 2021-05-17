#!/bin/sh

cd mo409/
mvn clean install
cd ..
rm -rf *.java 
rm -rf *.class
rm -rf version4/
mkdir version4/
java -cp "randoop-all-4.2.6.jar:randoop.main.Main:lib/commons-collections4-4.4.jar:mo409/target/mo409-1.0-SNAPSHOT.jar" randoop.main.Main gentests --classlist=classes-bridge.txt  --usethreads=true --log=command-bridge.log --junit-output-dir=version4 --specifications=specification.json --input-selection=SMALL_TESTS --side-effect-free-methods=free-methods.txt --methodlist=methodlist.txt --omit-methods=.*getClass.*