def call(){
  sh "trivy fs . > trivy_report.txt"
  sh 'ls -lh trivy_report.txt'
}
