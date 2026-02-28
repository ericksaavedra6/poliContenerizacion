FROM maven:3.9.11-eclipse-temurin-21
WORKDIR /app

# Copia el JAR compilado desde la carpeta deployments
COPY Deployments/*.jar .

EXPOSE 8080
# Ejecuta la aplicación
CMD ["java", "-jar", "EntregaContenerizacion-0.0.1-SNAPSHOT.jar"]