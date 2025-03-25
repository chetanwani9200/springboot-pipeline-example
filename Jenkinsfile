pipeline{
agent any
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
 sh "mvn clean install"
}
}
}
}
