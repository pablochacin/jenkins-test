node('master'){
    stage('save script'){
        sh "ls -l ${env.WORKSPACE}@script/"
        stash name: 'scripts', includes: "${env.WORKSPACE}@script/hello.sh"
    }
}

pipeline {
    agent { label 'worker' }
    stages {
        stage('build') {
            steps {
                sh 'env'
                sh 'pwd'
                sh 'ls -l'
                unstash name: 'scripts'
                sh "${env.WORKSPACE}@script/hello.sh"
            }
        }
    }
}
