pipeline {
  agent any
  stages {
    stage('Run') {
      agent any
      steps {
        container(name: 'run')
      }
    }

    stage('Send Email') {
      steps {
        emailext(subject: 'Build is done', body: 'Build is done!', from: 'Local Jenkins', to: 'asukasmit@gmail.com')
      }
    }

  }
  environment {
    local = 'local'
  }
}