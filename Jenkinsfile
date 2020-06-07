pipeline {
    //agent {
    //    docker {
    //       image 'maven:3.6.3-openjdk-14' 
    //        args '-v /root/.m2:/root/.m2' 
    //    }
    //}
    stages {

        
        stage('Build') { 

            git url: 'https://github.com/cyrille-leclerc/multi-module-maven-project'

            steps {
            withMaven(maven: 'maven-3') {

                sh 'mvn -B -DskipTests clean package'

            }
            }
            // steps {
            //        sh './mvnw -B -DskipTests clean package' 
            //}
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
