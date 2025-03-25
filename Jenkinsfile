pipeline{
agent any
        environment {
        JAVA_HOME = "C:\\Program Files\\Java\\jdk-17"
        MAVEN_HOME = "\"C:\\Program Files\\Maven\\mvn\\bin""
        PATH = "${MAVEN_HOME}\\bin;${JAVA_HOME}\\bin;${env.PATH}"
    }
stages{

stage('clone project'){
steps{
echo "Cloning Repository..."
checkout scm
git branch: 'main', url: 'https://github.com/chetanwani9200/springboot-pipeline-example.git'
}
}
stage('build project'){
steps{
echo "build project"
bat "\"${MAVEN_HOME}\\mvn\\" clean install"
}
}
}
}
