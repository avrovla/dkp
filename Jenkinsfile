pipeline {
    
    agent {
        docker {
            image 'openjdk:14-alpine'
        }
    }
    stages {
        stage('Setup') {
                steps {
                    sh 'chmod +x mvnw'
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
                withCredentials([file(credentialsId: 'nexus-settings', variable: 'FILE')]) {
                      sh './mvnw -s $FILE -DskipTests clean deploy'
                }
            }
        }
    }
}
