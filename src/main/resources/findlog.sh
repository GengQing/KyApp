#!/usr/bin/env bash

var=$(ls -t)

app="application"

lastFile=""

for logFile in ${var} ; do
    echo "${logFile}"

    if [[ ${logFile} =~ ${app} ]]; then
        lastFile=$(echo "${logFile}")
    else
        echo "not math"
        lastFile=$(echo "${logFile}")
    fi
done

echo "last=${lastFile}"


