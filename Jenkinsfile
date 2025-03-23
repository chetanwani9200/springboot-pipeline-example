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
}
}
stage('Test') {
steps {
echo "Testing the Spring Boot project with Maven..."
}
stage('Deploy') {
steps {
echo "Deploying the Spring Boot project with Maven..."
}

}
}