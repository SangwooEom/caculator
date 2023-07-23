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
			    publishHTML (target: [ 
			    	reportDir: 'target/site/jacoco',
			    	reportFiles: 'index.html',
			    	reportName: "Jacoco Report"
			     ])
			    sh "./mvnw jacoco:check@jacoco-check"
             
			}
               
		}
	}
}