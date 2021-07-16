pipeline {

    agent {label "user1-virtual-machine" }

    stages {

        stage('Connection test') {

            steps { script {
                sleep 7
                
                echo "ip address"
                echo "hostname"
                sleep 7
                        }}

        }

        stage('Execute script'){
            steps { script {
                sh "/home/jenkins_script/jen.sh"
                sleep 10
            }}
        }
    }    
}