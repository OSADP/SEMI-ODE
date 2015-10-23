set -e       # Exit script on error
#set -x      # Print commands and arguments

echo "Installing Maven"
tar xvf apache-maven-3.3.3-bin.tar.gz
mv apace-maven-3.3.3 /usr/local/apache-maven
sudo mv /ode-common/maven-env.sh /etc/profile.d/maven.sh
source /etc/profile.d/maven.sh