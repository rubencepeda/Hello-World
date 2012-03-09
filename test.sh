#!/bin/bash 

if [[ -z "$1" ]] ; then
   echo "$0 requires the first argument to be valid"
   exit 1
fi
echo "Hello world: $1"
