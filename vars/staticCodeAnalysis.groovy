def call(){
  withSonarQubeEnv(credentialsId: 'sonar')
  sh 'mvn clean package sonar:sonar'
}
