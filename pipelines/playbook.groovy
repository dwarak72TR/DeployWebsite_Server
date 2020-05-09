def buildAgent = 'packer'
def playbook = "ansiename.yaml"

timestamps
{
    node(buildAgent)
    {  
        // stage('Select Env And Invoke Playbook')
        // {   
        //     module = "${Envname}"
        //     switch(module)
        //     {
        //         case "QA":  
        //                     extraVars = "-e \"{'env':'${Envname}','uname':'${Username}'}\" "
        //                     limit = "${Envname}"
        //                     break;
                            
        //         case "DEV": 
        //                     extraVars = "-e \"{'env':'${Envname}','uname':'${Username}'}\" "
        //                     limit = "${Envname}"
        //                     break;
                            
        //         case "PD":
        //                     extraVars = "-e \"{'env':'${Envname}','uname':'${Username}'}\" "
        //                     limit = ""
                            
        //                     break;
        //     }
        //     dir('ansible')
        //     {
        //         try{
        //             ansiblePlaybook(
        //             playbook: "$playbook",
        //             extras: "$extraVars",
        //             limit: "$limit")
        //         }
        //     }
        //     catch (e)
        //     {
        //         echo e.getMessage()
        //         currentBuild.result='FAILURE'
        //     }   
        //     finally
        //     {
        //         //this is where you would send notifications
        //     }
        }
    }
}
