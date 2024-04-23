# Use a base image like Ubuntu that includes necessary tools
FROM ubuntu:latest

# Update package lists and install the JDK
RUN apt-get update && apt-get install -y default-jdk

# Set the working directory
WORKDIR /usr/src/app

# Copy the Java source code into the container
COPY . .

# Compile the Java program
RUN javac Program.java

# Define the command to run your Java program
CMD ["java", "Program"]
