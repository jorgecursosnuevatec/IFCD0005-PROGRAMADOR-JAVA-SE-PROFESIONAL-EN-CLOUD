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


start=`date +%s`

inicio_ns=`date +%s%N`
inicio=`date +%s`

# Mensaje
message=$@
if [ -z "$message" ]; then
message="$(date)2022-12-20 SUBIDA DESDE CASA"
fi

git add .
git add *
git add -A

echo "Haciendo commit                \r\c"
echo  "$message"
git commit -am "$message" 1>>$CommitLog 2>>$CommitLog; git push 1>>$PushLog 2>>$PushLog



echo "TODO SUBIDO "
git add . 1>>$AddLog 2>>$AddLog
git commit -m "$message" 1>>$CommitLog 2>>$CommitLog; git push 1>>$PushLog 2>>$PushLog

end=`date +%s`

runtime=$((end-start))%M

fin_ns=`date +%s%N`
fin=`date +%s`
let total_ns=$fin_ns-$inicio_ns
let total=$fin-$inicio
let total_min=($total/60)
echo "ha tardado: -$total_ns- nanosegudos, -$total- segundos, -$total_min- minutos  "

echo "Finalizado,hasta luego EJERCICIOS"
