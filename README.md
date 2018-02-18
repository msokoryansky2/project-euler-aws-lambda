# project-euler-aws-lambda

This is a thin Scala wrapper around Project Euler solutions -- see my <a href="https://github.com/msokoryansky2/ProjectEuler">ProjectEuler</a> repo -- that allows them to be invoked on AWS Lambda.

You would run `sbt assembly` to create a Lambda-deployable JAR out of this project and then deploy it just as you would any Java JAR. 
