pipeline {
  agent {
    any
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
