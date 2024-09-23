# Etapa de build
FROM gradle:7.6.0-jdk17 AS build
WORKDIR /app
COPY . .
# Dar permissão de execução ao gradlew
RUN chmod +x ./gradlew
RUN ./gradlew build --no-daemon

# Etapa de runtime
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar

# Expor a porta da aplicação Spring Boot
EXPOSE 8080

# Comando para iniciar o backend
CMD ["java", "-jar", "app.jar"]
