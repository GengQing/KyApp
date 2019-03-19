#!/usr/bin/env bash

var=$(ls -t)

app="application"


for logFile in ${var} ; do
    echo "${logFile}"


    if [[ ${logFile} =~ ${app} ]]; then
        lastFile=${logFile}
    else
        lastFile=${logFile}
    fi
done

echo "last=${lastFile}"




stringZ=abcABC123ABCabc
#       |------|
#       12345678

echo `expr match "$stringZ" 'abc[A-Z]*.2'`   # 8
echo `expr "$stringZ" : 'abc[A-Z]*.2'`       # 8

echo ${stringZ:0}

