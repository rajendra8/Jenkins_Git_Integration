# Jenkins_Git_Integration
create new project "Jenkins_Git_Integration" to test integration of javacode+git+jenkins
#url for initial setup of git project
https://thetechstack.net/create-maven-project-in-github/
**Creat Repo in Git first**
1. via terminal got that folder where create new project 
     run cmd : 
   mvn -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=com.mycompany.app -DartifactId=Your Porject name
   follow the link please
   
2.Git Command 
   a. check the current status : git status
   b. add new file : git add -A  to add all new unstaged file
   c.Execute ‘git commit -m “initial project setup”‘ this command will commit all staged files to local gitHub repository. We are also providing comment for all these files with -m option.
   d.All files are checked into local repository. Now lets push them to remote gitHub repository. Execute ‘git push origin ~~master~~’
   
   