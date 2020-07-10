pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                sh './hello.sh'
            }
        }
    }
}
