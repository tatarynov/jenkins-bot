pipeline {
  agent any
  stages {
    stage('unit tests') {
      steps {
        sh 'echo \'Running unit tests...\''
      }
    }
    stage('integration') {
      parallel {
        stage('integration') {
          steps {
            sh 'echo \'Running integration tests\''
          }
        }
        stage('ui') {
          steps {
            sh 'echo "mvn clean test"'
          }
        }
      }
    }
    stage('deploy') {
      steps {
        sh 'echo \'deploy\''
      }
    }
  }
}