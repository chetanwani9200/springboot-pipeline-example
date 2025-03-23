pipeline{
agent any
stages{
stage('clone project'){
steps{
echo "Cloning Repository..."
checkout scm
}
}
stage('Build') {
            steps {
                echo "Building the Spring Boot project with Maven..."
                sh 'mvn clean install -DskipTests'
            }
        }
}
}