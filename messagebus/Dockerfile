FROM gradle:6.0.1-jdk8
COPY . /project
WORKDIR /project
RUN ./gradlew build
CMD ./gradlew run