def buildImage(String imageName) {
    echo 'Building the image using DockerFile'
    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
    
    sh 'cd frontend'
    sh "docker build -t $imageName ."
    sh "echo $PASS | docker login -u $USER --password-stdin"
    sh "docker push $imageName"

    }
}

def testdockerAgent(){
    sh 'cd frontend'
    sh 'npm install'
}

return this