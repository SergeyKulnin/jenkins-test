pipeline {

    agent {label "slave2" }

    stages {

        stage('Update remote resources') {

            steps { script {
                sleep 7
                
                sh '''#!/bin/bash
                echoGreen 'Info'
                 whoami
                 sleep 4
                 ip address
                 sleep 4
                 hostname 
         '''
                sleep 7
                        }}

        }

        
    }    
}