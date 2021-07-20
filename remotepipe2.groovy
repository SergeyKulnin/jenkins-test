pipeline {
    agent {label "slave2" }

    stages {

        stage('Update remote resources') {

    timestamps {
        ansiColor('xterm'){

            echoCyan "Update remote resources"
            steps { script {
                sleep 7                
                sh '''#!/bin/bash
                echo -en "\033[37;1;41m Информация \033[0m \n"
                 whoami
                 sleep 4
                 ip address
                 sleep 4
                 hostname 
         '''
                sleep 7
                        }}

        }}

        }

        
    }
    
        
}