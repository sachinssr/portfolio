FROM ubuntu

RUN apt-get update -y
RUN apt-get upgrade -y
RUN apt install -y openjdk-17-jdk
RUN apt install -y maven

RUN mkdir portfolio
WORKDIR portfolio/

COPY . .
RUN mvn clean install

RUN cd target/ && cp portfolio-0.0.1-SNAPSHOT.jar /portfolio

ENTRYPOINT [ "java", "-jar", "portfolio-0.0.1-SNAPSHOT.jar" ]
