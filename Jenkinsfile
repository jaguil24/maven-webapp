pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from GitHub
                git 'https://github.com/jaguil24/maven-webapp.git'
            }
        }

        stage('Build') {
            steps {
                // Run Maven build to compile and package the application
                script {
                    def mvnHome = tool name: 'M3', type: 'ToolProperty'
                    sh "${mvnHome}/bin/mvn clean install"
                }
            }
        }

        // Optionally, add other stages like 'Test' and 'Deploy' if needed
        stage('Test') {
            steps {
                
                // ADDED COMMENT
                echo "Running tests..."
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
