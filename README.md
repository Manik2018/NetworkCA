This is the forked repository of my account. This project is my network class assignment. In this project I developed a spring boot application using Maven package builder. After running it locally using PostMan as client. I deployed the application in AWS elastic cloud beanstalk environment. I also created a docker image of ubuntu container containing CURL which acts as a client. Hence I demonstrated the use of AWS for web application deployment and docker images. containers through this assignment.

Following is the process for same.

Step 1: Create a Jar file once project is completed by using command mvn clean package using command prompt

Step 2: Download elastic beanstalk plugin using command pip install awsebcli --upgrade

Step 3: Initializing Elastic Beanstalk using eb init and selecting the region.

Step 4: Create new application and select Java platform.

Step 5: Select option 'N' for CodeCommit and give option 'Y' for SSH connection.

Step 6: Adding mvn JAR file path in config.yml file.

Step 7: Then give command eb create --single --database. This create single instance of EC2 in Elastic Beanstalk environment. It is creates a RDS database server.

Step 8: Give credentials for your database server. After this set database environment using eb setenv SPRING_DATASOURCE_URL= (Endpoint generated in EB console)

Step 9: Give eb deploy.
