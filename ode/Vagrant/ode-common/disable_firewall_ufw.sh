set -e       # Exit script on error
#set -x      # Print commands and arguments

echo "Disabling firewall"
sudo service ufw stop