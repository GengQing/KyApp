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


