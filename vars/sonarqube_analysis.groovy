def call(String SonarQubeAPI, String Projectname, String ProjectKey){
    withSonarQubeEnv("${SonarQubeAPI}") {
        def SONAR_HOME = tool 'SonarQube'  // Ensure the tool name matches your Jenkins setup
        sh "${SONAR_HOME}/bin/sonar-scanner -Dsonar.projectName=${Projectname} -Dsonar.projectKey=${ProjectKey} -X"
    }
}
