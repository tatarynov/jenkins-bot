pipeline {
  agent any
  stages {
    stage('unit') {
      steps {
        sh 'echo \'unit\''
      }
    }
    stage('int') {
      parallel {
        stage('int') {
          steps {
            sh 'echo \'int\''
          }
        }
        stage('ui') {
          steps {
            build(job: 'UI_tests', propagate: true, wait: true)
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