def call(credentialsId){
  withSonarQubeEnv(credentialsId: credentialsId){
     sh 'mvn clean package -DskipTests sonar:sonar'
}
}
