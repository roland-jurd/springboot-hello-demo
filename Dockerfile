FROM anapsix/alpine-java

ADD ./target/hello-service.jar /app/

CMD ["java", "-Xmx200m", "-jar", "/app/hello-service.jar"]

EXPOSE 8000