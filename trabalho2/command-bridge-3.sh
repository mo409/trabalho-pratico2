cd mo4093/
mvn install
cd ..
java -cp "randoop-all-4.2.6.jar:randoop.main.Main:lib/commons-collections-3.2.2.jar:mo409/target/mo409-1.0-SNAPSHOT.jar" randoop.main.Main gentests \
--classlist=classes-bridge.txt  --usethreads=true --log=command-bridge.log
rm -rf version3
mkdir version3
cp *.java version3/
cp *.class version3/