pipeline {
  agent any
  stages {
    stage('Unit') {
      steps {
        sh 'echo \'unit\''
      }
    }
    stage('Integration Tests') {
      parallel {
        stage('Integration Tests') {
          steps {
            sh 'echo \'int\''
          }
        }
        stage('') {
          steps {
            build 'UI_tests'
          }
        }
      }
    }
    stage('Deploy') {
      steps {
        sh 'echo \'deploy\''
      }
    }
  }
}