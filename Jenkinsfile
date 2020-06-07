pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                    sh 'chmod +x mvnw'
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
                sh './mvnw -DskipTests clean deploy'
            }
        }
    }
}
