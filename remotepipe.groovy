pipeline {

    agent {label "slave1" }

    stages {

        stage('Connection test') {

            steps { script {
                timestamps{
                    sleep 7
                
                sh '''#!/bin/bash
                echo -en "\033[37;1;41m Информация \033[0m \n"
                echo -en "\033[36;1;47m Пользователь \033[0m \n"
                 whoami
                 sleep 4
                 echo -en "\033[36;1;47m IP адрес \033[0m \n"
                 ip address
                 sleep 4
                 echo -en "\033[36;1;47m Host \033[0m \n"
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