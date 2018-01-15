#/bin/bash

EDASPID=`ps -ef | grep 'java .* -jar edas-config-center.jar'|grep -v grep |head -n 1 | awk '{print $2}'`
if [ -z $EDASPID ];
then 
        echo 'Cannot find edas-config-center process.'
else
        kill -9 $EDASPID
        echo 'Edas-config-center has been shutdown successfully.'
fi