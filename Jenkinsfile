pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                sh script: './hello.sh'
            }
        }
    }
}
