pipeline {
    agent any 
        stages {
            stage ("Git Checkout"){
                steps{
                    git credentialsId: 'github_id', url: 'https://github.com/Shivamya30/30demo'
                }
            }
        }
}
