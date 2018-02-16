node {
    stage ('Upload') {
        parallel 'first parrallel task' :{
            echo 'Hello world!'
        }, 'second parrallel task' :{
            echo 'Hello world!'
        }
    }
}