pipeline {
    agent any

    stages {
        stage ('Compile Stage'){

            steps {
                withGradle(gradle : 'gradle_7_1') {
                    sh './gradlew clean build'
                }
            }
        }

        stage('Testing Stage'){
            steps {
                withGradle(gradle : 'gradle_7_1') {
                    sh './gradlew clean build'
                }
            }
        }

        stage('Deployment Stage'){
            steps {
                withGradle(gradle : 'gradle_7_1') {
                    sh './gradlew clean build'
                }
            }
        }
    }
}