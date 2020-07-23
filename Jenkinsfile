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
                sh "${WORKSPACE}/helper.sh 'building'"
            }
        }
    }
    post{ 
        cleanup {
            dir("${WORKSPACE}"){
                deleteDir()
            }
        }
    }
}
