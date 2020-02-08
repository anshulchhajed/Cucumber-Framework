node{
stage('SCM CheckOut'){
git credentialsId: '3486e1e7-ea18-42ce-9912-434b2d4ed614', url: 'https://github.com/anshulchhajed/Cucumber-Framework.git'
}
stage('Compile-Package'){
def Jname=tool name: 'MAVEN_HOME', type: 'maven'
bat "${Jname}/bin/mvn package"
}
}
