def build(String target) {
    stage{
       echo "building ${target}..."
    }
}

def test(String target) {
    stage {
       echo "testing ${target}..."
    }
}
