package:
	@ mvn clean package

docker-image-build: package
	@ docker build -t estudo/airlines-api .

run: docker-image-build
	@ docker-compose up -d

stop:
	@ docker-compose down -v
