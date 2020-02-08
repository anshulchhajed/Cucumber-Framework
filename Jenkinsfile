node{
stage('SCM CheckOut'){
git credentialsId: '3486e1e7-ea18-42ce-9912-434b2d4ed614', url: 'https://github.com/anshulchhajed/Cucumber-Framework.git'
}
stage('Compile-Package'){
def Jname=tool name: 'MAVEN_HOME', type: 'maven'
bat "${Jname}/bin/mvn package"
}
stage('Cucumber Report'){
cucumber failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
 }
stage('Email Notification'){
mail bcc: '', body: 'Welcome to Jenkins Pipeline', cc: '', from: '', replyTo: '', subject: 'Cucumber Jenkins Report', to: 'ianshul19@gmail.com'
emailext attachmentsPattern: 'overview-features.html', body: '', subject: 'Report', to: 'ianshul19@gmail.com'
}
}
