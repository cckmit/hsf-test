#/bin/bash

#config server ip
SERVER_IP=

JAVA='java'
if [ -z `which java` ]; then
    if [ -z $JAVA_HOME ]; 
        then
            JAVA=$JAVA_HOME/bin/java
        else
            echo 'Cannot find java command and JAVA_HOME.'
    fi
fi 

if [ ! -z `java -version 2>&1 | grep 'java version' | awk '{print $3}' | egrep '1.[6-8].\d*'` ]; then
    nohup $JAVA -Daddress.server.ip=$SERVER_IP -jar edas-config-center.jar >/dev/null 2>&1 &
    echo 'Edas-config-center has been started successfully.'
    echo 'You can see more details in logs/config-center.log.'
else
        echo 'Java version not support, must be 1.6 or 1.6+.'
fi