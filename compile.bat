DEL "bin/SuperCalc.jar"
cd out/production/16bit
jar cvf SuperCalc.jar main.class main$1.class logic/gates.class logic/converter.class logic/Config.class logic/circuits/binary/adder.class logic/circuits/binary/subtractor.class parser/binary.class parser/hex.class parser/list.class
jar --update --verbose --file SuperCalc.jar --main-class main
copy "SuperCalc.jar" "../../../bin/"
DEL "SuperCalc.jar"
cd ../../../