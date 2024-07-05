def call(Map config = [:]) {
    pipeline {
        agent any

        stages {
            stage('Checkout') {
                steps {
                    checkout scm
                }
            }

            stage('Build') {
                steps {
                    sh './gradlew clean build' // Use 'mvn clean install' for Maven projects
                }
            }

            stage('Test') {
                steps {
                    sh './gradlew test' // Use 'mvn test' for Maven projects
                }
            }

            stage('Deploy') {
                steps {
                    echo 'Deploying to the server...'
                    // Add deployment steps here
                }
            }
        }
    }
}

