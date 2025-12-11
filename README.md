# 0.ESTUDIO

ssh -i tu_llave.pem ec2-user@IP_PUBLICA
# Si es ubuntu:
# ssh -i tu_llave.pem ubuntu@IP_PUBLICA



sudo yum update -y
sudo amazon-linux-extras install java-openjdk17 -y
sudo yum install git -y

sudo apt update
sudo apt install openjdk-17-jdk git -y


git clone https://github.com/TU_USUARIO/TU_REPO.git
cd TU_REPO


sudo yum install maven -y   # Amazon Linux
# o
sudo apt install maven -y   # Ubuntu


mvn clean package -DskipTests


java -jar target/*.jar

nohup java -jar target/*.jar > app.log 2>&1 &


http://IP_PUBLICA:8080


