pipeline {
	agent any
	stages {
		stage("Complie") {
			steps {
				sh "chmod +x ./mvnw"
				sh "./mvnw compile"
			}
		}
		stage("Unit test") {
			steps {
				sh "./mvnw test"
			}
		}
		stage("Code coverage") {
			steps {
             
			    sh "./mvnw jacoco:report@jacoco-report"
			    publishHTML([
			    	allowMissing: false, 
			    	alwaysLinkToLastBuild: false, 
			    	keepAll: false, 
			    	reportDir: 'target/site/jacoco', 
			    	reportFiles: 'index.html', 
			    	reportName: 'JaCoCo Report', 
			    	reportTitles: '', 
			    	useWrapperFileDirectly: true
			    ])
			    sh "./mvnw jacoco:check@jacoco-check"
             
			}
               
		}
	}
}