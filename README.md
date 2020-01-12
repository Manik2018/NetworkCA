This project is my network class assignment. In this project I developed a spring boot application using Maven package builder. After running it locally using PostMan as client. I deployed the application in AWS elastic cloud beanstalk environment. I also created a docker image of ubuntu container containing CURL which acts as a client. Hence I demonstrated the use of AWS for web application deployment and docker images. containers through this assignment.

Following is the process for same.

Step 1: Create a Jar file once project is completed by using command mvn clean package using command prompt

Step 2: Download elastic beanstalk plugin using command pip install awsebcli --upgrade

Step 3: Initializing Elastic Beanstalk using eb init and selecting the region.

Step 4: Create new application and select Java platform.

Step 5: Select option 'N' for CodeCommit and give option 'Y' for SSH connection.

Step 6: Adding mvn JAR file path in config.yml file.

Step 7: Then give command eb create --single --database. This create single instance of EC2 in Elastic Beanstalk environment. It creates a RDS database server.

Step 8: Give credentials for your database server. After this set database environment using eb setenv SPRING_DATASOURCE_URL= (Endpoint generated in EB console)

Step 9: Give command eb deploy.

Step 10: Give command eb console to open the elastic beanstalk environment on browser.

Step 11: Now application is successfully deployed on AWS cloud. Next Step is to download Docker. I downloaded Docker toolbox as per 
my system requirement. 

Step 12: After installing docker and signing up on docker website. I pulled the ubuntu image from docker hub using docker pull ubuntu command.

Step 13: After I used the command docker run -i -t ubuntu /bin/bash to create a container of Ubuntu image and opening bash shell.

Step 14: After this I used the command apt install curl to install CURL in that ubuntu container.

Step 15: Then I used docker commit command to save the changes into a new image which is my final image. I am using container of this image to create containers which acts as a client and fetch the response from the spring boot application hosted in cloud.
