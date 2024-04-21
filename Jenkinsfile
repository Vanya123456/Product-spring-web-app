pipeline {
    agent any
    stages {
        stage("Clean up") {
            steps {
                deleteDir()
            }
        }
        stage("Stage 1") {
            steps {
                echo "The first stage just has started"
            }
        }
        stage("Stage 2") {
            steps {
                echo "The first stage is completed, starting the second one"
            }
        }
        stage("Clone repo") {
            steps {
                sh "git clone https://github.com/Vanya123456/Product-spring-web-app.git"
            }
        }
        stage("Build stage") {
            steps {
                dir("Product-spring-web-app") {
                    sh "mvn clean install"
                }
            }
        }
        stage("Test phase") {
            steps {
                dir("Product-spring-web-app") {
                    sh "mvn test"
                }
            }
        }
    }
}
