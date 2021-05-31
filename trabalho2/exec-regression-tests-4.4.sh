JUNITPATH=../lib/junit.jar:../lib/hamcrest.jar
LIB_PATHS=../lib/commons-collections4-4.4.jar:../mo409/target/mo409-1.0-SNAPSHOT.jar 
cd version4 
echo "Compiling java files"
echo "-------------------------------------------------"
javac -cp .:$JUNITPATH:$LIB_PATHS RegressionTest*.java -sourcepath ./
echo "Executing RegressionTest"
echo "-------------------------------------------------"
java -cp .:$JUNITPATH:$LIB_PATHS org.junit.runner.JUnitCore RegressionTest
