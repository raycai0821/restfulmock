FROM openjdk:8
MAINTAINER raycai 370288803@qq.com
USER root
RUN mkdir -p /restMock
RUN mkdir -p /restMock/conf
ADD restfulmock-0.0.1-snapshot.jar restMock
VOLUME /restMock/conf:/bea/jenkinsrun/dockerfile
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","restfulmock-0.0.1-snapshot.jar","--spring.config.location=/restMock/conf/application.properties"]
EXPOSE 8081