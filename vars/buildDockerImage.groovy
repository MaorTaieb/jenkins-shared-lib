def call(String imageName, String imageTag = "latest") {
    stage("Build & Push Docker Image") {

        echo "Building Docker image: ${imageName}:${imageTag}"

        sh """
            docker build -t ${imageName}:${imageTag} .
            docker push ${imageName}:${imageTag}
        """
    }
}

