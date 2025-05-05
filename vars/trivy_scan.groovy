def call(){
  sh "trivy fs . -f json -o trivy_report.json"
  sh 'ls -lh trivy_report.txt'
}
