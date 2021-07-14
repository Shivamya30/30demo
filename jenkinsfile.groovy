pipeline {
    agent any 
        stages {
            stage ("git"){
                steps{
                    git credentialsId: 'github_id', url: 'https://github.com/Shivamya30/30demo'
                }
            }
        }
}