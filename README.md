# git-actions-test
This is a simple sample project to learn and test the capabilities of git actions.

## Local deployment
To deploy execute the following command:
```
$ docker container run -d -p 8080:8080 canaparro/git-actions-test
```
Then access
```
http://localhost:8080/api/helloworld
```

## CI/CD
The main purpose of this repository is to understand the features of github actions. The pipeline is defined on file ```github/workflows/workflow.yml```.
The pipeline runs each time a push is made to the master branch and has two Jobs: Build and Docker.

###Build:
<ol>
<li>Checkout the repository to have access to the sourcecode</li>
<li>Sets up Java and maven on the runner</li>
<li>Sets up Java 11 and maven on the runner</li>
<li>Runs maven package run tests and create the jar file</li>
<li>Uploads the jar file as an artifact to be used on the next job</li>
</ol>

###Docker:
**Depends on Build success**
<ol>
<li>Checkout the repository to have access to the Dockerfile</li>
<li>Downloads the jar file as an artifact to build image upon</li>
<li>Logs in to DockerHub using username and password set as repository secrets</li>
<li>Builds and pushes an image based on the jar to DockerHub</li>
</ol>