pipeline {
    agent { label 'master' }
    stages {
        stage('build') {
            steps {
                sh 'ls -l /var/jenkins_home/workspace/test-remote-provider_PR-1@script'
                sh './hello.sh'
            }
        }
    }
}
