# Build Commands:
build:
	@echo "Building React App...";
	cd ./src/main/java/com/example/lehrerkalender/demo/app/ && yarn

start: 
	@echo "Starting React App and Spring Boot REST API...";
	mvn spring-boot:start;
	cd ./src/main/java/com/example/lehrerkalender/demo/app/ && yarn start;

rebuild:
	@echo "Rebuilding REST API...";
	mvn clean package spring-boot:repackage;
