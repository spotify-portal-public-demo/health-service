FROM amazoncorretto:21-alpine
ENTRYPOINT ["/usr/bin/health-service.sh"]

COPY health-service.sh /usr/bin/health-service.sh
COPY target/*.jar /usr/share/health-service/health-service.jar
