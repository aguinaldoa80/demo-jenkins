FROM openjdk:14

ARG JAR_FILE

RUN useradd -ms /bin/bash sn_309
RUN mvn clean package
COPY target/*.war /demo/app.war
RUN chown -R sn_309:root /demo

ENV TZ=America/Sao_Paulo

CMD java -jar \
    /demo/app.war \
    -Djava.awt.headless=true \
    -Djava.security.egd=file:/dev/./urandom \
    -Dfile.encoding=UTF-8

#### Containers should NOT run as root as a good practice
USER sn_309
# docker build -t demo-jenkins .
# docker run -d --name demo-jenkins -p 8090:8090 demo-jenkins
