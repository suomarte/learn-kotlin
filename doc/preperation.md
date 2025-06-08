# Preparation

I'm starting out on a Mac with SDKMAN installed, but setting up the development environment for Kotlin should be easy regardless of
the setup.

## Java

Kotlin runs on the Java runtime environment. The most widely used version at the moment is Java 21, which is therefore selected.
I'm a fan of the Amazon Corretto distribution, so that's the one I'm going with.

`sdk install java 21.0.7-amzn`

## Gradle

I'm used to working with Maven, but this time I decided to use Gradle because it's outside my comfort zone and a great opportunity
to learn something new.

`sdk install gradle`

## Init project

It is very simple to setup a gradle project for kotlin.

`gradle init`

Now there are several questions to answer:

### Type of build

Select type of build to generate:

1. Application
2. Library
3. Gradle plugin
4. Basic (build structure only)

Enter selection (default: Application) [1..4] 1
=> Gradle will generate a basic project structure for a runnable application.

### Language

Select implementation language:

1. Java
2. Kotlin
3. Groovy
4. Scala
5. C++
6. Swift

Enter selection (default: Java) [1..6] 2
=> This selection is clear. We want to learn Kotlin.

### Java version

Enter target Java version (min: 7, default: 21): 21
=> The most widely used version at the moment is Java 21.

### Application structure

Select application structure:

1. Single application project
2. Application and library project

Enter selection (default: Single application project) [1..2] 1
=> Single application project should be enough for learning Kotlin.

### Build script DSL

Select build script DSL:

1. Kotlin
2. Groovy

Enter selection (default: Kotlin) [1..2] 1
=> Same. We want to learn Kotlin.

### Test framework

Select test framework:

1. kotlin.test
2. JUnit Jupiter

Enter selection (default: kotlin.test) [1..2] 1
=> We are brave. Even if we never heard about kotlin.test..



