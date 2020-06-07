pipeline {
    agent {
        docker {
            image 'maven:3.6.3-openjdk-14' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
                    sh './mvnw clean package' 
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    
        stage('Deploy') {
            steps {
                sh 'mvn -DskipTests clean deploy'
            }
        }
    }
}
