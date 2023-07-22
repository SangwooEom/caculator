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
	}
}