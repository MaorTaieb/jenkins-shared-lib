def call(String clusterName, String deployFile) {
    stage("Deploy to AWS EKS") {

        echo "Updating kubeconfig for cluster: ${clusterName}"
        
        sh """
            aws eks update-kubeconfig --region us-east-1 --name ${clusterName}
            kubectl apply -f ${deployFile}
        """
    }
}

