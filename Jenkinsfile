pipeline {
  agent any
  stages {
    stage('Build App') {
      parallel {
        stage('Build App') {
          steps {
            sleep 5
          }
        }
        stage('Build Server') {
          steps {
            sleep 1
          }
        }
      }
    }
    stage('Deploy') {
      parallel {
        stage('Deploy') {
          steps {
            sleep 1
          }
        }
        stage('') {
          steps {
            sleep 1
          }
        }
      }
    }
    stage('Postman Tests') {
      parallel {
        stage('Postman Tests') {
          steps {
            sleep 1
          }
        }
        stage('') {
          steps {
            sleep 1
          }
        }
      }
    }
  }
}