pipeline {
  agent any

  tools {
    maven 'Maven 3.9.9'
    // jdk 'JDK 24'
  }

  options {
    timestamps()
  }

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
        bat 'mvn -B clean test'
      }
    }
  }

  post {
    always {
      // Publica os resultados do TestNG no Jenkins
      junit '**/target/surefire-reports/*.xml'
    }

    success {
      echo '✅ All TestNG tests passed!'
    }

    failure {
      echo '❌ Some tests failed!'
    }
  }
}