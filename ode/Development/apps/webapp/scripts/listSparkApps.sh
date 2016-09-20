ps aux | grep 'SparkSubmit' | awk '{print $2 " " $11}'|grep -v 'grep'
