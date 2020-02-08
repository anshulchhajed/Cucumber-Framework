node{
stage('SCM CheckOut'){
git https://github.com/anshulchhajed/Cucumber-Framework
}
stage('Compile-Package'){
def name=tool name: 'MAVEN_HOME', type: 'maven'
sh "${name}/bin/mvn package"
}
}
