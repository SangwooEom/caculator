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
			    	allowMissing: true, 
			    	alwaysLinkToLastBuild: true, 
			    	keepAll: true, 
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