FROM maven:3-jdk-8
MAINTAINER Denis Volnenko <denis@volnenko.ru>

COPY ./ /opt/time-server
WORKDIR /opt/time-server

RUN mvn clean package

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./target/time-server.jar"]