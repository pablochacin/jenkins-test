pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                sh 'env'
                sh 'pwd'
                sh 'ls -l'
                sh "{env.WORKSPACE}@script/hello.sh'
            }
        }
    }
}
