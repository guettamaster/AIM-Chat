pipeline {
    options {
        buildDiscarder(logRotator(numToKeepStr: '30'))
        disableConcurrentBuilds()
    }
    agent any
    environment {
        MVN_GOAL = "clean verify"
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Execute tests') {
            steps {
                //https://docs.openstack.org/infra/jenkins-job-builder/wrappers.html need to use additionalOptions option for docker
                wrap([$class: 'Xvfb', screen: '1920x1080x16', autoDisplayName: true]) {
                    sh "${M2_HOME}/bin/mvn ${env.MVN_GOAL}"
                }
            }
        }
    }
    post {
        always {
            publishHTML(target: [
                    reportName           : 'Serenity',
                    reportDir            : 'target/site/serenity',
                    reportFiles          : 'index.html',
                    keepAll              : true,
                    alwaysLinkToLastBuild: true,
                    allowMissing         : false
            ])
        }
    }
}