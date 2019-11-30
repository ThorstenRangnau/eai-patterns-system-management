FROM gradle:6.0.1-jdk8
RUN mkdir -p /opt/gradle/.gradle
ENV GRADLE_USER_HOME=/opt/gradle/.gradle
COPY gradlew /project/gradlew
COPY gradlew.bat /project/gradlew.bat
COPY gradle/ /project/gradle
WORKDIR /project
RUN ./gradlew --version
COPY . .
RUN ./gradlew build
CMD ./gradlew run