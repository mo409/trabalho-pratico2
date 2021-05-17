#!/bin/sh

VERSION='version43'
cd mo4093/
mvn install
cd ..
rm -rf *.java 
rm -rf *.class
rm -rf $VERSION
mkdir $VERSION
java -cp "randoop-all-4.2.6.jar:lib/commons-collections4-4.3.jar:mo4093/target/mo409-3-1.0-SNAPSHOT.jar" randoop.main.Main gentests \
--classlist=classes-bridge.txt  --usethreads=true --log=command-bridge.log --junit-output-dir=$VERSION --specifications=specification.json --input-selection=SMALL_TESTS --side-effect-free-methods=free-methods.txt --methodlist=methodlist.txt --omit-methods=.*getClass.*