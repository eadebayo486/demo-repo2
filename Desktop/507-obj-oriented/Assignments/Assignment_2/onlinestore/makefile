all: clean
	javac clientview/Client.java

	javac model/Account.java
	javac model/AdminAccount.java
	javac model/Cart.java
	javac model/ProductInterface.java
	javac model/Product.java

	javac model/ProductsContainer.java
	javac model/AccountsInterface.java
	javac model/AccountsContainer.java
	javac model/ProductsInterface.java



	
	javac controller/Observer.java
	javac controller/AdminAccountsObserver.java

	javac controller/AccountsFactoryInterface.java
	javac controller/AccountsFactoryImplementation.java
	

	javac serverview/StoreServer.java

	
	

run-client:
	java clientview/Client
run-server:
	java serverview/StoreServer
clean:
	rm -rf */*.class

# how to make a jar file
#create a "MANIFEST.MF" file