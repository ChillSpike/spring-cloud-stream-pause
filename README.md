# Spring Cloud Stream pause endpoint check

1. Make sure there are Kafka and Zookeeper running on localhost:9092 and localhost:2181 with sleuth_topic created (can be adjusted in config-server/src/main/java/resources/config/config-client.yml) 
4. Run `mvn spring-boot:run` from demo
5. Try `curl -X POST localhost:8081/pause` and check demo logs for "Lifecycle Bean stopped" message (no message).
6. Remove all Sleuth and Cloud Stream related dependencies from demo/pom.xml
7. Rerun demo and try `curl -X POST localhost:8081/pause` again. Check logs for "Lifecycle Bean stopped" (present).