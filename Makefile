all: run

clean:
		rm -f out/Main.jar out/PerfectSquares.jar out/Range.jar

out/Main.jar: out/parcs.jar src/Main.java src/Range.java
		@javac -cp out/parcs.jar src/Main.java src/Range.java
		@jar cf out/Main.jar -C src .
		@rm -rf src/*.class

out/PerfectSquares.jar: out/parcs.jar src/PerfectSquares.java src/Range.java
		@javac -cp out/parcs.jar src/PerfectSquares.java src/Range.java
		@jar cf out/PerfectSquares.jar -C src .
		@rm -rf src/*.class

build: out/Main.jar out/PerfectSquares.jar

run: out/Main.jar out/PerfectSquares.jar
		@cd out && java -cp 'parcs.jar:Main.jar' Main