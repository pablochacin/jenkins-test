pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                sh "${env.WORKSPACE}@script/hello.sh"
                sh "ls -l"
            }
        }
    }
}
