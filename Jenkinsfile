pipeline {
    agent { label 'worker' }
    stages {
        stage('build') {
            steps {
                sh 'env'
                sh 'pwd'
                sh 'ls -l'
                sh "${env.WORKSPACE}@script/hello.sh"
            }
        }
    }
}
