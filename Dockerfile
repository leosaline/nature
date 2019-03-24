FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/nature.jar nature.jar
ENTRYPOINT ["kotlin", "-cp", "nature.jar", "com.saline.nature.NatureApplicationKt"]