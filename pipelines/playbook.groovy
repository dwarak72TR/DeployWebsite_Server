def buildAgent = 'CentosNode'
def playbook = "EmpDeployPlaybook.yml"
def ipdd

timestamps
{
    node(buildAgent)
    {  
        stage('Select Env And Invoke Playbook')
        {  if(environment.contains('dev'))
             {  ipdd = "192.168.0.28"
                sh 'echo "$environment"'
             }
            else
            {
                ipdd = "192.168.0.31"
                sh 'echo "$environment"'
                
            }
                 
            dir('ansible')
             {   
                try{
                     ansiblePlaybook(
                      playbook: "$playbook",
                      inventory: "$ipdd,",
                   //   extras: "$extraVars" 
                      )
                  } 
                   
                catch (e)
                 {
                    echo e.getMessage()
                    currentBuild.result='FAILURE'
                 }   
            }
        }
    }
}
