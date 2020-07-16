def build(String target) {
    stage("build"){
       echo "building ${target}..."
    }
}

def test(String target) {
    stage ("test"){ steps {
       echo "testing ${target}..."
    }}
}

def pipeline(String target) {
    build(target)
    test(target)
}
