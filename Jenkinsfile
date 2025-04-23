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
                    if (isUnix()) {
                        sh 'javac UserService.java'
                    } else {
                        bat 'javac UserService.java'  // Use `bat` for Windows
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'java UserService.java'
                    } else {
                        bat 'java UserService.java'  // Use `bat` for Windows
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'deploy.sh'
                    } else {
                        bat 'deploy.bat'  // Windows-specific deploy command
                    }
                }
            }
        }
    }
}
