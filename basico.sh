#!/bin/sh
#SUBIDA AUTOMATICA A GIT DE REPOSITORIO
# Git.sh
#
# Uso: ./git.sh
#
# Original: http://sekika.github.io/2016/06/06/github-many-files/
#
# Sin acentos*
# Registros
AddLog="/dev/null"
CommitLog="/dev/null"
PushLog="/dev/null"

# Mensaje
message=$@
if [ -z "$message" ]; then
message="$(date)2022-11-08 EMPEZANDO CLOUD/KAFKA"
fi

git add .
git add *
git add -A

echo "Haciendo commit                \r\c"
echo  "$message"
git commit -am "$message" 1>>$CommitLog 2>>$CommitLog; git push 1>>$PushLog 2>>$PushLog

