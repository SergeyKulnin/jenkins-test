pipeline {
    agent {label "slave2" }

    stages {

        stage('Update remote resources') {
ansiColor('xterm'){ansiblePlaybook colorized: true, installation: 'ansible2.5.11', inventory: 'inventory/hosts', playbook: 'playbooks/example.yml'}
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

        }

        
    }    
}