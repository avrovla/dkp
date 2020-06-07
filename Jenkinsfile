pipeline {
    
    agent {
        docker {
            image 'openjdk:14-alpine'
        }
    }
    stages {
        stage('Setup') {
                steps {
                    sh '.Chmod +x mvnw'
                }
            }

        stage('Build') {
            steps {
                sh './mvnw -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test' 
            }
        }
    
        stage('Deploy') {
            steps {
                sh './mvnw -s settings.xml -DskipTests clean deploy'
            }
        }
    }
}
