def newGit(repo)
{
 git"${repo}"
}
def newmaven()
{
sh'mvn package'
}
def newDeploy(workspace,ip,context)
{
sh "scp /var/lib/jenkins/workspace/${workspace}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}
