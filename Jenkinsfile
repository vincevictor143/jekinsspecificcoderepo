pipeline
{
   agent any
   stages
   {
      stage('Building jar')
      {
          steps
          {
             bat "mvn clean package -DskipTests"
          }
      }
      
      stage('Building image')
      {
          steps
          {
             bat "docker build -t=attbatch1/buildimagthroughjenkins ."
          }
      }
      
      stage('Push image')
      {
          steps
          {
             bat "docker push attbatch1/buildimagthroughjenkins"
          }
      }
      
   }

}