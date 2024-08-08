def call() {
    sh 'trivy image teksphere/youtube:latest > trivyimage.txt'
}