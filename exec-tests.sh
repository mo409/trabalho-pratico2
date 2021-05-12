JUNITPATH=lib/junit.jar:lib/hamcrest.jar
LIB_PATHS=lib/commons-collections4-4.4.jar:lib/mo409-1.0-SNAPSHOT.jar 
echo "Compiling java files"
echo "-------------------------------------------------"
javac -cp .:$JUNITPATH:$LIB_PATHS ErrorTest*.java RegressionTest*.java -sourcepath ./
echo "Executing ErrorTest"
echo "-------------------------------------------------"
java -cp .:$JUNITPATH:$LIB_PATHS org.junit.runner.JUnitCore ErrorTest
echo "Executing RegressionTest"
echo "-------------------------------------------------"
java -cp .:$JUNITPATH:$LIB_PATHS org.junit.runner.JUnitCore RegressionTest
