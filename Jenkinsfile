pipeline {
  agent any

  tools {
    maven 'Maven 3.9.9'
    // jdk 'JDK 24'
  }

  options { timestamps() }

  triggers {
    githubPush()
  }

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Test') {
      steps {
        bat 'mvn -B -q test'
      }
    }
  }
}
