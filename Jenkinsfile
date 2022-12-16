pipeline {
  agent {
    docker {
      args '-v /jenkins/.gradle:/jenkins/.gradle'
      image 'gradle:latest'
    }
  }
  stages {
    stage('Build') {
      steps {
        sh './gradlew :build'
      }
    }
  }
  environment {
    GRADLE_USER_HOME = '/jenkins/.gradle'
  }
}