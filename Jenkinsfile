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
                script {
                    // Compiling the UserService.java file
                    bat 'javac UserService.java'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Running the compiled UserService.class
                    bat 'java UserService'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    echo 'Deploying to production...'
                    // Add your deployment steps here
                }
            }
        }
    }
}
