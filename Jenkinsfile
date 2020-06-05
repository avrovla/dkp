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
                    sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                        junit 'dkp/target/surefire-reports/*.xml'
                }
            }
        }
    
    }
}