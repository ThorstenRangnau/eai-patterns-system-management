# eai-patterns-system-management

## Pre-requirements
You need at least a Java 8 JDK. Because of the Gradle Wrapper file you should not require Gradle installed on your machine.

## Instructions

Every component includes a Gradle Wrapper file (gradlew). To start the different components you simply have to use this file to build and run the applications. The build process will download all dependencies required for the Java Spring Boot applications. The run process will deploy the system and starts it (you can add deteached mode if you want to use your console for other commands otherwise the spring application will block the console)

Note: it is important to start the applications in the correct order: 1. control bus, 2. message bus, 3. receiver-application, 4. sender-appliation

1. go to each component directory (control-bus, message-bus, receiver-application, sender-application)
2. build each project with `./gradlew clean build`
3. run each project with `./gradlew run`

Please be aware that the described process counts for Mac and Linux systems. Gradle needs to be invoked differently on Windows.

## Troubleshootings
Usually, you just need Java on your machine and the Gradle Wrapper Files should do all the magic for building and running all applications. However, if the `./graldew` commands are not working you may need to install Gradle and use `gralde` instead.
