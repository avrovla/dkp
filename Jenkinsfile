pipeline {
    
    agent {
        docker {
            image 'openjdk:14-alpine'
            args '-v $HOME/.m2:/root/.m2'
        }   
    }
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
