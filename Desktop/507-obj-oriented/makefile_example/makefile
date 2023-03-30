# Normal, "proper" makefile

# the following 3 lines are just variables to make the makefile shorter
client = mycode/client/
common = mycode/common/
server = mycode/server/

# the rest of the makefile are rules on how to build each file 
# with their respective dependent files

all: $(client)Client.class $(server)Server.class

$(client)Client.class: $(client)Client.java $(common)Adder.class
	javac $(client)Client.java

$(common)Adder.class: $(common)Adder.java
	javac $(common)Adder.java

$(server)AdderRemote.class: $(server)AdderRemote.java $(common)Adder.class
	javac $(server)AdderRemote.java

$(server)Server.class: $(server)Server.java $(server)AdderRemote.class
	javac $(server)Server.java

clean:
	rm -rf mycode/*/*.class

run-client: $(client)Client.class
	java $(client)Client

run-server: $(server)Server.class
	java $(server)Server