node('master'){
    stage('save script'){
        sh "pwd"
        sh "ls -l"
    }
}

pipeline {
    agent { label 'worker' }
    stages {
        stage('build') {
            steps {
                sh 'pwd'
                sh 'ls -l'
                sh "hello.sh"
            }
        }
    }
}
