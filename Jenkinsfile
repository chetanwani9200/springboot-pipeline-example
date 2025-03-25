pipeline{
agent any
stages{

    environment {
        JAVA_HOME = "C:\\Program Files\\Java\\jdk-17"  // Windows Java path
        MAVEN_HOME = "C:\\Program Files\\maven"  // Windows Maven path
        PATH = "${MAVEN_HOME}\\bin;${JAVA_HOME}\\bin;${env.PATH}"
    }

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
 sh "mvn clean install"
}
}
}
}
