pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Add your build steps here, for example:
                sh 'javac UserService.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // Add your test steps here, for example:
                sh 'java UserService.java'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying to production...'
                // Add deployment steps here
            }
        }
    }
}
