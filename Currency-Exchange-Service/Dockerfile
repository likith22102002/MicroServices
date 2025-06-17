# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim


# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the target directory to the container
COPY target/Currency-Exchange-Service-0.0.1-SNAPSHOT.jar app.jar



# Expose port 8000 (or whatever port your app runs on)
EXPOSE 9000

# Command to run the application
CMD ["java", "-jar", "app.jar"]
