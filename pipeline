//stages.groovy

void build(env) {
	stage("build"){    
    	sh "${env.WORKSPACE}/helper.sh 'building'"
	}
}

void test(env) {
	stage("test"){           
    	sh "${env.WORKSPACE}/helper.sh 'testing'"
	}
}

return this
