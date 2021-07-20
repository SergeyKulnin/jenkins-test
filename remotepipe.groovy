pipeline {

    agent {label "slave1" }

    stages {

        stage('Connection test') {

            steps { script {
                timestamps{
                    sleep 7
                
                sh '''#!/bin/bash
                 whoami
                 sleep 4
                 ip address
                 sleep 4
                 hostname 
         '''
                sleep 7
                }
                        }}

        }

        stage('Execute script'){
            steps { script {
                timestamps{
                sleep 10
                }
            }}
        }

         stage('Bash test'){
            steps { 
                timestamps{
                sh '''#!/bin/bash
                 sh "/home/user1/jenkins_script/jen.sh" 
         '''
                }
            }
        }
    }    
}