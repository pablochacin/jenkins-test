node('master'){
    stage('save script'){
        steps{
           stash name: 'scripts' includes: "${env.WORKSPACE}@script"
        }
    }
}

pipeline {
    agent { label 'worker' }
    stages {
        stage('build') {
            steps {
                unstash name: 'scripts'
                sh 'env'
                sh 'pwd'
                sh 'ls -l'
                sh "${env.WORKSPACE}@script/hello.sh"
            }
        }
    }
}
