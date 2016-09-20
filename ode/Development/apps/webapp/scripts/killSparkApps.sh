sudo kill -9 `ps aux | grep 'SparkSubmit' | awk '{print $2 " " $11}'|grep -v 'grep'|awk '{print $1}'|tr '\n' ' '`
