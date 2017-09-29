pipeline {
    options {
        buildDiscarder(logRotator(numToKeepStr: '30'))
        disableConcurrentBuilds()
    }
    agent any
    environment {
        //http://jenkins address/credentials
        GITHUB_CREDENTIALS = "f534a8e6-ff71-40b5-b332-328f5eb82aba"
        GIT_URL = "https://github.com/guettamaster/AIM-Chat.git"
        GIT_BRANCH = "master"
        MVN_GOAL = "clean verify"
    }
    stages {
        stage('Initialize') {
            steps {
                git url: env.GIT_URL,
                        branch: env.GIT_BRANCH, credentialsId: "${env.GITHUB_CREDENTIALS}"
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